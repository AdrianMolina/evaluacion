package evaluacion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class bisiestoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Bisiesto b = new Bisiesto();
		String anio = request.getParameter("anio");
		response.getWriter().println(b.mostrarAnio(Integer.parseInt(anio)));
		response.getWriter().println(b.esBisiesto(Integer.parseInt(anio)));
	}
}
