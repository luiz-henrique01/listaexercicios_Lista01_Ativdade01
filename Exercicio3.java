//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;


public class Exercicio3 
{
    public static void main(String[] args)
    {
      //Declaração variaveis 
      double raio;
      double area; 

      //Entrada de dados
      Scanner input = new Scanner(System.in);
      System.out.println("Informe o raio do círculo: ");
      raio = input.nextDouble();
      input.close(); 

      //Calculo
      area = Math.pow(raio, 2) * 3.14; 
        

      //Resultado
      System.out.println("A área do círculo é: " +area);  


    }



}
