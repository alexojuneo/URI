import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia a hora inicial e a hora final de um jogo.
 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * ENTRADA:
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 * 
 * SAÍDA:
 * Apresente a duração do jogo conforme exemplo abaixo.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
	    Scanner sc = new Scanner(System.in);

		int hora_inicial, hora_final, duracao_jogo;
		hora_inicial = sc.nextInt();
		hora_final = sc.nextInt();
				
		if(hora_inicial == hora_final){	
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(hora_inicial < hora_final){
			duracao_jogo = hora_final - hora_inicial;
			System.out.println("O JOGO DUROU "  + duracao_jogo + " HORA(S)");
		}
		else if(hora_inicial > hora_final){
	 		duracao_jogo = (24 - hora_inicial) + hora_final;
			System.out.println("O JOGO DUROU "  + duracao_jogo + " HORA(S)");
		}
	}
}
