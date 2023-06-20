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

@WebServlet("/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	// simulando bd
	private List<Usuario> lstDeUsuario;

	@Override
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<Usuario>();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");

		// Verificar senhas
		if (senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);
			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			
			lstDeUsuario.add(usu);
			// Redirecionar senhas
			resp.sendRedirect("index.html");
		} else {
			// Redirecionar o usuario para a mesma pagina de cadrasto do usuario
			req.getRequestDispatcher("usuarioCadrasto.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		req.setAttribute("usuarios", repositorio.ListarUsuarios());
		req.getRequestDispatcher("usuarioListar.jsp").forward(req, resp);

	}

	@Override
	public void destroy() {
		this.lstDeUsuario.clear();
	}

}
