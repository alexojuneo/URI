import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 * 
 * ENTRADA:
 * Quatro números inteiros representando a hora de início e fim do jogo.
 * 
 * SAÍDA:
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”.
 */

public class Main {
 
    public static void main(final String[] args) throws IOException {

        final Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final, minuto_inicial, minuto_final;
        int total_hora = 0;
        int total_minuto = 0;
        final int MINUTOS_TOTAIS = 60;
        final int HORAS_TOTAIS = 24;

        hora_inicial = sc.nextInt();
        minuto_inicial = sc.nextInt();
        hora_final = sc.nextInt();
        minuto_final = sc.nextInt();

		if(hora_inicial < hora_final){ 
            total_hora = hora_final - hora_inicial;
            if(minuto_inicial < minuto_final){ 
                total_minuto = minuto_final - minuto_inicial;
            }
            else if(minuto_inicial > minuto_final){ 
                total_minuto = minuto_final - minuto_inicial;
                if(total_minuto < 0){
                    total_minuto = MINUTOS_TOTAIS + (total_minuto);
                    total_hora = total_hora - 1;
                }
            }
            else if(minuto_inicial == minuto_final){ 
                total_minuto = minuto_inicial - minuto_final;
            }
        }
        else if(hora_inicial > hora_final){
            if(minuto_inicial > minuto_final){
                total_minuto = minuto_final - minuto_inicial;
                if(total_minuto < 0){
                    total_minuto = MINUTOS_TOTAIS + (total_minuto);
                    total_hora = ((HORAS_TOTAIS + hora_final) - hora_inicial) - 1;
                }
            }
            else if(minuto_inicial < minuto_final){
                total_minuto = minuto_final - minuto_inicial;
                total_hora = (HORAS_TOTAIS + hora_final) - hora_inicial;
            }
            else if(minuto_inicial == minuto_final){
                total_hora = (HORAS_TOTAIS + hora_final) - hora_inicial;
                total_minuto = 0;          
            }
        }
        else if(hora_inicial == hora_final){
            if(minuto_inicial > minuto_final){
                total_minuto = minuto_final - minuto_inicial;
                if(total_minuto < 0){
                    total_minuto = MINUTOS_TOTAIS + (total_minuto);
                    total_hora = 23;
                }
            }
            else if(minuto_inicial < minuto_final){ 
                total_hora = 0;
                total_minuto = minuto_final - minuto_inicial;
            }
            else{
                total_hora = 24;
                total_minuto = 0;
            }
        }
        System.out.println("O JOGO DUROU "  + total_hora + " HORA(S) E " + total_minuto + " MINUTO(S)");
	}
}