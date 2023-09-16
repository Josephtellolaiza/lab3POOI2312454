package semana05;

public class Ejercicio03
{
	public static void main(String[] args) 
	{
		
		System.out.println("Codigo original (For)");
		
		int x;
		int i;
		
		for (i = 0; i < 10; i++) 
		{
			x = 2 * i - 10;
			
			if (x < 0)
			{
				x = (-1) * x;	
			}
			
			System.out.println(x);
		}
		
		
		// El programa imprime la siguiente sucesión de números:
		// 10 - 8 - 6 - 4 - 2 - 0 - 2 - 4 - 6 - 8
		// Todos son pares, positivos y va uno de ellos por línea
		
		System.out.println("Codigo nuevo (Do while)");
		
		int i1 = -1;
		int x1;
		do
		{
			i1++;
			
			x1 = 2 * i1 - 10;
			
			if (x1 < 0)
			{
				x1 = (-1) * x1;
			}
			
			System.out.println(x1);
		}
		while(i1 < 9);	
	}
}
