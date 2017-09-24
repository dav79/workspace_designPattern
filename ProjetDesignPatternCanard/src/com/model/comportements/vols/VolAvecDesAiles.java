/**
 * 
 */
package com.model.comportements.vols;

import com.model.interfaces.ComportementVol;

/**
 * Cette famille de canard peut voler
 * @author PC
 *
 */
public class VolAvecDesAiles implements ComportementVol {

	/**
	 * Comportement vol du canard
	 */
	@Override
	public void voler() {
		System.out.println("Je vole !!");
	}

	

}
