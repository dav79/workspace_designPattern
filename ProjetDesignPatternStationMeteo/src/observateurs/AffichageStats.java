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
public class AffichageStats implements Observateur, Affichage {
	private DonneesMeteo donneeMeteo;
	private float tempMin;
	private float tempMax;
	private float pression;
	
	/**
	 * Constructeur avec param�tre
	 * @param donnesMeteo
	 */
	public AffichageStats(DonneesMeteo donnesMeteo){
		this.donneeMeteo = donnesMeteo;
		//Brancher l'observateur au Suijet
		this.donneeMeteo.enregistrerObservateur(this);
	}
	
	@Override
	public void actualiser(float temperature,float humidite, float pression) {
		
		afficher();
	}

	@Override
	public void afficher() {
		System.out.println("Pression atmosph�rique :" + pression);
	}

	
}
