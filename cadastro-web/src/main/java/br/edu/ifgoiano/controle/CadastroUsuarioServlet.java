package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;

@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");

		// Verificar senhas
		if (senha1.equals(senha2)) {
			Usuario usuario = new Usuario();
			usuario.setNome(req.getParameter("nome"));
			usuario.setEmail(req.getParameter("email"));
			usuario.setSenha(senha1);
			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.inserirUsuario(usuario);
			
			// Redirecionar senhas
			resp.sendRedirect("index.html");
		} else {
			// Redirecionar o usuario para a mesma pagina de cadrasto do usuario
			req.getRequestDispatcher("usuarioCadrasto.jsp").forward(req, resp);
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		req.setAttribute("usuarios", repositorio.ListarUsuarios());
		req.getRequestDispatcher("usuarioListagem.jsp").forward(req, resp);
		
	}

}
