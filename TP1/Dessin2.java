public class Dessin2{
 public static void main(String args[]){
	int nbligne, nbetoilefin, nbetoiledebut, nbespace1, nbespace2, test, stk;
	System.out.println("Saisir le nombre de ligne");
	nbligne = Lire.i();
	stk = 1;
	nbetoilefin = nbligne * 2 - 1;
	nbetoiledebut = 1;
	nbespace1 = nbetoilefin / 2;
	nbespace2 = 2;
	test = 0;
	while(stk <= nbligne){
		while(test <= nbespace1){
			System.out.print(" ");
			test++;
			}
		test = 1;
		while(test <= nbetoiledebut){
			System.out.print("*");
			test++;
			}
		test = 0;
		while(test <= nbespace1){
			System.out.print(" ");
			test++;
			}
		test = 0;
		while(test <= nbespace2){
			System.out.print(" ");
			test++;
			}
		test = 1;
		while(test <= nbetoilefin){
			System.out.print("*");
			test++;
			}
		System.out.print('\n');
		nbespace1 = nbespace1 - 1;
		nbespace2 = nbespace2 + 1;
		nbetoiledebut = nbetoiledebut + 2;
		nbetoilefin = nbetoilefin - 2;
		test = 0;
		stk++;
		}
	}
}
