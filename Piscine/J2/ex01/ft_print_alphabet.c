#include <stdio.h>

void	ft_putchar(char c)
{
	write(1, &c, 1);
}

int	main(void)
{
	char c;
	c = 'z';
	while(c >= 'a')
	{
		ft_putchar(c);
		c--;
	}
	ft_putchar('\n');
	return(0);
}
