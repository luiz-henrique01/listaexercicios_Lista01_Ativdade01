/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$ */

import java.util.Scanner;

public class Exercicio15 
{
    public static void main(String[] args) 
    {
        //Declaração variavel
        double valorhora;
        double horastrabalhadas; 
        double salariobruto;
        double ir;
        double inss;
        double sindicato;
        double salarioliquido;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quanto ganha por hora: ");
        valorhora = input.nextDouble();
        System.out.println("Informe as horas trabalhadas: ");
        horastrabalhadas = input.nextDouble();
        input.close();

        //Calculo
        salariobruto = valorhora * horastrabalhadas;
        ir = salariobruto * 0.11;
        inss = salariobruto * 0.08;
        sindicato = salariobruto * 0.05;
        salarioliquido = salariobruto - ir - inss - sindicato; 
        System.out.println("");

        //Resultado
        System.out.println("Salário bruto é: R$ " +salariobruto);
        System.out.println("");
        System.out.println("Valor pago ao INSS é: R$ " +inss);
        System.out.println("");
        System.out.println("Valor pagao ao Sindicato é: R$ " +sindicato);
        System.out.println("");
        System.out.printf("Salário Líquido é: R$ %.2f" ,salarioliquido);
        
    }
    
}
