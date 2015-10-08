public class Ex03
{public static void main(String args[])
	{int i, stk, nb1, nb2, nb3, nb4, nb5, nb6, num1, num2, num3, num4, num5, num6;
	 System.out.println("Saisir 6 numeros compris entre 1 et 49");
	 nb1 = Lire.i();
	 if((nb1 >= 50) || (nb1 < 1)){
	 	System.out.println("Numéros en dehors des limites, saisir un nouveau nombre");
		while((nb1 >= 50) || (nb1 < 1)){
			nb1 = Lire.i();
		}
	 }
	 nb2 = Lire.i();
	 if(((nb2 == nb1) && (nb2 > 50)) || (nb2 < 1)){
		System.out.println("Numéros identiques ou en dehors des limites, saisir un nouveau nombre");
		while((nb2 == nb1) || (nb2 >= 50) || (nb2 < 1)){
			nb2 = Lire.i();
		}
	 }
	 nb3 = Lire.i();
	 if(((nb3 == nb2 )|| (nb3 == nb1)) && ((nb3 >= 50) || (nb3 < 1))){
		System.out.println("Numéros identiques ou en dehors des limites, saisir un nouveau nombre");
		while((nb3 == nb2) || (nb3 == nb1) || (nb3 >= 50) || (nb3 < 1)){
			nb3 = Lire.i();
		}
	 }	
	 nb4 = Lire.i();
	 if(((nb4 == nb3) || (nb4 == nb2) || (nb4 == nb1)) && ((nb4 > 50) || (nb4 < 1))){
		System.out.println("Numéros identiques ou en dehors des limites, saisir un nouveau nombre");
		while((nb4 == nb3) || (nb4 == nb2) || (nb4 == nb1)){
			nb4 = Lire.i();
		}
	 }
	 nb5 = Lire.i();
	 if(((nb5 == nb4) || (nb5 == nb3) || (nb5 == nb2) || (nb5 == nb1)) && ((nb5 >= 50) || (nb5 < 1))){
		System.out.println("Numéros identiques ou en dehors des limites, saisir un nouveau nombre");
		while((nb5 == nb4) || (nb5 == nb3) || (nb5 == nb2) || (nb5 == nb1) || (nb5 >= 50) || (nb5 < 1)){
			nb5 = Lire.i();
		}
	 }
	 nb6 = Lire.i();
	 if(((nb6 == nb5) || (nb6 == nb4) || (nb6 == nb3) || (nb6 == nb2) || (nb6 == nb1)) && ((nb5 >= 50) || (nb5 < 1)){
		System.out.println("Numéros identiques ou en dehors des limites, saisir un nouveau nombre");
		while((nb6 == nb5) || (nb6 == nb4) || (nb6 == nb3) || (nb6 == nb2) || (nb6 == nb1) || (nb6 >= 50) ||| (nb6 < 1){
			nb6 = Lire.i();
		}
	 }
	}
}
