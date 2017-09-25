/**
 * 
 */
package lanceur;

import observateurs.AffichageCondition;
import observateurs.AffichagePression;
import observateurs.AffichageStats;
import sujets.DonneesMeteo;

/**
 * Classe de lancement du programme
 * @author PC
 *
 */
public class StationMeteo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		
		AffichageCondition affichageCondition = new AffichageCondition(donneesMeteo);
	//	AffichageStats affichageStat = new AffichageStats(donnesMeteo);
	//	AffichagePression affichagePression = new AffichagePression(donnesMeteo);
		
		donneesMeteo.setMesures(26, 70, 1020);
		
	}

}
