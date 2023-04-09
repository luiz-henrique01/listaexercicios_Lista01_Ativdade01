//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class Exercicio9 
{
    public static void main(String[] args)
    {

     //Declaracao variaveis
      double F;
      double C;

     //Entrada de dados
      Scanner input = new Scanner(System.in);
      System.out.println("Digite a temperatura em graus Fahrenheit: ");
      F = input.nextDouble();
      input.close();

     //Transformacao de graus Fahrenheit em Celsius
      C = 5 * ((F-32) / 9);
      System.out.println("Graus Celsius: " +C);

    }
}