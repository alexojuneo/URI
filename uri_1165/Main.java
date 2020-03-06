import java.io.IOException;
import java.util.Scanner;

/**
 * DESCRIÇÃO: 
 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo.
 * Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.
 * 
 * ENTRADA:
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 <= N <= 100), indicando o número de casos de teste da entrada.
 * Cada uma das N linhas seguintes contém um valor inteiro X (1 < X <= 10^7), que pode ser ou não, um número primo.
 * 
 * SAÍDA:
 * Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a especificação fornecida.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num_caso_teste = 0; int x = 0;
        num_caso_teste = sc.nextInt(); 

        for(int i = 1; i <= num_caso_teste; i++){
            x = sc.nextInt();

            boolean verificar_primo = verificar_num_primo(x); 

            if(verificar_primo == false){
                System.out.println(x + " nao eh primo");
            }
            else{
                System.out.println(x + " eh primo");
            }
        }
    }
    public static boolean verificar_num_primo(int x){
        if(x <= 1){
            return false;
        }
        for(int p = 2; p < x; p++){
            if(((x % p) == 0)){
                return false;
            }
        }
        return true;
    }
}