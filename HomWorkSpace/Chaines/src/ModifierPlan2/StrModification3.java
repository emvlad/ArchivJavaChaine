package ModifierPlan2;


public class StrModification3 {

	public static void main(String[] args) {

		String chaine = "La chaine en copie.";
		String chaines = "Enchainement de deux phrases au choix.";
		String ch1, ch2;

		//1-remplacer la premi�re occurence (replaceFirst()).
		ch1 ="ai";
		String chainOccur  = chaine.replaceFirst(ch1, "�");
		System.out.println("\n1-Remplacer la premi�re occurence de la chaine \'" +ch1 + "\' : " + chainOccur);

		//2-remplacer toutes les occurences (replaceAll()).	 	
		ch1 ="i";
		ch2 = "y";
		chaine  = chaine.replaceAll(ch1, ch2);
		System.out.println("\n2-Remplacer toutes les occurences du caract�re \'" +ch1 + "\': " + chaine);

		//3-recevoir un caract�re dans une position exacte (charAt()).
		int pos =1;
		char car = chaine.charAt(pos);
		System.out.println("\n3-Le caract�re re�u � l'index \'" + pos + "\' est: " + car +".");

		//4-recevoir la position d'un caract�re ou d'une chaine � la derni�re occurence (lastIndexOf()).
		String feed ="ye";
		int lastOccur = chaine.lastIndexOf(feed);
		System.out.println("\n4-La position de la derni�re occurence\n du caract�re"
				+ " ou de la chaine \'" + feed + "\'  est: " + lastOccur +".");
		//4.1-la position du char jusqu'� un point pr�cis du caract�re ou de la chaine 
		feed = "e";
		pos=12;

		int lastOccPoint = chaine.lastIndexOf(feed, pos);
		System.out.println("\n4.1-La position de la derni�re occurence\n"
				+ " jusqu'� la position \'" + pos+ "\' "
				+ "du caract�re ou de la chaine \'" + feed + "\' est: " + lastOccPoint +".");

		//5-recevoir la position de la premi�re occurence � partir d'une position
		feed ="a";
		pos =2;

		int firstOccur = chaine.indexOf(feed, pos);
		System.out.println("\n5-La position de la premi�re occurence\n "
				+ "� partir de la position \'" + pos+ "\' "
				+ "du caract�re ou de la chaine \'" + feed + "\' est: "  + firstOccur +".");

		//6-concatenantion		 
		String chaine3 = chaines.concat(chaine);
		System.out.println("\n6-La concat�nation des chaines : " + chaine3);
	
	
		//			
			
		CharSequence s = chaine.subSequence(1, 8) ;
		System.out.println("\n7-Un segment sequentiel de la chaine: " + s);
	}


}
