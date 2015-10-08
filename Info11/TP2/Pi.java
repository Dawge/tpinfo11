public class Pi
	{public static void main(String args[])
		{int x;
		System.out.println("Donner une valeur");
		x=Lire.i();
		String a;
		a=(x%2==0?"pair" : "impair");
		System.out.println("Le nombre est "+a);
		}
	}

