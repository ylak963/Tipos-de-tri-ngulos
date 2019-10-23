package es.studium.TiposTriangulo;

import java.util.Scanner;

public class TiposTriangulo {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer lado del tri�ngulo:");
		a= teclado.nextInt();
		System.out.println("Introduce el segundo lado del tri�ngulo:");
		b= teclado.nextInt();
		System.out.println("Introduce el tercer lado del tri�ngulo:");
		c= teclado.nextInt();
		
		if(a==b && b==c) 
		{
			System.out.println("Es un tipo de tri�ngulo equil�tero.");
		}
		if((a==b && b!=c) || (a!=b && b==c) || (a==c &&b!=c)) 
		{
			System.out.println("Es un tipo de tri�ngulo isosceles");
		}
		if((a!=b) && (b!=c) & (a!=c)) 
		{
			System.out.println("Es un tipo de tri�ngulo escaleno");
		}
		teclado.close();
	}

}
