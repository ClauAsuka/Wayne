package Resultados;

import java.util.Scanner;

public class IntroducirNumeros {

	float x;
	float i;
	
	public IntroducirNumeros()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un valor: ");
		x=teclado.nextFloat();
		System.out.println("Introduzca un valor: ");
		i=teclado.nextFloat();
		
	}
}
