/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author HP
 */
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @OneToMany(mappedBy = "commande",fetch = FetchType.EAGER)
    private List<LigneCommandeProduit> lignesCommandeProduits;

    public Commande() {
    }

    public Commande(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", date=" + date + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LigneCommandeProduit> getLignesCommandeProduits() {
        return lignesCommandeProduits;
    }

    public void setLignesCommandeProduits(List<LigneCommandeProduit> lignesCommandeProduits) {
        this.lignesCommandeProduits = lignesCommandeProduits;
    }


    
    
    
    
    
}
