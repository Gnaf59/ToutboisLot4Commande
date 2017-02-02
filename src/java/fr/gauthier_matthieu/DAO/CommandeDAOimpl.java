/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import fr.gauthier_matthieu.beans.Fournisseur;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gauthier
 */
public class CommandeDAOimpl implements CommandeDAO{
    
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction tx =null;
    private List<Fournisseur> resultat=new ArrayList<>();
    
    public CommandeDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    
    
    @Override
    public List<Fournisseur> listeCommande() {
        
        
        try
        {
            session=sessionFactory.openSession();
        
            tx=session.beginTransaction();
        
            resultat=session.createQuery("from Fournisseur").list();
        
            tx.commit();
        }
        catch(Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();
            System.out.println(ex);
            System.out.println("fr.gauthier_matthieu.DAO.CommandeDAOimpl.listeCommande()");
        }
        finally
        {
            session.close();
        }
        
        
        return resultat;
    }

    @Override
    public void nouvelleCommande() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
