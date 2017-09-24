/**
 * 
 */
package com.model.comportements.cancans;

import com.model.interfaces.ComportementCancan;

/**
 * Cette famille de canards cancanne avec un cri spéciale
 * @author PC
 *
 */
public class Coincoin implements ComportementCancan {

	@Override
	public void cancaner() {
		System.out.println("Coincoin!!");
	}

}
