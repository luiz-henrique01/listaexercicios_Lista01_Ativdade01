/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que 
calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/

import java.util.Scanner;

public class Exercicio8 
{
    public static void main(String[] args)
    {
        //Declaração variaveis
        int mulher;
        int homem;
        int usuario;
        double altura;
        double pesoideal;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Responda com 1 ou 2: \n 1-Homem \n 2-Mulher \n");
        usuario = input.nextInt();
        homem = 1;
        mulher = 2;
        
            if (usuario > 2)
            {
                System.out.println("Número inválido");
                return;
            }
        
        System.out.println("Informe sua altura: ");
        altura = input.nextDouble();

        //Calculo 
        if (usuario == homem){
            pesoideal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideial é: " +pesoideal);

        }
        else if (usuario == mulher){
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideial é: " +pesoideal);

        }      
    }   
}
