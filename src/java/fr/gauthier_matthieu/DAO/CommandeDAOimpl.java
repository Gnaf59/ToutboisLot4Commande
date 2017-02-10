/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import fr.gauthier_matthieu.beans.Commande;
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
    private List<Commande> resultat=null;
    
    public CommandeDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    
    
    @Override
    public List<Commande> listeCommande() {
        
        
        try
        {
            session=sessionFactory.openSession();
        
            tx=session.beginTransaction();
        
            resultat=session.createQuery("from Commande WHERE idFournisseur IS NOT NULL").list();
        
            tx.commit();
        }
        catch(Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();
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
