package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;
import fr.adaming.model.Compte;
import fr.adaming.model.CompteCourant;
import fr.adaming.model.CompteEpargne;

public interface ICompteService {
	/**
	 * 
	 * @param numero
	 *            le numéro de compte
	 * @return le compte correspondant
	 */
	public Compte getCompteCourantByNumero(int numero);

	public Compte getCompteEpargneByNumero(int numero);

	/**
	 * 
	 * @param client
	 * @return
	 */
	public List<CompteCourant> getCompteCourantByClient(Client client);

	/**
	 * 
	 * @param client
	 * @return
	 */
	public List<CompteEpargne> getEpargneByClient(Client client);

	/**
	 * 
	 * @param compteC
	 * @return
	 */
	public int ajouterCompteC(CompteCourant compteC);

	/**
	 * 
	 * @param compteC
	 * @return
	 */
	public int modifierCompteC(CompteCourant compteC);

	/**
	 * 
	 * @param compte
	 * @return
	 */
	public int supprimerCompteC(CompteCourant compteC);

	/**
	 * 
	 * @param compteC
	 * @return
	 */
	public int ajouterCompteE(CompteEpargne compteE);

	/**
	 * 
	 * @param compteC
	 * @return
	 */
	public int modifierCompteE(CompteEpargne compteE);

	/**
	 * 
	 * @param compte
	 * @return
	 */
	public int supprimerCompteE(CompteEpargne compteE);
}