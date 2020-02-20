import java.io.IOException;
import java.util.Scanner; 

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
