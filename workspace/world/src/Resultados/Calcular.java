package Resultados;
import worldF.*;
public class Calcular extends IntroducirNumeros{

	public static void main(String[] args)
	{
		IntroducirNumeros in=new IntroducirNumeros();
		
		new Sumar(in.x,in.i).suma();
		new Restar(in.x,in.i).resta();
		new Dividir(in.x,in.i).divide();
		new Multiplicar (in.x,in.i).multiplica();
		
	}
}
