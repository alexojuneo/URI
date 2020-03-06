import java.util.Arrays; 
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 * 
 * ENTRADA:
 * O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 * 
 * SAÍDA:
 * Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
    	
    	int[] valores_inteiros = new int[100];   
        int maior_valor = valores_inteiros[0];
        int posicao_maior_valor = 0;

        for(int i = 0; i < valores_inteiros.length; i++){
            int num = sc.nextInt();
            valores_inteiros[i] = num;
            if(valores_inteiros[i] > maior_valor){
                maior_valor = valores_inteiros[i];
                posicao_maior_valor = i;
            }
        }

        System.out.print(maior_valor + "\n" + (posicao_maior_valor + 1) + "\n");
    }
}

/*import java.util.Arrays; 
import java.util.Random;
import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        Random r = new Random();
    	
    	int[] valores_inteiros;
        valores_inteiros = new int[100];
        
        int maior_valor = valores_inteiros[0];
        int posicao_maior_valor = 0;

        //gerando 100 números aleátorios para 99 elementos no array;
        for(int i = 0; i < valores_inteiros.length; i++){
            valores_inteiros[i] = r.nextInt(20000);
            System.out.println(valores_inteiros[i]);
        }

        //pegando o maior número do array;
        for(int i = 0; i < valores_inteiros.length; i++){
            if(valores_inteiros[i] > maior_valor){
                maior_valor = valores_inteiros[i];
            }
        }

        //pegando a posição do maior número do array;
        for(int i = 0; i < valores_inteiros.length; i++){
            if(valores_inteiros[i] > valores_inteiros[posicao_maior_valor]){
                posicao_maior_valor = i;
            }
        }

        System.out.println(maior_valor);
        System.out.println(posicao_maior_valor);
    }
}
*/
