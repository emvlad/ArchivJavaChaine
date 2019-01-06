package ServerWebClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  @author Chrisphonte Emmanuel Vladimir et Chevry Philippe
 * Le port de connexion est: 8085 - 
 * useful: http://localhost:8085/accueil.html
 * Le dossier siteHTTP contient 3 fichiers HTML nomm�s:
 * Accueil.html, Contact.html et Formulaire.html
 * 
 */
public class ServeurSocket {

	public static void main(String a[]) throws Exception {

		final int httpo = 8085; // port
		Socket transmitSocket = null; // voie de transfert Server-Client
		ServerSocket endpointSocket = null; // voie communication-serveur

		try {

			// cr�er la voie de communication-serveur sur le port(8085)
			endpointSocket = new ServerSocket(httpo);

			// accepter les transferts entre serveur et client perpetuellement.

			while (true) {

				transmitSocket = endpointSocket.accept();

				new ThreadStandBy(transmitSocket).start();
				System.out.println("Transferts Sever-Client accept�s");
			}
		}

		catch (IOException e) {
			System.out.print("Erreur Client" + e.getMessage());
		} finally {
			try {

				// fermer la voie communication Server
				if (endpointSocket != null)
					endpointSocket.close();

				// fermer la voie des transferts Server-Client
				if (transmitSocket != null)
					transmitSocket.close();

			} catch (IOException e) {
				System.out.println("Erreur !" + e.getMessage());
			}
		}
	}
}
