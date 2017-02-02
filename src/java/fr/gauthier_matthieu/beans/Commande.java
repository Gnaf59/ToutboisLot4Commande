/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column( name="id_commande")
    private int id_commande;
    
    @Column( name="dateCommande")
    private LocalDateTime dateCommande;
    
    @Column( name="dateLivraisonCommande")
    private LocalDateTime dateLivraisonCommande;
    
    @Column( name="etatCommande")
    private String etatCommande; 
    
    @OneToMany
    private Set<LigneCommande> ligneCommande = new HashSet<>();
    
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
    
}
