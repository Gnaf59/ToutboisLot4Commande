/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import fr.gauthier_matthieu.beans.Commande;
import fr.gauthier_matthieu.beans.Fournisseur;
import java.util.List;

/**
 *
 * @author gauthier
 */
public interface CommandeDAO {
    
    List<Commande>listeCommande();
    void nouvelleCommande();
    
}
