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
	
	public List<Usuario> ListarUsuarios(){
		List<Usuario> lstUsuarios = new ArrayList<Usuario>();
		
		String sql = "select id, nome,  email, senha, data_nascimento from usuario";
	try ( Connection conn = this.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);){
		
			ResultSet resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("id"));
				usuario.setNome(resultSet.getString("Nome"));
				usuario.setSenha(resultSet.getString("Senha"));
				usuario.setEmail(resultSet.getString("Email"));
				usuario.setDataNascimento(resultSet.getDate("data_nascimento"));
				
				lstUsuarios.add(usuario);
			}
		} catch (Exception ex) {
			System.out.println("erro na consulta");
			ex.printStackTrace();
		}
			return lstUsuarios;
	}
	
	public void inserirUsuario(Usuario usuario) {
		
		 StringBuilder sql = new StringBuilder();
				 sql.append("insert into usuario ");
				 sql.append("(Nome, Email, Senha) ");
				 sql.append("values(?,?,?)");
		  
				try(Connection conn = this.getConnection();		
				PreparedStatement pst = conn.prepareStatement(sql.toString());){
					
				pst.setString(1, usuario.getNome());
				pst.setString(2, usuario.getEmail());
				pst.setString(3, usuario.getSenha());
				 
				pst.execute();	
				
				conn.commit();		 
				} catch (SQLException e) {
				System.out.println("erro na inclusao de usuario");
				e.printStackTrace();
				}
		}
	


public Usuario obterUsuario (Integer id) {
	String sql = "select nome,  email, senha from usuario where id = ?";
	try ( Connection conn = this.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);){
		    pst.setInt(1, id);
		    
			ResultSet resultSet = pst.executeQuery();
			
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(id);
				usuario.setNome(resultSet.getString("Nome"));
				usuario.setSenha(resultSet.getString("Senha"));
				usuario.setEmail(resultSet.getString("Email"));

				
				return usuario;
			}
		} catch (Exception ex) {
			System.out.println("erro na consulta");
			ex.printStackTrace();
		}
		 throw new RuntimeException("Usuario nao encontrado");
	}

public void alterarUsuario(Usuario usuario) {
	
	 StringBuilder sql = new StringBuilder();
	 sql.append("update usuario set ");
	 sql.append("nome = ?, ");
	 sql.append("email = ?, ");
	 sql.append("senha = ? ");
	 sql.append("where id = ? ");

	try(Connection conn = this.getConnection();		
	PreparedStatement pst = conn.prepareStatement(sql.toString());){
		
	pst.setString(1, usuario.getNome());
	pst.setString(2, usuario.getEmail());
	pst.setString(3, usuario.getSenha());
	pst.setInt(4, usuario.getId());
	 
	pst.execute();	
	
	conn.commit();		 
	
	} catch (SQLException e) {
	System.out.println("erro na alteraçao de usuario");
	e.printStackTrace();
	}
}
	
}
	