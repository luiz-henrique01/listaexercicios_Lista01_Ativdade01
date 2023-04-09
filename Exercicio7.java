//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;


public class Exercicio7 
{
    public static void main(String[] args)
    {
        //Declaração variaveis
        double lados;
        double area;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos centímetros possui cada lado do quadrado: ");
        lados = input.nextDouble();
        input.close();

        //Calculo
        area = Math.pow(lados, 2) * 2;
        
        //Resultado
        System.out.println("O dobro da área do quadrado é: " +area);
       
    }
    
}
