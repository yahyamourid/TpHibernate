/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.project.test;

import java.util.Date;
import ma.project.entities.Employe;
import ma.project.entities.EmployeTache;
import ma.project.entities.Projet;
import ma.project.entities.Tache;
import ma.project.service.EmployeService;
import ma.project.service.EmployeTacheService;
import ma.project.service.ProjetService;
import ma.project.service.TacheService;
import ma.project.util.HibernateUtil;



/**
 *
 * @author YahyaMrd
 */
public class Test {
    public static void main(String[] args) {
//        EmployeService es = new EmployeService();
//        ProjetService ps = new ProjetService();
//        TacheService ts = new TacheService();
//        EmployeTacheService ets = new EmployeTacheService();
        
        ////L'ajout des employee////
//        es.create(new Employe("Abbasi","Samir","0614264523"));
//        es.create(new Employe("Dahbi","Amal","0634542345"));
//        es.create(new Employe("Baadi","Salim","0645243456"));
//        es.create(new Employe("Abbad","Zakaria","0634567823"));
        
        ////Creation des projets////
//        ps.create(new Projet("Projet1", new Date(122,3,18), new Date(122,8,17), es.getById(1)));
//        ps.create(new Projet("Projet2", new Date(122,4,13), new Date(122,10,12), es.getById(1)));
//        ps.create(new Projet("Projet3", new Date(122,4,11), new Date(122,9,27), es.getById(1)));
//        ps.create(new Projet("Projet4", new Date(122,7,24), new Date(122,11,13), es.getById(2)));
//        ps.create(new Projet("Projet5", new Date(122,8,28), new Date(122,9,10), es.getById(3)));
        
        ////Creation des taches////
//        ts.create(new Tache("Tache1", new Date(122,3,20), new Date(122,6,20),5000 ,ps.getById(1)));
//        ts.create(new Tache("Tache2", new Date(122,4,12), new Date(122,5,21),2000 ,ps.getById(1)));
//        ts.create(new Tache("Tache3", new Date(122,4,22), new Date(122,5,26),900 ,ps.getById(1)));
//        ts.create(new Tache("Tache4", new Date(122,4,16), new Date(122,5,22),850 ,ps.getById(2)));
//        ts.create(new Tache("Tache5", new Date(122,8,1), new Date(122,8,19),3400 ,ps.getById(3)));
//        ts.create(new Tache("Tache6", new Date(122,7,26), new Date(122,8,10),1200 ,ps.getById(4)));
//        ts.create(new Tache("Tache7", new Date(122,9,2), new Date(122,9,19),990 ,ps.getById(5)));
        
        ////Creation des EmployeTache////
//        ets.create(new EmployeTache(new Date(122,3,22), new Date(122,6,19), es.getById(1), ts.getById(1)));
//        ets.create(new EmployeTache(new Date(122,4,13), new Date(122,5,19), es.getById(2), ts.getById(2)));
//        ets.create(new EmployeTache(new Date(122,4,26), new Date(122,5,24), es.getById(4), ts.getById(3)));
//        ets.create(new EmployeTache(new Date(122,4,19), new Date(122,5,20), es.getById(4), ts.getById(4)));
//        ets.create(new EmployeTache(new Date(122,8,3), new Date(122,8,18), es.getById(2), ts.getById(5)));
//        ets.create(new EmployeTache(new Date(122,7,28), new Date(122,8,8), es.getById(3), ts.getById(6)));
//        ets.create(new EmployeTache(new Date(122,9,4), new Date(122,9,18), es.getById(4), ts.getById(7)));
        
        ////Test getEmployeTaches////
//        for(Tache tache : es.getEmployeTaches(es.getById(1))){
//            System.out.println(tache.getNom());
//        }
        
        
        ////Test getEmployeProjets////
//        for(Projet projet : es.getEmployeProjets(es.getById(3))){
//            System.out.println(projet);
//        }
        
        ////Test getProjetTachePlanifiees////
//        for(Tache tache : ps.getProjetTachesPlanifier(ps.getById(1))){
//            System.out.println(tache.getId() + "  " + tache.getNom());
//        }
        
        ////Test getProjetTachesRealisees////
//        ps.getProjetTachesRealisees(ps.getById(2));
        
        ////Test getTacheSupAPrix////
//        for(Tache tache : ts.getTacheSupAPrix(1000)){
//            System.out.println(tache.getNom() + " : " + tache.getPrix() + " DH");
//        }
        
        
        System.out.println(new Date("12/04/2023"));
    
    }
    
}
