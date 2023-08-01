package br.edu.ifgoiano.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifgoiano.entidade.Usuario;

public class UsuarioRepositorio {
	
	
	private Connection  getConnection() throws SQLException {
		return DriverManager.
				getConnection("jdbc:h2:~/usuariodb", "sa", "sa");
	}
	
	public static Connection conn;
	public List<Usuario> ListarUsuarios(){
		List<Usuario> lstUsuarios = new ArrayList<Usuario>();
		
		String sql = "select id, nome,  email, senha, data_nacimento from usuario";
	try ( Connection conn = this.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);){
		
			ResultSet resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("id"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setSenha(resultSet.getString("senha"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setDataNascimento(resultSet.getDate("data_nascimento"));
				
				lstUsuarios.add(usuario);
			}
		} catch (Exception e) {
			System.out.println("erro na consulta");
			e.printStackTrace();
		}
			return lstUsuarios;
	}
	
	public void inserirUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		 //criar a sql de insert 
		 StringBuilder sql = new StringBuilder();
				 sql.append("insert into usuario");
				 sql.append("nome, emal, senha)");
				 sql.append("values(?,?,?)");
		 //abrir uma conexao 
				try(Connection conn = this.getConnection();
				PreparedStatement pst = conn.prepareStatement(sql.toString());
				) {
				pst.execute();	
				
				conn.commit();		 
				} catch (SQLException e) {
				System.out.println("erro na inclusao de usuario");
				e.printStackTrace();
				}
		 
		 //preparar a sql para ser executada
		 
		 //executar
	}

}