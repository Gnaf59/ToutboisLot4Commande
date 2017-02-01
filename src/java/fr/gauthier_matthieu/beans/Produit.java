/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import javax.persistence.*;

/**
 *
 * @author Matthieu
 */

@Entity
@Table (name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column( name="codeProduit")
    private int codeProduit;
    
    @Column( name="libelleProduit")
    private String libelleProduit;
    
    @Column( name="quantite")
    private int stock;
    
    @Column( name="prixProduit")
    private Double prixProduit;
    
    @Column( name="remiseProduit")
    private Float remiseProduit;
    
    @Column( name="descriptionProduit")
    private String descriptionProduit;
    
    @Column( name="lienImageProduit")
    private String lienImageProduit;
    
    @Column( name="tvaProduit")
    private int tvaProduit;
    
    @Column( name="typeProduit")
    private int typeProduit;

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Float getRemiseProduit() {
        return remiseProduit;
    }

    public void setRemiseProduit(Float remiseProduit) {
        this.remiseProduit = remiseProduit;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public String getLienImageProduit() {
        return lienImageProduit;
    }

    public void setLienImageProduit(String lienImageProduit) {
        this.lienImageProduit = lienImageProduit;
    }

    public int getTvaProduit() {
        return tvaProduit;
    }

    public void setTvaProduit(int tvaProduit) {
        this.tvaProduit = tvaProduit;
    }

    public int getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(int typeProduit) {
        this.typeProduit = typeProduit;
    }
    
    

}
