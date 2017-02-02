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
@Table (name = "fournisseur", schema = "toutboistest")
public class Fournisseur implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column( name="idFournisseur")
    private int idFournisseur;
    
    @Column( name="nomEntrepriseFournisseur")
    private String nomEntrepriseFournisseur;
    
    @Column( name="siretFournisseur")
    private String siretFournisseur;
    
    @Column( name="nomContactFournisseur")
    private String nomContactFournisseur;
    
    @Column( name="prenomContactFournisseur")
    private String prenomContactFournisseur;
    
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
    private String numeroTelephoneFournisseur;
    
    @Column( name="paysFournisseur")
    private String paysFournisseur;
    
    @Column( name="codePostalFournisseur")
    private String codePostalFournisseur;

    @Override
    public String toString()
    {
        return nomEntrepriseFournisseur;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNomEntrepriseFournisseur() {
        return nomEntrepriseFournisseur;
    }

    public void setNomEntrepriseFournisseur(String nomEntrepriseFournisseur) {
        this.nomEntrepriseFournisseur = nomEntrepriseFournisseur;
    }

    public String getSiretFournisseur() {
        return siretFournisseur;
    }

    public void setSiretFournisseur(String siretFournisseur) {
        this.siretFournisseur = siretFournisseur;
    }

    public String getNomContactFournisseur() {
        return nomContactFournisseur;
    }

    public void setNomContactFournisseur(String nomContactFournisseur) {
        this.nomContactFournisseur = nomContactFournisseur;
    }

    public String getPrenomContactFournisseur() {
        return prenomContactFournisseur;
    }

    public void setPrenomContactFournisseur(String prenomContactFournisseur) {
        this.prenomContactFournisseur = prenomContactFournisseur;
    }

    public int getNumVoieFournisseur() {
        return numVoieFournisseur;
    }

    public void setNumVoieFournisseur(int numVoieFournisseur) {
        this.numVoieFournisseur = numVoieFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public String getComplementAdresseFournisseur() {
        return complementAdresseFournisseur;
    }

    public void setComplementAdresseFournisseur(String complementAdresseFournisseur) {
        this.complementAdresseFournisseur = complementAdresseFournisseur;
    }

    public String getVilleFournisseur() {
        return villeFournisseur;
    }

    public void setVilleFournisseur(String villeFournisseur) {
        this.villeFournisseur = villeFournisseur;
    }

    public String getMailFournisseur() {
        return mailFournisseur;
    }

    public void setMailFournisseur(String mailFournisseur) {
        this.mailFournisseur = mailFournisseur;
    }

    public String getNumeroTelephoneFournisseur() {
        return numeroTelephoneFournisseur;
    }

    public void setNumeroTelephoneFournisseur(String numeroTelephoneFournisseur) {
        this.numeroTelephoneFournisseur = numeroTelephoneFournisseur;
    }

    public String getPaysFournisseur() {
        return paysFournisseur;
    }

    public void setPaysFournisseur(String paysFournisseur) {
        this.paysFournisseur = paysFournisseur;
    }

    public String getCodePostalFournisseur() {
        return codePostalFournisseur;
    }

    public void setCodePostalFournisseur(String codePostalFournisseur) {
        this.codePostalFournisseur = codePostalFournisseur;
    }
   
}
