//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
//litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Exercicio16 
{
    public static void main(String[] args)
    {

     //Declaracao variaveis
      double metrosquadrados;
      double litrostintas;
      double latastintas;
      double total;

     //Entrada de dados
     Scanner input = new Scanner(System.in);
     System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
     metrosquadrados = input.nextDouble();
     input.close();
     
     //Calculo 
     litrostintas = Math.ceil (metrosquadrados / 3);
     latastintas = Math.ceil (litrostintas / 18);
     total = latastintas * 80;

     System.out.println("A quantidade de latas de tintas a serem compradas é: " +latastintas);
     System.out.println("O preço total é de: R$" +total);

    }
    
}