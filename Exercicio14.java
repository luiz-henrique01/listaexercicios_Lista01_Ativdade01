/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes)
e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor 
da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

import java.util.Scanner;

public class Exercicio14 
{
    public static void main(String[] args)
    {

        //Declaração variavel
        double peso;
        double multa;
        double limite;
        double excesso; 
        double ValorPorQuilo;
        limite = 50;
        ValorPorQuilo = 4; 

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de KG de peixes: ");
        peso = input.nextDouble();
        input.close();

        //Condições

        if(peso > limite){
            excesso = peso - limite;
        }
        else {
            excesso = 0;
        }

        //Calculo de multa
        
        multa = excesso * ValorPorQuilo;

        //Condições 2

        if(excesso > 0){
            System.out.println("O peso execedente foi de: " +excesso);
            System.out.println("O valor da multa é de: R$ " +multa);
        }
        else{
            System.out.println("Não houve excesso de peso");
        }
    }
    
}
