public class Ex03
{public static void main(String argv[]){
	int jour;
	jour = Lire.i();
	if(jour >= 1 && jour <= 5){
		switch(jour){
			case(1):System.out.println("Lundi");break;
			case(2):System.out.println("Mardi");break;
			case(3):System.out.println("Mercredi");break;
			case(4):System.out.println("Jeudi");break;
			case(5):System.out.println("Vendredi");break;
			default:System.out.println("Erreur");
		}
	}
	else
		System.out.println("Erreur de jour");
	}
}
