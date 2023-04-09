/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, 
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde 
os valores para cima, isto é, considere latas cheias. */

import java.util.Scanner;

public class Exercicio17 
{
    public static void main(String[] args)
    {
        //Declaração variavel
        double tamanhoarea;
        double litrosnecessarios;
        double precolatas;
        double precogaloes;
        double precomistura;
        int latasnecessarias;
        int galoesnecessarios;
        int latasusadas;
        int galoesusados;

        //Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
        tamanhoarea = input.nextDouble();
        input.close();

        //Calculos
        litrosnecessarios = Math.ceil(tamanhoarea / 6 * 1.1);   
        latasnecessarias = (int) Math.ceil(litrosnecessarios / 18);
        galoesnecessarios = (int) Math.ceil(litrosnecessarios / 3.6);
        precolatas = latasnecessarias * 80;
        precogaloes = galoesnecessarios * 25;
        // misturar latas e galões, de forma que o desperdício de tinta seja menor
        latasusadas = (int) (litrosnecessarios / 18);
        galoesusados = (int) Math.ceil((litrosnecessarios % 18) / 3.6);
        precomistura = latasusadas * 80 + galoesusados * 25;
        System.out.println("");

        //Resultado
        System.out.println("Quantidade de tintas a serem compradas:");
        System.out.println("");
        System.out.println("Apenas latas de 18 litros: " + latasnecessarias + " Latas R$ " + precolatas);
        System.out.println("Apenas galões de 3.6 litros: " + galoesnecessarios + " galões R$ " + precogaloes);
        System.out.println("Mistura de latas e galões: " + latasusadas + " latas e " + galoesusados + " galões R$ " + precomistura);

        
    }
    
}
