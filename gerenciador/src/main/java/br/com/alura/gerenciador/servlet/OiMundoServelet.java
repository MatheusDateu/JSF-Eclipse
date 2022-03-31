package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServelet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		
		PrintWriter out = arg1.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi, mundo, parabens! Voce escreveu seu primeiro Servlets");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Carregado com sucesso!");
	}

}
