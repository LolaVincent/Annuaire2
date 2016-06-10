/**
 * Annuaire.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface Annuaire extends java.rmi.Remote {
    public beans.Annonce affichageAnnonce(int id) throws java.rmi.RemoteException;
    public void creationAnnonce(int categorie_id, java.lang.String nom, java.lang.String adresse, java.lang.String numero) throws java.rmi.RemoteException;
    public beans.Categorie[] affichageCategories() throws java.rmi.RemoteException;
    public beans.Annonce[] affichageAnnonces() throws java.rmi.RemoteException;
    public beans.Categorie affichageCategorie(int id) throws java.rmi.RemoteException;
    public beans.Annonce[] affichageAnnonceCategorie(java.lang.String sujet) throws java.rmi.RemoteException;
    public void modificationCategorie(java.lang.String sujet, int id) throws java.rmi.RemoteException;
    public beans.Annonce[] affichageAnnonceAdresse(java.lang.String adresse) throws java.rmi.RemoteException;
    public void creationCategorie(java.lang.String categorie) throws java.rmi.RemoteException;
    public void suppressionCategorie(int id) throws java.rmi.RemoteException;
    public beans.Annonce[] affichageAnnonceNom(java.lang.String nom) throws java.rmi.RemoteException;
    public void modificationAnnonce(int categorie_id, java.lang.String nom, java.lang.String adresse, java.lang.String numero, int annonce_id) throws java.rmi.RemoteException;
    public void suppressionAnnonce(int id) throws java.rmi.RemoteException;
}
