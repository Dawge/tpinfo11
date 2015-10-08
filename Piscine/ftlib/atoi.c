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

void	ft_putnbr(int nb)
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

int	ft_atoisimple(char c)
{
	int tmp;
	tmp = 0;
	if(c < '0' || c > '9')
		return(0);
	else
	{
		tmp = c - 48;
		ft_putnbr(tmp);
	}
	return(tmp);
}

void	ft_atoi(char *str)
{		
	int i;
	i = 0;
	while(str[i] != '\0')
	{	
		ft_atoisimple(str[i]);
		i++;
	}
	ft_putchar('\n');
}
	
int	main(void)
{
	ft_atoi("42");
	return(0);
}
