
import java.util.Scanner;

public class Exercicio9 
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
