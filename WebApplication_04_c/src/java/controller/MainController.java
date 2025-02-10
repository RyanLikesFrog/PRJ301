/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {
    
    public boolean isValidLogin(String username, String password){
        return username.equals("admin") && password.equals("12345678");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //ko nhap username & password
            // do dai cua password >= 8
            String username = request.getParameter("txtUser");
            String password = request.getParameter("txtPassword");

            if (username.trim().length() == 0) {
                out.println("Username cannot be blank!");
                return;
            }

            if (password.trim().length() == 0) {
                out.println("Password cannot be blank!");
                return;
            }

            if (username.trim().length() < 3) {
                out.println("Username must be 3 or more characters.");
                return;
            }

            if (password.trim().length() < 8) {
                out.println("Password must be 8 or more characters.");
                return;
            }
            //Login Process
            if (isValidLogin(username, password)) {
                //page transmitting
                RequestDispatcher rd= request.getRequestDispatcher("search.html");
                rd.forward(request, response);
            }else{
                //RequestDispatcher rd = request.getRequestDispatcher("invalid.html");
               // rd.forward(request, response);
                response.sendRedirect("invalid.html");
            }
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
