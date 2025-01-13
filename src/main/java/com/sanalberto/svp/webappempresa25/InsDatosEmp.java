package com.sanalberto.svp.webappempresa25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="InsDatosEmp",value="/FormDatosEmp")
public class InsDatosEmp extends HttpServlet {

    private String message;
    public void init() {
        message = "Introduce los datos del nuevo empleado";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("</body></html>");
    }
    public void destroy() {
    }
}
