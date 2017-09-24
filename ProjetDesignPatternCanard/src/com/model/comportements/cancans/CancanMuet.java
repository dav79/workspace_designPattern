/**
 * 
 */
package com.model.comportements.cancans;

import com.model.interfaces.ComportementCancan;

/**
 * Cette famille de canrd ne cancannent pas
 * @author PC
 *
 */
public class CancanMuet implements ComportementCancan {

	/**
	 * Comportement d'un cancannement muet pour cette famille de canrd
	 */
	@Override
	public void cancaner() {
		System.out.println("Silence");
	}

}
