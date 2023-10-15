/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.test;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import ma.project.entities.Categorie;
import ma.project.entities.Commande;
import ma.project.entities.LigneCommandeProduit;
import ma.project.entities.Produit;
import ma.project.service.CategorieService;
import ma.project.service.CommandeService;
import ma.project.service.LigneCommandeProduitService;
import ma.project.service.ProduitService;
import ma.project.util.HibernateUtil;

/**
 *
 * @author HP
 */
public class Test {

    public static void main(String[] args) {
//        CategorieService cs = new CategorieService();
//        CommandeService cms = new CommandeService();
//        ProduitService ps = new ProduitService();
//        LigneCommandeProduitService ls = new LigneCommandeProduitService();

//        HibernateUtil.getSessionFactory();
        ////creation des categories////
//        Categorie c1 = new Categorie("AES1","Cat1");
//        Categorie c2 = new Categorie("ART2","Cat2");
//        Categorie c3 = new Categorie("APQ3","Cat3");
//        cs.create(c1);
//        cs.create(c2);
//        cs.create(c3);
        ///Creation des produits///
//        Categorie c1 = cs.getById(1);
//        Categorie c2 = cs.getById(2);
//        Categorie c3 = cs.getById(3);
//        Produit p1 = new Produit("WT64",100,c1);
//        Produit p2 = new Produit("AB36",184,c1);
//        Produit p3 = new Produit("WE74",536,c1);
//        Produit p4 = new Produit("XJ32",97,c2);
//        Produit p5 = new Produit("QP83",63,c2);
//        Produit p6 = new Produit("AD09",52,c3);
//        ps.create(p1);
//        ps.create(p2);
//        ps.create(p3);
//        ps.create(p4);
//        ps.create(p5);
//        ps.create(p6);
        ///Creation des commandes///
//        cms.create(new Commande(new Date(123,3,19)));
//        cms.create(new Commande(new Date(123,8,14)));
//        cms.create(new Commande(new Date(123,11,24)));
//        cms.create(new Commande(new Date(123,2,12)));
//        cms.create(new Commande(new Date(123,6,1)));     
//        Commande c1=cms.getById(1);
//        LigneCommandeProduit l1 = new LigneCommandeProduit(4, ps.getById(1), c1);
//        LigneCommandeProduit l2 = new LigneCommandeProduit(3, ps.getById(2), c1);
//        LigneCommandeProduit l3 = new LigneCommandeProduit(16, ps.getById(3), c1);
//        LigneCommandeProduit l4 = new LigneCommandeProduit(1, ps.getById(4), c1);
//        ls.create(l1);
//        ls.create(l2);
//        ls.create(l3);
//        ls.create(l4);
//        System.out.println(c1.getLignesCommandeProduits());
        ///Test liste des produits par categorie///
//        Categorie c1 = cs.getById(1);
//        for (Produit produit : ps.getProduitsByCategorie(c1)) {
//            System.err.println(produit);
//        }
        ///Test commande entre deux dates///
//        for(Commande commande : cms.getCommandeByDates(new Date(123,2,1),  new Date(123,6,30))){
//            System.err.println(commande);   
//        }
        ///Test de la methode getproduitCommandes///
//        cms.getproduitCommandes(cms.getById(1));
        ///requete nomee///
//        for (Produit produit : ps.getProduitsPrixSuperieur(100)) {
//
//            System.out.println(produit);
//        }
        System.out.println(new Date("12/04/2023"));
    }

}
