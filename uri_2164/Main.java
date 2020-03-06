import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * A fórmula de Binet é uma forma de calcular números de Fibonacci.
 * Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.
 * 
 * ENTRADA:
 * A entrada é um número natural n (0 < n ≤ 50).
 * 
 * SAÍDA:
 * A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        int num = 0; int total = 0; 
        num = sc.nextInt();

        for(int i = 3; i <= num; i++){
            total = num - i;
            System.out.println(df.format(total));
        }
	}
}