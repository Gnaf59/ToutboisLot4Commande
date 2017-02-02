/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gauthier_matthieu.beans;

import javax.persistence.*;


/**
 *
 * @author gauthier
 */
@Entity
@Table (name="type_produit")
public class TypeProduit {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="Id_typeProduit")
    private int id_TypeProduit;
    
    @Column( name="libelleTypeProduit")
    private String libelleTypeProduit;

    public String getLibelleTypeProduit() {
        return libelleTypeProduit;
    }
    
}
