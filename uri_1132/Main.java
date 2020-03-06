import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
 * 
 * ENTRADA:
 * O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
 * 
 * SAÍDA:
 * Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = 0; int y = 0; int total_soma = 0; int maior = 0; int menor = 0;

        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > y){
            maior = x; menor = y;
        }
        else{
            maior = y; menor = x;
        }
        for(int i = menor; i <= maior; i++){
            if(!((i % 13) == 0)){
                total_soma = total_soma + i;
            }
        }
        if(total_soma != 0){
            System.out.println(total_soma);
        }
	}
}