//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].



import java.util.Scanner;

public class Exercicio2
{
  
  public static void main(String[] args) 
   {

   //Declaração variaveis
    double numero;
    System.out.print("Digite um número:");
  
   //Entrada de dados
    Scanner input = new Scanner(System.in);
    numero = input.nextDouble();
    input.close();
  
   //Retornar numero
    System.out.println("Número informado foi: " +numero);
   }
}