//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total 
//do seu salário no referido mês.

import java.util.Scanner;

public class Exercicio8
{ 
  public static void main(String[] args)
   {

   //Declaracao variaveis 
    double quantoganhaporhora;
    double horastrabalhadasmes;
    double salario;
    
   //Entradas de dados
    Scanner input = new Scanner(System.in);
    System.out.println("Quanto ganha por hora:");
    quantoganhaporhora = input.nextDouble();
    System.out.println( "Quantas horas trabalhadas por mês:");
    horastrabalhadasmes = input.nextDouble();
    input.close();

   //Calculo do salario
    salario = horastrabalhadasmes*quantoganhaporhora;

   System.out.println("Seu Salário é: " +salario);

   }

}