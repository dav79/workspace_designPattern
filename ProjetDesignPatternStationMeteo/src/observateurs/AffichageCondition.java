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
public class AffichageCondition implements Observateur, Affichage {
	private DonneesMeteo donneeMeteo;
	private float temperature;
	private float humidite;
	
	/**
	 * Constructeur avec paramétre
	 * @param donnesMeteo
	 */
	public AffichageCondition(DonneesMeteo donnesMeteo){
		this.donneeMeteo = donnesMeteo;
		//Brancher l'observateur au Suijet
		this.donneeMeteo.enregistrerObservateur(this);
	}
	
	@Override
	public void actualiser(float temperature,float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	@Override
	public void afficher() {
		System.out.println("Température actuelle en dégré Celsus :" + temperature + " et  " + humidite + " % d'humidité.");
	}

	
}
