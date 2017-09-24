/**
 * 
 */
package com.model.comportements.vols;

import com.model.interfaces.ComportementVol;

/**
 * Cette famille de canards ne peut pas voler
 * @author PC
 *
 */
public class NePasVoler implements ComportementVol{

	/**
	 * Comportement vol n'est appliqué pour ce type de canard
	 */
	@Override
	public void voler() {
		// TODO Auto-generated method stub
		System.out.println("Je ne sais pas voler");
	}

}
