package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        int contador;
        int I;
        System.out.println("ingrese un numero");
        numero=teclado.nextInt();

        contador = 0;

        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }

        if(contador <= 2)
        {
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" no es primo");
        }

    }
}