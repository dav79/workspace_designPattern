/**
 * 
 */
package com.app.simulateur;

import com.model.canard.Canard;
import com.model.canard.Colvert;
import com.model.canard.PrototypeCanard;
import com.model.comportements.vols.PropulsionAReaction;

/**
 * Class de simulation pour exécuter le projet Canard
 * @author PC
 *
 */
public class MiniSimulateur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instancier un Colbert
		Canard colvert = new Colvert();
		
		//Effectuer un cancannement 
		colvert.effectuerCancan();
		
		//Effectuer un vol
		colvert.effectuerVol();
		
		//Afficher le type de canard 
		colvert.afficher();
		
		//Instancier un PrototypeCanard 
		Canard proto = new PrototypeCanard();
		
		//Effectuer un vol 
		proto.effectuerVol();
		
		
		
		//Changer le comportement 
		proto.setComportementVol(new PropulsionAReaction());
		
		//Effectuer un vol 
		proto.effectuerVol();
		
	}

}
