package VerifierPlan1;

public class StringVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "   Maisons  ";
		String str = "     ";
		//1-V�rifier la terminaison d'une chaine (boolean endsWith()).

		String strCheck =str.trim();
		String ending ="son";
		String starting = "M";
		String contient ="ai";


		//1-V�rifier que la chaine n'est pas vide (boolean isEmpty()).
		if(!strCheck.isEmpty()) {

			System.out.println("1-La chaine n'est pas vide");

			//si le premier test est v�rifi� - continuer avec la condition imbriqu�e
			//1.1-V�rifier la terminaison de la chaine (boolean endsWith()).
			if(strCheck.endsWith(ending)) {

				System.out.println("1.1-La chaine se termine par : \'" + ending + "\'");

				//si le deuxi�me test est v�rifi�, continuer...
				//continuit� ou imbriqu�e les conditions suivantes lorsque les premiers choix sont valid�es. 

				//1.2-V�rifier des valeurs dans le contenu de la chaine (boolean contains()).
				if(strCheck.contains(contient)) {
					System.out.println("\n1.2- Elle contient aussi les caract�res: \'" + contient +"\'");

					System.out.println("2.2- Pas besoin d'autres alternatifs ! ");
				}//fin contenu

			}//fin terminaison


			//2-alternatif ou d'autres options seulement � d�faut des premiers choix
			//2.1-V�rifier le d�but de la chaine (boolean startsWith()).

			else if(strCheck.startsWith(starting)) {
				System.out.println("2.1-La chaine commence par : \'" + starting + "\'");
				System.out.println("1.3-La chaine ne se termine par : \'" + ending + "\'");
			}
			else {
				System.out.println("--ERRORS!- TOUS LES TESTS ONT �CHOU�.");
			}

		} //fin vide

		//en cas d'�chec de la premi�re condition (test initial a �chou�).
		else {
			System.out.println("1-La chaine est vide - test initial a �chou�. ");
		}

		//3- Comparer deux chaines p3, p4:
		//3.1- Les chaines sont de m�me contenu (valeur) - equals()
		
		
		//3.1.1- Les chaines sont de m�me contenu (valeur) - equalsIgnoreCase()
		
		

		//3.2- Les chaines sont de m�me ordre ASCCI (grandeur) - CompareTo()
		
		
		
		//3.2.1- Les chaines sont de m�me ordre ASCCI (grandeur) - CompareToIgnoreCase().


		
		
		//4-debugging your codes
		
		
	}//fin main method



}//fin class
