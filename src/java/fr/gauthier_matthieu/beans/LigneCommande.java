/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Matthieu, Gauthier
 */

@Entity
@Table (name="contenir")
public class LigneCommande implements Serializable {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "codeProduit_contenir")
    private Produit produit;
    
    @Column( name="quantite")
    private int quantite;


    public double calculTva() {
        return produit.getTvaProduit() *quantite *produit.getPrixProduit() / 100;

    }

    public double calculTotalCommandeTTC() {
        return produit.getPrixProduit() * quantite * (1 + (produit.getTvaProduit() / 100));

    }

    public double calculTotalCommandeHT() {
        return produit.getPrixProduit()*quantite;
    }

}
