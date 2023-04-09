//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class Exercicio10 
{
    public static void main(String[] args)
    {
        //Declaração variaveis
        double C;
        double F;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius");
        C = input.nextDouble();
        input.close();

        //Calculo
        F = ( C * 9/5) + 32 ;

        
        //Resultado
        System.out.println("Graus Fahrenheit: " +F);
        

    }
    
}
