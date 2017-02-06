/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import javax.persistence.*;



/**
 *
 * @author Matthieu
 */
@Entity
@Table (name="commandes")
public class Commande implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="id_commande")
    private int id_commande;
    
    @Column( name="dateCommande")
    private LocalDateTime dateCommande;
    
    @Column( name="dateLivraisonCommande")
    private LocalDateTime dateLivraisonCommande;
    
    @ManyToOne @JoinColumn(name="id_EtatCommande", unique=true)
    private EtatCommande etatCommande; 
    
    @OneToMany @JoinColumn(name="id_commandeLigneCommande")
    private Set<LigneCommande> ligneCommande ;
    
    @ManyToOne @JoinColumn(name="idFournisseur", unique=true)
    private Fournisseur fournisseur;
    
    
    
    


    public String getDateCommandeString()
    {
        String dateFormatted;
        try{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");       
        dateFormatted = dateCommande.format(formatter);
        }
        catch(NullPointerException e)
        {
            dateFormatted = "";
        }
        
        return dateFormatted;
    }
    
    public String getDateLivraisonCommandeString()
    {
        String dateFormatted;
        try{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        dateFormatted = dateLivraisonCommande.format(formatter);
        }
        catch(NullPointerException e)
        {
            dateFormatted = "";
        }
        return dateFormatted;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }


    public EtatCommande getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(EtatCommande etatCommande) {
        this.etatCommande = etatCommande;
    }

    public Set<LigneCommande> getLigneCommande() {
        return ligneCommande;
    }

    public void setLigneCommande(Set<LigneCommande> ligneCommande) {
        this.ligneCommande = ligneCommande;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
 
    
    
    @Override
    public String toString()
    {
        return id_commande+" "+getDateCommandeString();
    }
}
