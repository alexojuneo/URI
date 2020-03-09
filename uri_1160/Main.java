import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * DESCRIÇÃO: 
 * Mariazinha quer resolver um problema interessante. 
 * Dadas as informações de população e a taxa de crescimento de duas cidades quaisquer (A e B),
 * ela gostaria de saber quantos anos levará para que a cidade menor (sempre é a cidade A) ultrapasse a cidade B em população. 
 * Claro que ela quer saber apenas para as cidades cuja taxa de crescimento da cidade A é maior do que a taxa de crescimento da cidade B, portanto,
 * previamente já separou para você apenas os casos de teste que tem a taxa de crescimento maior para a cidade A.
 * Sua tarefa é construir um programa que apresente o tempo em anos para cada caso de teste.
 *
 * Porém, em alguns casos o tempo pode ser muito grande, e Mariazinha não se interessa em saber exatamente o tempo para estes casos.
 * Basta que você informe, nesta situação, a mensagem "Mais de 1 seculo.".
 * 
 * ENTRADA:
 * A primeira linha da entrada contém um único inteiro T, indicando o número de casos de teste (1 ≤ T ≤ 3000).
 * Cada caso de teste contém 4 números: dois inteiros PA e PB (100 <= PA < 1000000, PA < PB <= 1000000) indicando respectivamente a população de A e B, 
 * e dois valores G1 e G2 (0.1 ≤ G1 ≤ 10.0, 0.0 ≤ G2 ≤ 10.0, G2 < G1) com um digito após o ponto decimal cada, indicando respectivamente o crescimento populacional de A e B (em percentual).
 * 
 * Atenção: A população é sempre um valor inteiro, portanto, um crescimento de 2.5 % sobre uma população de 100 pessoas resultará em 102 pessoas, e não 102.5 pessoas, 
 * enquanto um crescimento de 2.5% sobre uma população de 1000 pessoas resultará em 1025 pessoas. Além disso, não utilize variáveis de precisão simples para as taxas de crescimento.
 * 
 * SAÍDA:
 * Imprima, para cada caso de teste, quantos anos levará para que a cidade A ultrapasse a cidade B em número de habitantes.
 * Obs.: se o tempo for mais do que 100 anos o programa deve apresentar a mensagem: Mais de 1 seculo. 
 * Neste caso, acredito que seja melhor interromper o programa imediatamente após passar de 100 anos,
 * caso contrário você poderá receber como resposta da submissão deste problema "Time Limit Exceeded".
 * 
 */

public class Main{

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int caso_teste_T = 0;

        int populacaoA = 0; //populacao de A sempre é a menor;
        int populacaoB = 0;

        double crescimentoPopulacaoA = 0.0;
        double crescimentoPopulacaoB = 0.0;

        int quantidade_anos = 0;

        caso_teste_T = sc.nextInt();

        for(int i = 1; i <= caso_teste_T; i++){

            populacaoA = sc.nextInt();
            populacaoB = sc.nextInt();
            crescimentoPopulacaoA = sc.nextDouble();
            crescimentoPopulacaoB = sc.nextDouble();

            quantidade_anos = calcular_qnts_anos_cityA_passara_cityB(populacaoA, populacaoB, crescimentoPopulacaoA, crescimentoPopulacaoB);

            if((quantidade_anos > 0) && (quantidade_anos <= 100)){
                System.out.println(quantidade_anos + " anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
        }
    }

    public static int calcular_qnts_anos_cityA_passara_cityB(int populacaoA, int populacaoB, double crescimentoPopulacaoA, double crescimentoPopulacaoB){

        double calcCrescimentoPopulacaoA = 0.0;
        double calcCrescimentoPopulacaoB = 0.0;

        for(int l = 1; l <= 100; l++){

            calcCrescimentoPopulacaoA = (crescimentoPopulacaoA * populacaoA) / 100;
            calcCrescimentoPopulacaoB = (crescimentoPopulacaoB * populacaoB) / 100;
    
            calcCrescimentoPopulacaoA = Math.round(calcCrescimentoPopulacaoA);
            calcCrescimentoPopulacaoB = Math.round(calcCrescimentoPopulacaoB);

            populacaoA += calcCrescimentoPopulacaoA;
            populacaoB += calcCrescimentoPopulacaoB;

            if(populacaoA > populacaoB){
                return l;
            }
        }
        return 0;
    }
}