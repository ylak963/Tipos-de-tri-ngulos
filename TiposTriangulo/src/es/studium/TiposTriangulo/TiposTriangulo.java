package es.studium.TiposTriangulo;

import java.util.Scanner;

public class TiposTriangulo {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer lado del triángulo:");
		a= teclado.nextInt();
		System.out.println("Introduce el segundo lado del triángulo:");
		b= teclado.nextInt();
		System.out.println("Introduce el tercer lado del triángulo:");
		c= teclado.nextInt();
		
		if(a==b && b==c) 
		{
			System.out.println("Es un tipo de triángulo equilátero.");
		}
		if((a==b && b!=c) || (a!=b && b==c) || (a==c &&b!=c)) 
		{
			System.out.println("Es un tipo de triángulo isosceles");
		}
		if((a!=b) && (b!=c) & (a!=c)) 
		{
			System.out.println("Es un tipo de triángulo escaleno");
		}
		teclado.close();
	}

}
