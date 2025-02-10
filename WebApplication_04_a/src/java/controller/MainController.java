/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
    public int GCD(int a, int b){
        int min = Math.min(a, b);
        for(int i = min; i >= 1; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String textA = request.getParameter("txtA");
        String textB = request.getParameter("txtB");

        // Check input
        if (textA == null || textA.trim().length() == 0) {
            out.println("Missing input A.");
            return;
        }

        if (textB == null || textB.trim().length() == 0) {
            out.println("Missing input B.");
            return;
        }
        // Check value
        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(textA);
            b = Integer.parseInt(textB);
            //Check a and b > 0
            if (a <= 0) {
                out.println("A must be greater than 0!");
                return;
            }
            if (b <= 0) {
                out.println("B must be greater than 0!");
                return;
            }
        } catch (Exception e) {
            out.println("A and B must be Integers!");
            return;
        }
        
        //Output result;
        int result = GCD(a, b);
        out.println("Greatest Common Divisor of ( " + a + " & " + b + " ): " + result);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
