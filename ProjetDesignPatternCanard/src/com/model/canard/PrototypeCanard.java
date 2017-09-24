package com.model.canard;

import com.model.comportements.cancans.Cancan;
import com.model.comportements.vols.NePasVoler;

/**
 * Classe Prototype d'un canard 
 * @author PC
 *
 */
public class PrototypeCanard extends Canard {

	
	/**
	 * Constructeur par défaut sans paramètres
	 */
	public PrototypeCanard(){
		comportementVol = new NePasVoler();
		comportementCancan = new Cancan();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis un vrai prototype canard");
	}

}
