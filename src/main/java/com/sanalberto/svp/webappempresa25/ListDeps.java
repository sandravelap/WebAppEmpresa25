package com.sanalberto.svp.webappempresa25;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import services.DepartamentoService;

@WebServlet(name = "helloServlet", value = "/listDepsServlet")
public class ListDeps extends HttpServlet {
    private String message;
    private DepartamentoService departamentoService = new DepartamentoService();
    ArrayList<String> deps;
    public void init() {
        message = "Lista departamentos";
        deps = departamentoService.listarDepartamentos();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        for (String dep : deps) {
            out.println("<p>" + dep + "</p>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}