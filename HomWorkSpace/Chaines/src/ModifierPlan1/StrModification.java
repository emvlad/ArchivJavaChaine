package ModifierPlan1;

import java.util.StringJoiner;

public class StrModification {

	public static void main(String[] args) {

		//char car1 = '8';
		char car2 = 'A';
		char car3 = 'c';
		//		char carVide=' ';
		//		boolean confirm = false;
		String prenom = "Harold";
		String nom = "Joseph";
		String midName ="Adams";
		int age = 86;
		String motdePasse;
		String mots;

		String infos="Ceci est un commentaire sur une chaine";
		String info="Voici une chaine sans commentaire";
		int agent =10;

		char[] tabCar = {'B','o','n'};

		ChangePoint chng = new ChangePoint();

		String leBon = new String (tabCar);
		System.out.println("\nLe "+ leBon  + "-jour du travail...");

		//1-class-intern
		sortiePlusSemiColon("Jean", "Lavall�e", "1980");
		JoinPlusSemiColonne("Jacques", "Lamontagne", "1976");

		//2-class-extern
		ChangePoint.JoinSemiClou("Richard", "Lestatic", "2008");
		chng.SortieSemiClou("Michelle", "Objel", "2020");

		//3-longueur d'une chaine
		int lgChaine = infos.length();
		System.out.println("\n La chaine <" + infos + "> dispose de : " + lgChaine + " caract�res.");

		//4-Augmenter la longueur d'une chaine
		agentSizeChains(infos, agent);
		chng.augmentSizeChains(info, agent);

		//5-changer(modifier) un caract�re avec une position dans une chaine
		changerCar(info, 'U', 6);
		ChangePoint.changerCar(info, 'C', 10);

		//5.1- attacher un morceau de chaine dans une chaine
		AttachChar(info, " petite", 9 );
		chng.AttachChar(info, " grande", 9);

		//6-Effacer un caract�re dans une position exacte - Error
		try {
			delCharPosX(info,36);
		} catch (Exception e) {
			System.out.println("\nERROR: Vous ne devez pas d�passer la longueur de la chaine!");
		}
		//6.1-Effacer un caract�re dans une position exacte
		try {
			delCharPosX(info,32);
		} catch (Exception e) {
			System.out.println("\nVous avez d�passez la longueur de la chaine");
		}

		try {
			delCharPosXY(info,16,33);
		} catch (Exception e) {
			System.out.println("\nVous avez d�passez la longueur de la chaine");
		}


		try {
			remplaceXY(info," bien remplac�e.",16,33);
		} catch (Exception e) {
			System.out.println("\nVous avez d�passez la longueur de la chaine");
		}

		try {
			ChangePoint.remplaceXY(info," avec contenu remplac�.",16,33);
		} catch (Exception e) {
			System.out.println("\nVous avez d�passez la longueur de la chaine");
		}

		ChainEndajouter(info, " avec une queue ajout�e.");
		chng.colEndChaine(info,  " avec une petite queue.");

		//7-Former une chaine avec d'autres chaines
		mots = formChaine(prenom, midName, nom, age);
		System.out.println("\nLe mot form� est : " + mots);

		String mot = ChangePoint.formChaine(nom, midName, prenom, age);
		System.out.println("\nUn mot form� : " + mot);

		//8-Inverser des carcteres dans une chaine
		inversMot(mot) ;
		ChangePoint.reversMot(mots);

		//9-Construire un mot de passe avec plusieurs chaines
		motdePasse= passWordBld(nom, prenom, midName, age);
		System.out.println("\nVotre password est : " + motdePasse);

		motdePasse =chng.passWordBld(nom,midName, prenom,  age);
		System.out.println("\nVotre nouveau password est : " + motdePasse);

		//10-changer caract�res majuscule et minuscule
		System.out.println("\nMajuscule en mimuscule : "
				+ car2 + "=>" + Character.toLowerCase(car2)  );

		//11- changer caract�res Minuscule en majuscule
		char temp = Character.toUpperCase(car3) ;
		System.out.println("\nMinuscule en majuscule : "
				+ car3 + "=>" + temp  );

		ChangePoint.MajuscEnMinuscule(car2);//statique
		chng.MinuscEnMajuscule(car3);//non statique

		//12- Convertir une valeur en nombre entier
		valConvertEntier(car3);
		ChangePoint.valConvertEntier(car2);

		//13- remplacer les espaces par un point virgule
		EspPointVirg(infos);
		ChangePoint.EspPointVirg(info);
		EspPointDiez(infos);



	}//fin application

	//========================================================================
	//================= Les m�thodes priv�es statiques ==============	
	//========================================================================

	//1-Enter les donn�es s�par�es par un semi-colonne
	private static void sortiePlusSemiColon(String chaine1, String chaine2, String chaine3) {

		//a) create tempObject string-joiner
		StringJoiner strjTemp = new StringJoiner(":","[", "]");

		//b) ajouter des chaines
		strjTemp.add(chaine1)
		.add(chaine2)
		.add(chaine3);

		//c) pr�parer la sortie des chaines
		String strData = strjTemp.toString();
		System.out.println("\n Sortie R�ussie avec semi-colonne : " + strData +".");

	}	
	//1.1-Enter les donn�es s�par�es par un semi-colonne
	private static void JoinPlusSemiColonne(String chaine1, String chaine2, String chaine3)  {

		//create tempObject string-joiner
		String strjFinale = String.join(":",chaine1,chaine2,chaine3);
		//print-out
		System.out.println("\n Join R�ussi avec semi-colonne : (" + strjFinale + ").");

	}

	//2- Augmenter la longueur d'une chaine
	private static void agentSizeChains (String info, int agent) {

		//a) cr�er un nouveau string-builder
		StringBuilder tmpBuildChain = new StringBuilder(info);	
		int sizInfo = info.length() ;

		//b) changer la taille de la chaine
		tmpBuildChain.setLength(sizInfo + agent);

		//c) pr�parer la sortie des chaines
		info = tmpBuildChain.toString();

		System.out.println("\n La taille initiale de la chaine est : " + sizInfo
				+ "\n La taille devient: " + info.length()
				+ "\n Elle a augment� de : " + agent + ".");

	}

	//3- Changer(modifier) un caract�re dans une position exacte
	private static void changerCar (String infoCar,char c, int position) {

		//a)cr�er un tempo string-builder pour l'infoChaine
		StringBuilder tempo = new StringBuilder(infoCar);

		//changer le caract�re � la position
		tempo.setCharAt(position, c );

		//b)pr�parer la sortie
		infoCar = tempo.toString();
		//c)sortie
		System.out.println("\nUn caract�re est chang� : " + infoCar );

	}

	//3.1- Attacher une valeur dans une position exacte
	private static void AttachChar (String infoCar,String attach, int position) {

		//a)cr�er un tempo string-builder pour l'infoChaine
		StringBuilder tempo = new StringBuilder(infoCar);

		//changer le caract�re � la position
		tempo.insert(position, attach );

		//b)pr�parer la sortie
		infoCar = tempo.toString();
		//c)sortie
		System.out.println("\nUne valeur est attach�e dans la chaine : " + infoCar );

	}

	//4-Effacer un caract�re dans une position exacte
	private static void delCharPosX (String info,int posX) {

		//cr�er un tempo string-builder pour l'infoChaine
		StringBuilder tempo = new StringBuilder(info);
		tempo.deleteCharAt(posX);
		info = tempo.toString();
		System.out.println("\nUn caract�re est effac� : " + info);
	}

	//4.1- Effacer un carcat�re d'une position � une autre
	private static void delCharPosXY (String info,int posX, int posY) {
		StringBuffer tempo = new StringBuffer(info);
		tempo.delete(posX, posY);
		info = tempo.toString();
		System.out.println("\nUn bloc de la chaine est effac� avec Builder or Buffer :" + info);
	}

	//5-Remplacer des caracteres d'une position � une autre
	private static void remplaceXY(String info, String reserve, int posX,int posY) {
		StringBuilder remplacer = new StringBuilder(info);
		remplacer.replace(posX, posY, reserve);
		info =	remplacer.toString();
		System.out.println("\nUn bloc de la chaine est remplac� :" + info);

	}

	//6- Ajouter une chaine � la fin d'une chaine
	private static void ChainEndajouter (String info, String strEnd) {

		StringBuilder tempo = new StringBuilder(info);
		tempo.append(strEnd);
		info = tempo.toString();
		System.out.println("\nUne chaine est ajout�e � la fin :" + info);
	}

	//7-Former une chaine avec d'autres chaines
	private static String formChaine(String ch1, String ch2,String ch3,int age) {

		String chaineF = null ;
		StringBuilder bldChaine = new StringBuilder();
		bldChaine.append(ch1)
		.append(ch2)
		.append(ch3)
		.append(age);

		chaineF = bldChaine.toString();

		return chaineF;


	}
	//8-Inverser des carcteres dans une chaine
	private static void inversMot(String mot) {
		StringBuilder tempMot = new StringBuilder(mot);
		tempMot.reverse();
		mot = tempMot.toString();
		System.out.println("\nLe revers de la chaine n'est pas un palindrome: " + mot);
	}

	//9- Construire un mot de passe avec plusieurs chaines
	private static String passWordBld (String ch1,String ch2,String ch3,int age) {

		String passWord = null;

		StringBuilder passwordTemp = new StringBuilder();
		passwordTemp.append(Character.toLowerCase(ch1.charAt(0)));
		passwordTemp.append(Character.toLowerCase(ch2.charAt(0)));
		passwordTemp.append(Character.toUpperCase(ch3.charAt(0)));

		passwordTemp.append(age);

		passWord = passwordTemp.toString();

		return passWord;

	}

	//12- Convertir une valeur en nombre entier
	private static void valConvertEntier(char car) {

		int nbrEntier = Character.getNumericValue(car);
		System.out.println("\nLe nombre ASCII du caract�re [" + car +"] est un entier = " + nbrEntier +".");

	}

	//13- remplacer les espaces par un point virgule

	private static void EspPointVirg(String chaine) {

		String [] tabChaine = chaine.split(" ");
		String tempo = null;


		for (int i = 0; i<tabChaine.length; i++) {

			tempo = String.join(";", tabChaine[0],tabChaine[1], tabChaine[2]
					,tabChaine[3],tabChaine[4],tabChaine[5],tabChaine[6]);

		}
		chaine = tempo.toString();

		System.out.println("\nRemplacer espace par point virgule: " + chaine );

	}

	private static void EspPointDiez(String chaine) {

		String [] tabChaine = chaine.split(" ");
		StringJoiner tempo = null ;


		for (int i = 0; i<tabChaine.length; i++) {
			
			tempo = new StringJoiner("#");
			tempo.add(tabChaine[0]);
			tempo.add(tabChaine[1]);
			tempo.add(tabChaine[2]);
			tempo.add(tabChaine[3]);


		}
		chaine = tempo.toString();

		System.out.println("\nRemplacer espace par Diez: " + chaine );

	}


}



