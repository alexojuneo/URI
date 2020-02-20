import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
	    Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final, minuto_inicial, minuto_final, duracao_jogo;
        int total_hora = 0; int total_minuto = 0;
        int calcular_minuto, MINUTOS_TOTAIS = 60;

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
            total_hora = hora_inicial - hora_final;
            if(minuto_inicial < minuto_final){
                total_minuto = minuto_inicial - minuto_final;
                if(total_minuto < 0){
                    total_minuto = MINUTOS_TOTAIS + (total_minuto);
                    total_hora = total_hora - 1;
                }
            }
            else if(minuto_inicial > minuto_final){
                total_minuto = minuto_inicial - minuto_final;
            }
            else if(minuto_inicial == minuto_final){
                total_minuto = minuto_inicial - minuto_final;
            }
        }
        else{	
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)"); //CASO DE TESTE: 7 7 7 7
		}

        if((total_hora != 0) && (total_minuto != 0)){
            System.out.println("O JOGO DUROU "  + total_hora + " HORA(S) E " + total_minuto + " MINUTO(S)"); 
        }
	}
}
