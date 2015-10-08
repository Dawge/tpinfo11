public class Dessin2{
 public static void main(String argv[]){
	int nbetoile,test,nbespace,tmp,stk;
	System.out.println("Saisir le nombre d'étoile (nombre impair)");
	nbetoile = Lire.i();
	test = nbetoile % 2;
	if(test == 0)
		System.out.println("Nombre pair entré. Entré un nombre impair");	else{
		nbespace = nbetoile / 2;
		test = nbespace;
		while(test != 0){
			System.out.print(" ");
			test--;
			}
		System.out.print("*");
		stk = 1;
		test = nbespace;
		while(test != 0){
			System.out.print(" ");
			test--;
			}
		test = nbetoile;
		System.out.print("  ");
		while(test != 0){
			System.out.print("*");
			test--;		
			}
		System.out.print("\n");
		
		stk++;
		nbespace--;
		test = nbespace 
		}
	}
}
	
			
