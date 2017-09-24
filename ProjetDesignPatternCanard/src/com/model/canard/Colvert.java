package com.model.canard;

import com.model.comportements.cancans.Cancan;
import com.model.comportements.vols.VolAvecDesAiles;

public class Colvert extends Canard {

	
	
	public Colvert(){
		comportementVol = new VolAvecDesAiles();
		comportementCancan = new Cancan();
	}
	@Override
	public void afficher() {
		System.out.println("Je suis un vrai Colvert");
	}

}
