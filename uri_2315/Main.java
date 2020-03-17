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
 * jan = 31
 * fev = 28
 * mar = 30
 * abr = 30
 * mai = 31
 * jun = 29
 * jul = 31
 * ago = 31
 * set = 30
 * out = 31
 * nov = 30
 * dez = 31
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
        int total_dia_prox_mes = 0;
        int totalzao = 0;
        int mes = 0;
        int subtracao_mes = 0;


        if(mes_inicial == mes_final){
            for(int i = dia_inicial; i < dia_final; i++){
                total_dia = total_dia + 1;
            }
            System.out.println(total_dia);
        }


        /**
         * 
         * soma a quantidade de dias até o final do mes correspondente
         * subtracao mes final com o inicial
         * se a subtracao der mais que 1, pegar o mes seguinte somar o total dia dele
         * somar os proximos meses até o ultimo mes
         * no ultimo mes somar a quantidade de dias
         * 
         */


        if(mes_inicial < mes_final){
            mes = quantidadeDiasMes(mes_inicial);
            for(int i = dia_inicial; i <= mes; i++){ 
                total_dia = total_dia + 1;
            }  
            for(){
                
            }
            for(int l = 1; l <= dia_final; l++){
                total_dia_prox_mes = total_dia_prox_mes + 1;
            } 
            totalzao = total_dia + total_dia_prox_mes;
            System.out.println(totalzao);
        }



        sc.close();
    }

    public static int quantidadeDiasMes(int mes_inicial){

        int mes = 0;

        if(mes_inicial == 1 || mes_inicial == 5 || mes_inicial == 7 || mes_inicial == 8 || mes_inicial == 10 || mes_inicial == 12){
            mes = 31;
        }
        else if(mes_inicial == 3 || mes_inicial == 4 || mes_inicial == 8 || mes_inicial == 11){
            mes = 30;
        }
        else if(mes_inicial == 6){
            mes = 29;
        }
        else{
            mes = 28;
        }
        
        if(mes != 0){
            return mes;
        }
        return 0;
    }
}