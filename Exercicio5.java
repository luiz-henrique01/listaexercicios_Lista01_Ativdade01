//Faça um Programa que converta metros para centímetros.


import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
    
   //Declaracao variaveis
    double metros;
    double resultado;  
    System.out.print("Digite o valor em Metros:");

   //Entradas de dados
    Scanner input = new Scanner(System.in);
    metros = input.nextDouble();
    input.close();
  
    
   //Converter metros em centimetros
    resultado = metros * 100;

    System.out.println("O valor em centímetros é: " +resultado);

    }

}