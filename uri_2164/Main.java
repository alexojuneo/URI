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
        DecimalFormat df = new DecimalFormat("##0.0");

        int n = 0; double fibonacci = 0.0; 
        n = sc.nextInt();

        fibonacci = fib(n);

        System.out.println(df.format(fibonacci));
    }

    public static double fib(int n){

        double fib = 0.0;

        fib = (Math.pow(((1 + Math.sqrt(5)) / 2),n) - (Math.pow(((1 - Math.sqrt(5)) / 2),n))) / Math.sqrt(5);

        return fib;
    }
}