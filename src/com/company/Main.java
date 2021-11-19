package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Pedir lados
	* Leer lados
	* Calcular semiperímetro ((a+b+c)/2)
	* Calcular área (raíz cuadrada [s(s-a)(s-b)(s-c)])*/
        double a=0, b=0,c=0, s=0, area=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Escriba los 3 lados");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("El área del triángulo es"+" "+area);
    }
}
