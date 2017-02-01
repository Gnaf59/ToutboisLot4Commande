/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.DAO;

import fr.gauthier_matthieu.beans.Fournisseur;
import fr.gauthier_matthieu.beans.Produit;
import java.util.Set;

/**
 *
 * @author gauthier
 */
public interface FournisseurDAO {
    
    Set<Produit>listeProduitParFournisseur(int idFournisseur);
    
}
