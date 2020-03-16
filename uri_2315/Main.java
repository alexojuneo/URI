import java.util.Scanner;
import java.io.IOException;

/**
 * DESCRIÇÃO: 
 * Seu programa deve ler duas datas (dia e mês) e calcular a diferença entre elas, em dias. 
 * Considere se tratar de um ano não bissexto (fevereiro com 28 dias).
 * 
 * ENTRADA:
 * A entrada contem duas linhas contendo dois inteiros cada, representando o dia e o mês da primeira e da segunda data. 
 * A primeira data será sempre menor (anterior no ano) ou igual à segunda.
 * 
 * SAÍDA:
 * A saída deverá conter o número de dias entre a primeira e a segunda data.
 * 
 * jan - 31
 * fev - 28
 * mar - 30
 * abr - 30
 * mai - 31
 * jun - 29
 * jul - 31
 * ago - 31
 * set - 30
 * out - 31
 * nov - 30
 * dez - 31
 * 
 */

public class Main{

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int dia_inicial = 0; int dia_final = 0;
        int mes_inicial = 0; int mes_final = 0;

        dia_inicial = sc.nextInt();
        mes_inicial = sc.nextInt();
        dia_final = sc.nextInt();
        mes_final = sc.nextInt();
        int total_dia = 0;

        //caso em 1 mês só.
        if(mes_inicial == mes_final){
            for(int i = dia_inicial; i < dia_final; i++){
                total_dia = total_dia + 1;
            }
            System.out.println(total_dia);
        }

        //caso mais de 1 mês
        if(mes_inicial < mes_final){
            for(int i = dia_inicial; i < 31; i++){ //percorrer o for até o dia 31.
                total_dia = total_dia + 1;
                for(int l = 0; l < dia_final; l++){
                    total_dia += 1;
                }
            }    
            System.out.println(totale);
        }
        sc.close();
    }
}