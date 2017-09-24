/**
 * 
 */
package com.model.canard;

import com.model.interfaces.ComportementCancan;
import com.model.interfaces.ComportementVol;

/**
 * Classe abstraite représentant les canard
 * @author PC
 *
 */
public abstract class Canard {
	//Comportement des canards qui peuvent voler 
	protected ComportementVol comportementVol;
	
	//Comportement des canards qui peuvent cancanner 
	protected ComportementCancan comportementCancan;
	
	//Afficher les informations d'un canard, définit dans les sous classes
	abstract public void afficher();
	
	
	public void effectuerVol(){
		comportementVol.voler();
	}
	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	
	public void nager(){
		System.out.println("Tous les canards flottent même les leurres");
	}
	
	/**
	 * Setter le comportement vol d'un carnard 
	 * @param cv
	 */
	public  void setComportementVol(ComportementVol cv){
		this.comportementVol = cv;
	}
	
	/**
	 * Setter le comportement Cancan d'un canard
	 * @param cc
	 */
	public void setComportementCancan(ComportementCancan cc){
		this.comportementCancan = cc;
	}
}
