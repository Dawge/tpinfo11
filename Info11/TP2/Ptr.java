public class Ptr
{public static void main(String args[])
	{double a,b,c,per;
	System.out.println("Donner la valeur de l'hypothénus:");
	a=Lire.d();
	System.out.println("Donner la valeur d'un autre côté:");
	b=Lire.d();
	if(a <= b){
		System.out.println("erreur");
	}
	else{
		c=a*a-b*b;
		c=Math.sqrt(c);
		per=a+b+c;
		System.out.println("Le périmètre de ce triangle vaut"+per);
		}
	}
}


