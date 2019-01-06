package ServerWebClient;

import java.net.Socket;


/*
 *  @author Chrisphonte Emmanuel Vladimir et Chevry Philippe
 */
public class ThreadStandBy extends Thread {

	private Socket transmitSocket;

	public ThreadStandBy(Socket transmitSocket) {
		this.transmitSocket = transmitSocket;
	}

	@Override
	public void run() {

		
		// relier les transferts du client
		LiaisonClient liaisonClient = new LiaisonClient(transmitSocket);
		// saisir une entête
		String fileName = liaisonClient.getHeader();

		// Répondre au client
		liaisonClient.echoServer(fileName);

		// fermer le débit des transferts
		liaisonClient.closeDebit();

	}

}
