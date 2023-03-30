package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//req pega o index 
//resp envia para o html entre a chave "soma"

@WebServlet("/soma")
public class atend extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String n1 = req.getParameter("numero1");
		String n2 = req.getParameter("numero2");
		
	float soma = Float.parseFloat(n1) +  Float.parseFloat(n2);
	System.out.println(soma);
	
	String htmlSoma = new String();
	htmlSoma = "<html><body><h1> A soma é "+ soma+" <h1/><body/> <html/>";
	
	PrintWriter objeto = resp.getWriter();
	objeto.println(htmlSoma);
	
	}
	
}

