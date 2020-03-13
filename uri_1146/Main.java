import java.util.Scanner;
import java.io.IOException;

/**
 * DESCRIÇÃO: 
 * Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo de entrada for igual a zero). 
 * Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e seu sucessor.
 *
 * Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá Presentation Error.
 * 
 * ENTRADA:
 * O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.
 * 
 * SAÍDA:
 * Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo.
 * Não deve haver espaço em branco após o último valor da linha.
 * 
 */

public class Main{

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        /* LAÇO DO WHILE */

        int num = 0;

        do{
            num = sc.nextInt();
            for(int i = 1; i <= num; i++){
                if(i == num){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }
        while(num != 0);

        /* LAÇO FOR */
        /**
        for(int num = sc.nextInt(); num != 0;){
            for(int i = 1; i <= num; i++){
                if(i == num){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
            num = sc.nextInt();
        }*/


        /* LAÇO WHILE */
        /**while(num != 0){
            for(int i = 1; i <= num; i++){
                if(i == num){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
            num = sc.nextInt();
        } */
    }
}