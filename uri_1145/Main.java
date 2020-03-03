import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.
 * 
 * ENTRADA:
 * O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
 * 
 * SAÍDA:
 * Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. 
 * Não deve haver espaço em branco após o último valor da linha.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int x = 0; int y = 0; int sequencia_num = 0; int menorx = 0; int maiory = 0;
        x = sc.nextInt();
        y = sc.nextInt();

        if((x > 1) && (x < 20)){
            menorx = x;
        }
        if((y < 100000) && (y > menorx)){
            maiory = y;
        }
        for(int i = 1; i <= maiory; i++){   
            System.out.print(((i % menorx) == 0) ? (i + "\n") : (i + " "));    
        }
	}
}

/**
 * 2 maneiras de executar o código, a de cima é com operador ternário. A de baixo é com if e else normal.
 */

/**
 * 
 * import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

        /**
         * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.
         

        Scanner sc = new Scanner(System.in);

        int x = 0; int y = 0; int sequencia_num = 0; int menorx = 0; int maiory = 0;
        x = sc.nextInt();
        y = sc.nextInt();

        if((x > 1) && (x < 20)){
            menorx = x;
        }
        if((y < 100000) && (y > menorx)){
            maiory = y;
        }
        for(int i = 1; i <= maiory; i++){
            if(((i % menorx) == 0)){
                System.out.println(i);
            }
            else{
                System.out.print(i + " ");
            }
        }
	}
}
*/