/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */
@Entity
public class LigneCommandeProduit {
    @EmbeddedId
    private LigneCommandeProduitkey id;
    private int quantite;
    
    @JoinColumn(name = "produit_id", insertable = false, updatable = false)
    @ManyToOne
    private Produit produit;
    
    @JoinColumn(name = "commande_id", insertable = false, updatable = false)
    @ManyToOne
    private Commande commande;

    public LigneCommandeProduit() {
    }

    public LigneCommandeProduit(LigneCommandeProduitkey id, int quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public LigneCommandeProduit(int quantite, Produit produit, Commande commande) {
        LigneCommandeProduitkey id = new LigneCommandeProduitkey(produit.getId(),commande.getId());
        this.id = id;
        this.quantite = quantite;
        this.produit = produit;
        this.commande = commande;
    }

    public LigneCommandeProduitkey getId() {
        return id;
    }

    public void setId(LigneCommandeProduitkey id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    

       
}
