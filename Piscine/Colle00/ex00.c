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

void    ft_putnbr(int nb)
{
        if(nb < 0)
        {
                ft_putchar('-');
                nb = -nb;
        }
        if(nb > 9)
                ft_putnbr(nb / 10);
        ft_putchar((nb % 10) + '0');
}

int     ft_atoisimple(char c)
{
        int tmp;
        tmp = 0;
        if(c < '0' || c > '9')
                return(0);
        else
        {
                tmp = c - 48;
        }
        return(tmp);
}

int    ft_atoi(char *str)
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

void	reste(int longueur)
{
	int i;
	i = 1;
	ft_putchar('|');
	while(i != longueur - 1)
	{
		ft_putchar(' ');
		i++;
	}
	ft_putchar('|');
}

void	out(int longueur)
{
	int i;
	i = 0;
	ft_putchar('o');
	while(i != longueur - 1)
	{
		i++;
		ft_putchar('-');
	}
	ft_putchar('o');
	ft_putchar('\n');	
}	

int	draw(int longueur, int largeur)
{
	int i;
	i = largeur - 1;
	while(i != -1)
	{
		if(i == largeur - 1)
			out(longueur);
		else if (i <= 0)
		{
			out(longueur);
			return(0);
		}
		else if(i < largeur - 1 && i != 0)
		{
			reste(longueur);
			ft_putchar('\n');
		}
		else
			out(longueur);
		i--;
	}
	return(0);
}				
		
int	main(int argc, char **argv)
{
	char *str1;
	char *str2;
	int largeur;
	int longueur;
	str1 = argv[1];
	str2 = argv[2];
	largeur = 0;
	longueur = 0;
	if(argc == 3)
	{
		largeur = ft_atoi(str1);
		longueur = ft_atoi(str2);
		draw(largeur, longueur);
	}
	return(0);
}		
