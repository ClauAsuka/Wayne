package Resultados;
import worldF.*;
public class Calcular extends IntroducirNumeros{

	public static void main(String[] args)
	{
		IntroducirNumeros in=new IntroducirNumeros();
		
		System.out.println("Suma:");		
		new Sumar(in.x,in.i).suma();
		System.out.println("Resta:");		
		new Restar(in.x,in.i).resta();
		System.out.println("División:");
		new Dividir(in.x,in.i).divide();
		System.out.println("Multiplicación:");
		new Multiplicar (in.x,in.i).multiplica();
		
	}
}
