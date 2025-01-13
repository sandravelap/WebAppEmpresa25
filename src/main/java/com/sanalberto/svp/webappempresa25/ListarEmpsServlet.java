package com.sanalberto.svp.webappempresa25;

import dto.EmpleadoDTO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.EmpleadoServices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="ListarEmpsServlet", value ="/listaEmpleados")
public class ListarEmpsServlet extends HttpServlet {

    //definimos las variables donde almacenamos la info
    private String message;
    private ArrayList<EmpleadoDTO> empleados;
    private EmpleadoServices empleadoServices = new EmpleadoServices();
    //método inicial
    public void init() {
        message = "Lista de empleados";
        empleados = empleadoServices.listarEmpleados();
    }
    //cuando se llama a la url desde el link en la web se realiza un httpRequest con método get:
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //definimos el tipo de respuesta:
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><link rel=\"stylesheet\" href=\"styles/listaEmps.css\"></head><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Apellido</th>");
        out.println("<th>Oficio</th>");
        out.println("<th>Salario</th></tr>");
        out.println("<th>Departamento</th></tr>");
        out.println("<th>Director</th></tr>");
        for (EmpleadoDTO empleado : empleados) {
            out.println("<tr>");
            out.println("<td>"+empleado.getApellido() + "</td>");
            out.println("<td>"+empleado.getOficio() + "</td>");
            out.println("<td>"+empleado.getSalario() + "</td>");
            out.println("<td>"+empleado.getNombreDep()   + "</td>");
            out.println("<td>"+empleado.getApeDir()+ "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }
    public void destroy() {}
}
