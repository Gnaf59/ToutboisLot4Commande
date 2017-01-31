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
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codeProduit")
    private int codeProduit;
    @Column(name="libelleProduit")
    private String libelleProduit;
    @Column(name="stockProduit")
    private int stock;
    @Column(name="prixUnitaireProduit")
    private Double prixProduit;
    @Column(name="remiseProduit")
    private Float remiseProduit;
    @Column(name="description")
    private String descriptionProduit;
    @Column(name="Image")
    private String lienImageProduit;
    @Column(name="id_TVA")
    private int tvaProduit;
    @Column(name="Id_typeProduit")
    private int typeProduit;
    @OneToMany
    private Fournisseur fournisseur;

    public Produit() {
        super();
    }

    public Produit(int codeProduit, String libelleProduit, int stock, 
            Double prixProduit, Float remiseProduit, String descriptionProduit,
            String lienImageProduit, int tvaProduit, int typeProduit, 
            Fournisseur fournisseur) {
        
        
        this.codeProduit = codeProduit;
        this.libelleProduit = libelleProduit;
        this.stock = stock;
        this.prixProduit = prixProduit;
        this.remiseProduit = remiseProduit;
        this.descriptionProduit = descriptionProduit;
        this.lienImageProduit = lienImageProduit;
        this.tvaProduit = tvaProduit;
        this.typeProduit = typeProduit;
        this.fournisseur = fournisseur;
    }
    
    
    
    
    
    
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
