public class Exo4
{public static void main(String args[])
 {int a, b;
 b = (int)(Math.random() * 99 + 1);
 System.out.println("Entré un nombe");
 a = Lire.i();
 while(a != b){
	if(a < b){
		System.out.println("C'est plus.\nSaisir un nouveau nombre");
		a = Lire.i();
		}
	else{
		System.out.println("C'est moins\nSaisir un nouveau nombre");
		a = Lire.i();
		}
	}
 System.out.println("Gagné");
 }
}
