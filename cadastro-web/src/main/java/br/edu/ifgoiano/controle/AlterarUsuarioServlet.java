package br.edu.ifgoiano.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;

@WebServlet("/alterarUsuario")
public class AlterarUsuarioServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));

		UsuarioRepositorio repositorio = new UsuarioRepositorio();

		Usuario usuario = repositorio.obterUsuario(id);

		req.setAttribute("usuario", usuario);
		req.getRequestDispatcher("/usuarioAlterar.jsp").forward(req, resp);

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");

		// Verificar senhas
		if (senha1.equals(senha2)) {
			Usuario usuario = new Usuario();
			usuario.setId(Integer.valueOf(req.getParameter("id")));
			usuario.setNome(req.getParameter("nome"));
			usuario.setEmail(req.getParameter("email"));
			usuario.setSenha(senha1);

			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.alterarUsuario(usuario);

			// Redirecionar senhas
			resp.sendRedirect("cadastrarUsuario");
		} else {
			String msg = "As senhas nao sao iguais";
			req.setAttribute("mensagem", msg);
			// Redirecionar o usuario para a mesma pagina de cadrasto do usuario
			req.getRequestDispatcher("usuarioAlterar.jsp").forward(req, resp);
		}
	}

}
