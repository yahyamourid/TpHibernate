/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.project.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author YahyaMrd
 */

@Embeddable
public class LigneCommandeProduitkey implements Serializable{
    
    private int produit_id;
    
    private int commande_id;

    public LigneCommandeProduitkey() {
    }

    public LigneCommandeProduitkey(int produit_id, int commande_id) {
        this.produit_id = produit_id;
        this.commande_id = commande_id;
    }

    public int getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(int produit_id) {
        this.produit_id = produit_id;
    }

    public int getCommande_id() {
        return commande_id;
    }

    public void setCommande_id(int commande_id) {
        this.commande_id = commande_id;
    }

}
