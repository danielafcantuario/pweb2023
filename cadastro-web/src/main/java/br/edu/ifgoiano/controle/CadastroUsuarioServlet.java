package br.edu.ifgoiano.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");

		//Verificar senhas
		if(senha1.equals(senha2)) {
			//Redirecionar senhas 
			resp.sendRedirect("index.html");
		}else {
			//Redirecionar o usuario para a mesma pagina de cadrasto do usuario
			req.getRequestDispatcher("cadastroUsuario.html").forward(req, resp);
		}

	}
}
