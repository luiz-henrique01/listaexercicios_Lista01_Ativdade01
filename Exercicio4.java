//Faça um Programa que peça as 4 notas bimestrais e mostre a média.


import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args)
    {

     //Declaracao variaveis 
      double nota1;
      double nota2;
      double nota3;
      double nota4;
      double media;
      double soma;

     //Entrada de dados
      Scanner input = new Scanner(System.in);
      System.out.println("Digite a nota 1: ");
      nota1 = input.nextDouble();
      System.out.println("Digite a nota 2: ");
      nota2 = input.nextDouble();
      System.out.println("Digite a nota 3: ");
      nota3 = input.nextDouble();
      System.out.println("Digite a nota 4: ");
      nota4 = input.nextDouble();
      input.close();

     //Calculos notas
      soma = nota1 + nota2 + nota3 + nota4;
      media = soma / 4;
      
      //Resultado
      System.out.println("A media das notas é: " +media);
        
    }


}