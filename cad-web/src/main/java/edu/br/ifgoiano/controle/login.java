package edu.br.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sn1 =  req.getParameter("senha");
		
		String sucesso = new String();
		sucesso = "<head> <body><h1> Senha correta </h1></body></head>";
		
		String falha = new String();
		falha = "<head> <body><h1> email ou senha invalidos </h1></body></head>";
		
		if (sn1.equals("1234")) {
			PrintWriter writer = resp.getWriter();
			writer.print(sucesso);	
		}else {
			PrintWriter writer = resp.getWriter();
			writer.print(falha);	
		}
		
	}

}
