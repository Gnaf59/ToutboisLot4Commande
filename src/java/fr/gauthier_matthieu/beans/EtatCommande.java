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
@Table (name="etatcommande")
public class EtatCommande implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column( name="id_EtatCommande")
    private int idEtatCommande;
    
    @Column(name="libelle_EtatCommande")
    private String libelleEtatCommande;
}
