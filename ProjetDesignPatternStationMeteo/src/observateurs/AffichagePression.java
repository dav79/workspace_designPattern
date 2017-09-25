/**
 * 
 */
package observateurs;

import sujets.DonneesMeteo;

/**
 * Classe permettant d'afficher les conditions météo
 * @author PC
 *
 */
public class AffichagePression implements Observateur, Affichage {
	private DonneesMeteo donneeMeteo;
	private float pression;
	
	/**
	 * Constructeur avec paramétre
	 * @param donnesMeteo
	 */
	public AffichagePression(DonneesMeteo donnesMeteo){
		this.donneeMeteo = donnesMeteo;
		//Brancher l'observateur au Suijet
		this.donneeMeteo.enregistrerObservateur(this);
	}
	
	@Override
	public void actualiser(float temperature,float humidite, float pression) {
		this.pression = pression;
		afficher();
	}

	@Override
	public void afficher() {
		System.out.println("Pression atmosphérique :" + pression);
	}

	
}
