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
 * @author gauthier
 */

@Entity
@Table (name="tva")
public class TvaProduit implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="id_TVA")
    private int id_TVA;
    
    @Column( name="tauxTVA")
    private double tauxTVA;

    public double getTauxTVA() {
        return tauxTVA;
    }
    
    
}