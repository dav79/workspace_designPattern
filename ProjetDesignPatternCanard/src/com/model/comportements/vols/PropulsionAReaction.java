/**
 * 
 */
package com.model.comportements.vols;

import com.model.interfaces.ComportementVol;

/**
 * Classe comportement qui simule un réacteur pour les famille de canard qui ne peuvent pas voler
 * @author PC
 *
 */
public class PropulsionAReaction implements ComportementVol{

	/**
	 * Comportement vol n'est appliqué pour ce type de canard
	 */
	@Override
	public void voler() {
		System.out.println("Je vol avec un réacteur");
	}

}
