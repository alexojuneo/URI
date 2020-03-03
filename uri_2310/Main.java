import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe.
 * A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, 
 * bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos).
 * Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.
 * 
 * ENTRADA:
 * A entrada é dada pelo número de jogadores N (1 <= N <= 100), seguido pelo nome de cada um dos jogadores. 
 * Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 <= S,B,A <= 10000)
 * representam a quantidade de tentativas de saques, bloqueios e ataques
 * e na segunda linha, S1, B1 e A1 (0 <= S1 <= S; 0 <= B1 <= B; 0 <= A1 <= A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.
 * 
 * SAÍDA:
 * A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); 
        
        int num_jogadores = 0; 
        String nome_jogador = "";

        int pontuacao_saque = 0; int qntd_acertos_pontuacao_saque = 0; int total_acertos_saque_time = 0; int total_pontuacao_saque_time = 0; int calculo1 = 0;
        int pontuacao_bloqueio = 0; int qntd_acertos_pontuacao_bloqueio = 0; int  total_acertos_bloqueio_time = 0; int total_pontuacao_bloqueio_time = 0; int calculo2 = 0;
        int pontuacao_ataque = 0; int qntd_acertos_pontuacao_ataque = 0; int total_acertos_ataque_time = 0; int total_pontuacao_ataque_time = 0; int calculo3 = 0;

        num_jogadores = sc.nextInt();

        for(int i = 1; i <= num_jogadores; i++){
            nome_jogador = sc.next();

            pontuacao_saque = sc.nextInt();
            pontuacao_bloqueio = sc.nextInt();
            pontuacao_ataque = sc.nextInt();

            qntd_acertos_pontuacao_saque = sc.nextInt();
            qntd_acertos_pontuacao_bloqueio = sc.nextInt();
            qntd_acertos_pontuacao_ataque = sc.nextInt();

            total_acertos_saque_time += qntd_acertos_pontuacao_saque;
            total_acertos_bloqueio_time += qntd_acertos_pontuacao_bloqueio;
            total_acertos_ataque_time += qntd_acertos_pontuacao_ataque;

            total_pontuacao_saque_time += pontuacao_saque;
            total_pontuacao_bloqueio_time += pontuacao_bloqueio;
            total_pontuacao_ataque_time += pontuacao_ataque;
        }

        calculo1 = ((total_acertos_saque_time * 100) / total_pontuacao_saque_time);
        calculo2 = ((total_acertos_bloqueio_time * 100) / total_pontuacao_bloqueio_time);
        calculo3 = ((total_acertos_ataque_time * 100) / total_pontuacao_ataque_time);

        System.out.println("Total pontuação saque: " + total_acertos_saque_time);
        System.out.println("Total pontuação bloqueio: " + total_acertos_bloqueio_time);
        System.out.println("Total pontuação ataque: " + total_acertos_ataque_time);

        System.out.println("\nTotal pontuação saque: " + total_pontuacao_saque_time);
        System.out.println("Total pontuação bloqueio: " + total_pontuacao_bloqueio_time);
        System.out.println("Total pontuação ataque: " + total_pontuacao_ataque_time);

        System.out.println("\nPontos de saque:  " + calculo1 + " %.");
        System.out.println("Pontos de bloqueio:  " + calculo2 + " %.");
        System.out.println("Pontos de ataque:  " + calculo3 + " %.");
    }         
}

