/**
 * 
 */
package com.model.comportements.cancans;

import com.model.interfaces.ComportementCancan;

/**
 * Cette famille de canard cancannent normalement
 * @author PC
 *
 */
public class Cancan implements ComportementCancan {

	/**
	 * Comportement du cancannement d'un canard
	 */
	@Override
	public void cancaner() {
		System.out.println("Cancan!!");
	}

}
