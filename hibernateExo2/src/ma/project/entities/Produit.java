/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author HP
 */
@Entity


@NamedQuery(name = "Produit.produitParPrix", query = "FROM Produit p WHERE p.prix > :prix")



public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reference;
    private float prix;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "produit", fetch = FetchType.LAZY)
    private List<LigneCommandeProduit> lignesCommandeProduits;

    public Produit() {
    }

    public Produit(String reference, float prix, Categorie categorie) {
        this.reference = reference;
        this.prix = prix;
        this.categorie = categorie;
    }

    public Produit(String reference, float prix, List<LigneCommandeProduit> lignesCommandeProduits) {
        this.reference = reference;
        this.prix = prix;
        this.lignesCommandeProduits = lignesCommandeProduits;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", reference=" + reference + ", prix=" + prix + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public List<LigneCommandeProduit> getLignesCommandeProduits() {
        return lignesCommandeProduits;
    }

    public void setLignesCommandeProduits(List<LigneCommandeProduit> lignesCommandeProduits) {
        this.lignesCommandeProduits = lignesCommandeProduits;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

}
