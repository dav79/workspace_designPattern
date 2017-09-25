/**
 * 
 */
package observateurs;

import sujets.DonneesMeteo;

/**
 * Classe permettant d'afficher les conditions m�t�o
 * @author PC
 *
 */
public class AffichageCondition implements Observateur, Affichage {
	private DonneesMeteo donneeMeteo;
	private float temperature;
	private float humidite;
	
	/**
	 * Constructeur avec param�tre
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
		System.out.println("Temp�rature actuelle en d�gr� Celsus :" + temperature + " et  " + humidite + " % d'humidit�.");
	}

	
}
