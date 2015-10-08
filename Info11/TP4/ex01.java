public class ex01
{public static void main(String args[])
	{int i, saisie, k;
	 saisie = 0;
	 k = 0;
	 for(i = 0; i < 20; i++){
		 saisie=Lire.i();
		 if(saisie >= 18){
			 k++;
		 }
	 }
	 if(k == 1){
		 System.out.println("Il y a "+k+" adulte");
	 }
	 else if(k == 0){
		 System.out.println("Il n'y aucun adulte");
	 }
	 else{
		 System.out.println("Il y a "+k+" adultes");
	 }
	}
}
		
	
