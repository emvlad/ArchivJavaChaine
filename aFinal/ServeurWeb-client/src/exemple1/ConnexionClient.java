package exemple1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConnexionClient {

	Socket socketCommunication;
	BufferedReader in = null; // le flux d'entr�e de socket

	/**
	 * Ce constructeur construit un objet qui repr�sente une connexion du client �
	 * partir d'une socket d'�change. Il initialise le flux d'entr� du socket.
	 */
	ConnexionClient(Socket socketCommunication) {

		this.socketCommunication = socketCommunication;

		try {
			in = new BufferedReader(new InputStreamReader(this.socketCommunication.getInputStream()));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * cette m�thode r�cup�re la requ�te HTTP se trouvant dans le flux d'entr�e de
	 * la socket et l'affiche � la console
	 */

	void getEntete() {

		String s = null;

		try {
			// lecture de l'ent�te http
			// http est un protocole structur� en lignes
			while ((s = in.readLine()).compareTo("") != 0) {
				System.out.println("re�u: " + s);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * cette m�thode ferme le flux
	 */
	void fermetureFlux() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
