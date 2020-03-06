import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia 2 valores inteiros (A e B).
 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
 * 
 * ENTRADA:
 * A entrada contém valores inteiros.
 * 
 * SAÍDA:
 * A saída deve conter uma das mensagens conforme descrito acima.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int A, B;
        String saida_multiplos = "";

        A = sc.nextInt();
        B = sc.nextInt();    

        //Verificando se a coordernada está na origem
	    if(((A % B) == 0) || ((B % A) == 0 )){
        	saida_multiplos = "Sao Multiplos";
        } 
        else { // if(((A % B) != 0) || ((B % A) != 0 ))
            saida_multiplos = "Nao sao Multiplos";
        }
        
        System.out.println(saida_multiplos);
    }
}