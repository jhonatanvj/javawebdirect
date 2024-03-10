/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Proveedor;

/**
 *
 * @author jhona
 */
public class DirectorioServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente dcliente = new Cliente(LEGACY_DO_HEAD, LEGACY_DO_HEAD, 0, LEGACY_DO_HEAD, 0, LEGACY_DO_HEAD, 0);
        Proveedor dproveedor = new Proveedor(LEGACY_DO_HEAD, LEGACY_DO_HEAD, 0, LEGACY_DO_HEAD, 0, LEGACY_DO_HEAD, LEGACY_DO_HEAD, LEGACY_DO_HEAD); 
        response.setContentType("text/html;charset=UTF-8");
        String[] opcionesSeleccionadas1 = request.getParameterValues("granos");
        String[] opcionesSeleccionadas2 = request.getParameterValues("aseo");
        String[] opcionesSeleccionadas3 = request.getParameterValues("tecnologia");
        String[] opcionesSeleccionadas4 = request.getParameterValues("ropa");
        dcliente.setNombre(request.getParameter("nombre"));
        dcliente.setCelular(Integer.parseInt(request.getParameter("celular")));
        dcliente.setCorreo(request.getParameter("correo"));
        dcliente.setCedula(Integer.parseInt(request.getParameter("cedula")));
        dcliente.setPagomet(request.getParameter("pagomet"));
        dcliente.setNumero(Integer.parseInt(request.getParameter("numero")));
        dcliente.setProducto(request.getParameter("hola"));
        
        //s.setNumero1(Integer.parseInt(request.getParameter("numero1")));
        
        String html = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>COMPLETO</title>"
                + "<link  href=\"estilos2.css\" rel=\"stylesheet\" type=\"text/css\" >"
                + "</head>"
                + "<body>"
                + "<table id=\"tabla1\" style=\"display: block\">"
                + "<tr>"
                + "<td colspan=\"3\">"
                + "<center>"
                + "<h1> Inscrito </h1>"
                + "</center>"
                + "</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Nombre</td>"
                + "<td><div id=\"nombre\">" + dcliente.getNombre() + "</div></td>"
                + "</tr>"
                + "<tr>"
                + "<td>Correo</td>"
                + "<td><div id=\"correo\">" + dcliente.getCorreo() + "</div></td>"
                + "</tr>"
                + "<tr>"
                + "<td>Cedula</td>"
                + "<td><div id=\"cedula\">" + dcliente.getCedula() + "</div></td>"
                + "</tr>"
                + "<tr>"
                + "<td>Producto</td>"
                + "<td><div id=\"producto\">"+dcliente.getProducto()+ "</div></td>"
                + "</tr>"
                + "<tr>"
                + "<td>Celular</td>"
                + "<td><div id=\"celular\">" + dcliente.getCelular() + "</div></td>"
                + "</tr>"
                + "<tr>"
                + "<td>Pago</td>"
                + "<td><div id=\"pagomet\">" +dcliente.getPagomet() + "</div></td>"
                + "<td><div id=\"pago\">"+dcliente.getNumero() + "</div></td>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>";
            
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println(html);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
