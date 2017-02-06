/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.servlets;

import fr.gauthier_matthieu.DAO.CommandeDAO;
import fr.gauthier_matthieu.DAO.DaoFactory;
import fr.gauthier_matthieu.beans.Commande;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gauthier
 */
public class ListeCommande extends HttpServlet {

    private CommandeDAO commandeDAO;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        
        
        
        HttpSession session = request.getSession();
        
        String identifiant = (String) session.getAttribute("login");
        
        if ("admin".equals(identifiant))
        {
            List<Commande> listeCommande = commandeDAO.listeCommande();
            request.setAttribute("commandes", listeCommande);
            request.getRequestDispatcher("/WEB-INF/AfficherCommande.jsp").forward(request, response);
        }
        else
        {
            request.getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
        
        
        
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
        
    }
    
    @Override
    public void init() throws ServletException {
        this.commandeDAO= DaoFactory.getInstance().getCommandeDAO();
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
