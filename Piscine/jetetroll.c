#include <stdio.h>

void ft_putchar(char c)
{
	write(1, &c, 1);
}

void ft_putstr(char *str)
{
	int i;
	while(str[i] != '\0')
	{
		ft_putchar(str[i]);
		i++;
	}
}

int main(void)
{
	int q;
	q = 5;
	while(q != 9)
	{
		ft_putstr("Tu t'ai fais troll ^-^");
		ft_putchar('\n');
	}
	return(0);
}
