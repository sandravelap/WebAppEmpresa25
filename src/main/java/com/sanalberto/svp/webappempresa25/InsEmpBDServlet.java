package com.sanalberto.svp.webappempresa25;

import dto.EmpleadoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.EmpleadoServices;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insertarEmpBD")
@MultipartConfig
public class InsEmpBDServlet extends HttpServlet {
    private String message;
    private EmpleadoServices empleadoServices = new EmpleadoServices();

    public void init() {
        message = "Introduciendo el nuevo empleado";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //cogemos los parámetros de la request para hacer la consulta  a la base de datos
        EmpleadoDTO empleado = new EmpleadoDTO();
        empleado.setIdEmpleado(Integer.parseInt(request.getParameter("idEmp")));
        empleado.setApellido(request.getParameter("apellido"));
        empleado.setOficio(request.getParameter("oficio"));
        empleado.setApeDir(request.getParameter("jefe"));
        empleado.setNombreDep(request.getParameter("nombreDep"));
        message = empleadoServices.insertarEmpleado(empleado);
        response.setContentType("text/plain");
        response.getWriter().write(message);
    }
    public void destroy() {
    }
}
