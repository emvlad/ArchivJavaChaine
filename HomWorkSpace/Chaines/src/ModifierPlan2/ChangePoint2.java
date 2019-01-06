package ModifierPlan2;

public class ChangePoint2 {
	
	
	//1- d�composer chaine en tableau
		public static void chaineTabelau(String chaine) {
			
			String [] tabChaine = chaine.split(" ");
			for(int i = 0; i<tabChaine.length; i++) {
				System.out.print(" " + tabChaine[i]);
			};
			System.out.println("\nTaile de la table(nbre cellules) : " + tabChaine.length);
				
			
		}
		
		//2-Supprimer les espaces dans une chaine
		public void enlevEspaceCh(String chaine) {
			
			String trmChaine = chaine.trim();
			
			System.out.println("\nSans espace dans les extr�mit�s mais contient toujours : \'" + trmChaine + "\'" );
		}
		
		//3-Extraire la partie � droite d'une chaine � partir d'un point fixe
		public static void extrairePortion(String chaine, int indiceDeaprt) {
			
			String portionDrPtFix = chaine.substring(indiceDeaprt);
			System.out.println("\nLa portion extraite de L to R : " + portionDrPtFix);
			
		}
		//3.1-Extraire un segment d'une cahine entre deux points fixes
			public static void extraireSegment(String chaine, int indiceDeaprt, int indiceFin) {
				
				String segmentPtExacts = chaine.substring(indiceDeaprt, indiceFin);
				System.out.println("\nLe segment extrait entre 2 indices : " + segmentPtExacts);
				
			}
			
			//4- Convertir une valeur type double en string
			public static String ChangValenString(Double valDble) {
				
				String convertValeur = String.valueOf(valDble);
				System.out.println("\nLa valeur est maintenant en string : \'" + convertValeur + "\'" );
				
				return convertValeur;
				
				
			}
			//5-Obtenir la position d'un caract�re dans une chaine
			
			public void ObtenirPosChar(String chaine, char carLoc) {
				
				int posCarLoc =0;
				
				posCarLoc = chaine.indexOf(carLoc);
				
				System.out.println("\nLa position pour trouver le caract�re \'"+ carLoc + "\' est : " + posCarLoc);
				
			}
			
			
			//6-Changer une valeur en Double;
			public static Double ChangValenDouble(String strPart) {

				Double dblVal = Double.parseDouble(strPart);

				return dblVal;

			}
			
			
			//7-Copier une chaine � partir des indices d'une table(Static.copyValueOf())
			public static void CopierValTab(char [] tabChar, int indice1, int indice2) {
				
				String strCopier = String.copyValueOf(tabChar, indice1, indice2);
				System.out.println("\nLa chaine construite avec les valeurs copi�es de la table caract�re  est : " + strCopier);

			}
			
			//7.1-Construire une chaine � partir des valeurs des cellules d'une table
			
			public static void CopierValcharTab(char [] tabChar) {
				
				String strCopier = String.copyValueOf(tabChar);
				System.out.println("\n7.1-La chaine construite avec les valeurs copi�es de la table caract�re  est : " + strCopier +".");
				
			}

			//8-Utilistation foreach
		

}
