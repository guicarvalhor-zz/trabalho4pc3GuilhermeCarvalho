package trabalho4pc3GuilhermeCarvalho;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")

public class FormularioServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doPost(req, resp);
	} 
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
	
	String matricula; String nome; String idade; String sexo;
	
	// pegando os valores de vari�veis enviadas do cliente
	matricula = req.getParameter("matricula");
	nome = req.getParameter("nome");
	idade = req.getParameter("idade");
	sexo = req.getParameter("sexo");

	// imprime estes dados no cliente
	out.println("<HTML><HEAD><TITLE>Resposta");
	out.println("</TITLE></HEAD><BODY>");
	out.println("<H1>Resultado do Formul�rio</H1>");
	out.println("<BR><b>Ol� aluno:" + nome + "!</p> <BR>");
	out.print("<BR><b>Sua Matricula:"+ matricula +"!</p><BR>");
	
		if(sexo.equals("feminino")) {
		out.println("Voc� n�o precisa servir ao exercito");
		}else {
			if(idade.compareTo(idade)<=18) {
				out.println("Voc� precisa servir ao ex�rcito.");
			}else {
				out.println("Voc� esta ok com as obriga��es militares.");
			}
		}
		 out.println("<BR></BODY></HTML>");
		out.close();
		}
}
