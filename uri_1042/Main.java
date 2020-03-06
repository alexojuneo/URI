import java.util.Arrays; 
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia 3 valores inteiros e ordene-os em ordem crescente. 
 * No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * 
 * ENTRADA:
 * A entrada contem três números inteiros.
 * 
 * SAÍDA:
 * Imprima a saída conforme foi especificado.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

    	int num1, num2, num3;
    	
    	int[] array_ordem_usuario_digitou;
    	array_ordem_usuario_digitou = new int[3];
    
    	int[] array_ordem_crescente;
    	array_ordem_crescente = new int[3];
    
    	num1 = input.nextInt();
    	num2 = input.nextInt();
    	num3 = input.nextInt();
    
    	array_ordem_usuario_digitou[0] = num1;
    	array_ordem_usuario_digitou[1] = num2;
    	array_ordem_usuario_digitou[2] = num3;
    
    	array_ordem_crescente[0] = num1;
    	array_ordem_crescente[1] = num2;
    	array_ordem_crescente[2] = num3;
    
    	Arrays.sort(array_ordem_usuario_digitou);
    	
    	for(int l = 0; l < array_ordem_usuario_digitou.length; l++){
    		System.out.println(array_ordem_usuario_digitou[l]);
    	}
    
    	System.out.print("\n");
    
    	for(int i = 0; i < array_ordem_crescente.length; i++){
    		System.out.println(array_ordem_crescente[i]);	
    	}
    }
}