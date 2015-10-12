#include <stdio.h>

void	ft_putchar(char c)
{
	write(1, &c, 1);
}

void	ft_putstr(char *str)
{
	int i;
	i = 0;
	while(str[i] != '\0')
	{
		ft_putchar(str[i]);
		i++;
	}
}

int	ft_atoisimple(char c)
{
	int tmp;
	tmp = 0;
	if(c < '0' || c > '9')
		return(0);
	else
		tmp = c - 48;
	return(tmp);
}

int	ft_atoi(char *str)
{
	int i;
	int stk;
	i = 0;
	while(str[i] != '\0')
	{
		stk = ft_atoisimple(str[i]);
		i++;
	}
	return(stk);
}

void	drawstar(int nbetoile)
{
	int i ;
	i = 0;
	while(i <= nbetoile)
	{
		ft_putchar('*');
		i++;
	}
}

void	drawspace(int nbespace)
{
	int i;
	i = 0;
	while(i <= nbespace)
	{
		ft_putchar(' ');
		i++;
	}
}	

int	compteur(int size)
{
	int i;
	int j;
	int nbetoile;
	int etage;
	i = 0;
	j = 0;
	nbetoile = 1;
	etage = 3;
	while(i < size)
	{
		while(j < etage)
		{
			nbetoile += 2;
			j++;
		}
		nbetoile += 2;
		etage++;
		i++;
	}
	return(nbetoile);
}

void	sastantua(int size)
{
	int i;
	int j;
	int etage;
	int nbetoile;
	int nbespace;
	i = 0;
	j = 0;
	etage = 3;
	nbetoile = 1;
	nbespace = compteur(size) / 2;
	while(i < size)
	{
		j = 0;
		while(j < etage)
		{
			drawspace(nbespace);
			ft_putchar('/');
			drawstar(nbetoile);
			ft_putchar('\\');
			printf("%d etoile et %d espace \n", nbetoile, nbespace);
			ft_putchar('\n');
			nbetoile = nbetoile + 2;
			nbespace--;
			j++;
		}
		nbetoile = nbetoile + 2;
		nbespace--;
		etage++;
		i++;
		printf("%d etoile et %d espace \n", nbetoile, nbespace);
	}
}

int	main(int argc, char **argv)
{
	char *resp;
	int size;
	resp = argv[1];
	size = ft_atoi(resp);
	if(argc == 2)
		sastantua(size);
	else
		return(0);
	return(0);
}
