package sujets;

import observateurs.Observateur;

/**
 * Interface des sujets observables
 * @author PC
 *
 */
public interface Sujet {
	//Enregistrer un observateur à la liste de diffusion
	void enregistrerObservateur(Observateur obs);
	
	//Supprimer un observateur à la liste de diffusion
	void supprimerObservateur(Observateur obs);
	
	//Notifier les observateurs lorsqu'une données de l'objet DonneesMeteo change
	void notifierObservateur();
}
