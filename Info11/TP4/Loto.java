public class Loto
{public static void main(String args[])
	{int i, j, k, x, sit, mini, stk;
	 int tab[] = new int[6];
	 int secondtab[] = new int[7];
	 int newtab[] = new int[7];
	 i = 0;
	 k = 0;
	 sit = 1;
	 while(i <= 5){
		System.out.println("Saisir un numéros compris entre 1 et 49 (il vous reste "+(6-i)+" numéros a saisir)");
		tab[i] = Lire.i();
		if(tab[i] > 49 || tab[i] < 1){
			while(tab[i] > 49 || tab[i] < 1){
				System.out.println("Numéros en dehors des limites, saisir un nouveau nombre");
                        	tab[i] = Lire.i();
                		}
		}
		if(i >= 1){
			j = i;
			do{
				if(tab[i] == tab[j - 1]){
					while(tab[i] == tab[j - 1]){
						System.out.println("Numéros identique, saisir un nouveau nombre");
						tab[i] = Lire.i();
						}
				}
				j--;
			}while(j != 0);
		}
		i++;
	}
	while(k <= 6){
		secondtab[k] = (int)(Math.random() * 49 + 1);
		if(k >= 1){
			x = k;
			do{
				if(secondtab[k] == secondtab[x - 1]){
					while(secondtab[k] == secondtab[x - 1]){
						secondtab[k] = (int)(Math.random() * 49 + 1);
					}
				}
				x--;
			}while(x != 0);
		}
		k++;
	}
	i = 1;
	j = 0;
	k = 0;
	stk = 0;
	mini = secondtab[0];
	while(j <= 5){
		i = 0;
		mini = 50;
		while(i <= 5){
			if(mini > secondtab[i]){
				mini = secondtab[i];
				stk = i;
			}
			i++;
		}
		secondtab[stk] = 50;
		newtab[j] = mini;
		j++;
	}
	System.out.println("Voici le tirage :");
	sit = 1;
	while(sit <= 6){
		System.out.println("le numéro "+sit+" est "+newtab[sit - 1]);
		sit++;
	}
	i = 0;
	j = 0;
	k = 0;
	while(i <= 5){
		j = 0;
		while(j <= 5){
			if(tab[i] == newtab[j]){
				k++;
			}
			j++;
		}
		i++;
	}
	if(k <= 1){
		System.out.println("Vous avez "+k+" bon numéro");
	}
	else{
		System.out.println("Vous avez "+k+" bons numéros");
	}
 }
}
