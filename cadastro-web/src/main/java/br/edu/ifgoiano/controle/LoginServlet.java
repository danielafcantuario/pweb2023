package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 7036815389008473423L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("senha"));
		
		String htmlfalho = new String();
		htmlfalho = "<html><body><h1>falha no login: email e/ou senha incorreta</h1></body></html>";
		
		String htmlsucesso =  new String();		
		htmlsucesso = "<html><body><h1>Login realizado com sucesso!</h1></body></html>";
		
		if (req.getParameter("senha").equals("123456")){
			PrintWriter writer = resp.getWriter();
			writer.println(htmlsucesso);
			
		}else {
			PrintWriter writer = resp.getWriter();
			writer.println(htmlfalho);
		
		}
	}
}


