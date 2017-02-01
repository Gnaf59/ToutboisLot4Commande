/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import org.hibernate.SessionFactory;

/**
 *
 * @author gauthier
 */
public class DaoFactory {
    private SessionFactory sessionFactory;
    
    public DaoFactory() {
        sessionFactory= HibernateUtil.getSessionFactory();
    }
    
    public static DaoFactory getInstance()
    {
        return new DaoFactory();
    }
    
    public CommandeDAO getCommandeDAO()    
    {
        return new CommandeDAOimpl(sessionFactory);
    }
}
