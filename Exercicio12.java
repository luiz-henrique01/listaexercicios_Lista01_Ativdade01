/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo 
que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */

import java.util.Scanner;

public class Exercicio12 
{
    public static void main(String[] args)
    {
        //Declação variaveis 
        double altura;
        double peso;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        altura = input.nextDouble();
        input.close();

        //Calculo
        peso = (72.7 * altura) - 58;

        //Resultado
        System.out.println("Seu peso ideal é: " + peso);

    }
    
}
