package edu.br.ifgoiano.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cad")
public class cadastro extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1 = req.getParameter("senha1");
		String n2 = req.getParameter("senha2");
		String ema = req.getParameter("email");
		String nome = req.getParameter("nome");
		
		if (!nome.isEmpty() && !ema.isEmpty() && !n1.isEmpty() && !n2.isEmpty() && n1.equals(n2)) {
				resp.sendRedirect("login.html");	
			}else {
				req.getRequestDispatcher("cadastroUsuario.jsp").forward(req, resp);
			}
			
		}

	}


