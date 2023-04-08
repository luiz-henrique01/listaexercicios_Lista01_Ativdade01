//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args)
    {
      //Declaracoes variaveis
      double numero1;
      double numero2;
      double soma;

      //Entrada de dados
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o primeiro número: ");
      numero1 = input.nextDouble();
      System.out.println("Digite o segundo número: ");
      numero2 = input.nextDouble();
      input.close();

      //Calculo
      soma = numero1 + numero2;
  
      //Resultado
      System.out.println("A soma dos dois números é: " +soma);   

    }

    
}
