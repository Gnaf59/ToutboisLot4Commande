/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import fr.gauthier_matthieu.beans.Commande;
import fr.gauthier_matthieu.beans.Fournisseur;
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
    
    public CommandeDAOimpl(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    
    
    @Override
    public List<Fournisseur> listeCommande() {
        
        List<Fournisseur> resultat=null;
        try
        {
            session=sessionFactory.openSession();
        
            tx=session.beginTransaction();
        
            resultat=(List<Fournisseur>) session.createQuery("from Fournisseur").list();
        
            tx.commit();
        }
        catch(Exception ex)
        {
            tx.rollback();
            ex.printStackTrace();
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
