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
	
	
	public UsuarioRepositorio() {
		 try {
			Connection conn = DriverManager.
			            getConnection("jdbc:h2:~/usuariodb", "sa", "sa");
			System.out.print("conexao sucesso");
		} catch (SQLException e) {
			System.out.println("erro  de conexao com o banco de dados");
			e.printStackTrace();
		}
	}
	public static Connection conn;
	public List<Usuario> ListarUsuarios(){
		List<Usuario> lstUsuarios = new ArrayList<Usuario>();
		
		String sql = "select id, nome,  email, senha, data_nacimento from usuario";
	try {
		PreparedStatement pst = conn.prepareStatement(sql);
		
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

}