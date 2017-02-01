/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;


import javax.persistence.*;

/**
 *
 * @author Matthieu, Gauthier
 */

@Entity
@Table (name= "fournisseur")
public class Fournisseur {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column( name="idFournisseur")
    private int idFournisseur;
    
    @Column( name="nomEntrepriseFournisseur")
    private String nomEntreprise;
    
    @Column( name="siretFournisseur")
    private String siretFournisseur;
    
    @Column( name="nomContactFournisseur")
    private String nomContact;
    
    @Column( name="prenomContactFournisseur")
    private String prenomContact;
    
    @Column( name="numVoieFournisseur")
    private int numVoieFournisseur;
    
    @Column( name="adresseFournisseur")
    private String adresseFournisseur;
    
    @Column( name="complementAdresseFournisseur")
    private String complementAdresseFournisseur;
    
    @Column( name="villeFournisseur")
    private String villeFournisseur;
    
    @Column( name="mailFournisseur")
    private String mailFournisseur;
    
    @Column( name="numeroTelephoneFournisseur")
    private String numeroTelephone;
    
    @Column( name="paysFournisseur")
    private String paysFournisseur;
    
    @Column( name="codePostalFournisseur")
    private String codePostalFournisseur;

    @Override
    public String toString()
    {
        return nomEntreprise;
    }
   
}
