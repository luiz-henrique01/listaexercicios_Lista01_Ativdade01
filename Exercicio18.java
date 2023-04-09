/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

import java.util.Scanner;

public class Exercicio18 
{
    public static void main(String[] args) 
    {
        //Declaração variavel 
        double tamanhoarquivo;
        double velocidadeconxao;
        double tempodownload;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho do Arquivo em MB: ");
        tamanhoarquivo = input.nextDouble();
        System.out.println("Informe a velocidade da conexão em Mbps: ");
        velocidadeconxao = input.nextDouble();
        input.close();

        //Calculo
        tempodownload = (tamanhoarquivo * 8) / (velocidadeconxao * 60);

        //Resultado
        System.out.printf("O tempo estimado de download é de %.2f", tempodownload);   
        
    }
    
}
