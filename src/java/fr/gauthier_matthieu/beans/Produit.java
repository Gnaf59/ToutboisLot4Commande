/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Matthieu
 */

@Entity
@Table (name="produit")
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="codeProduit")
    private int codeProduit;
    
    @Column( name="libelleProduit")
    private String libelleProduit;
    
    @Column( name="stockProduit")
    private int stock;
    
    @Column( name="prixUnitaireProduit")
    private Double prixProduit;
    
    @Column( name="remiseProduit")
    private Float remiseProduit;
    
    @Column( name="description")
    private String descriptionProduit;
    
    @Column( name="Image")
    private String lienImageProduit;
    
    @OneToMany(mappedBy = "produit")
    private Set<LigneCommande> ligneCommande;
    
    @ManyToOne
    @JoinColumn(name = "id_TVA")
    private TvaProduit tvaProduit;
    
    @ManyToOne
    @JoinColumn(name = "Id_typeProduit")
    private TypeProduit typeProduit;

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

    public TvaProduit getTvaProduit() {
        return tvaProduit;
    }

    public void setTvaProduit(TvaProduit tvaProduit) {
        this.tvaProduit = tvaProduit;
    }

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }

   
    
    
    

}
