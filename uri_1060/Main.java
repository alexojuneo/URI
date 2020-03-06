import java.util.Arrays; 
import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Faça um programa que leia 6 valores. 
 * Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
 * A seguir, mostre a quantidade de valores positivos digitados.
 * 
 * ENTRADA:
 * Seis valores, negativos e/ou positivos.
 * 
 * SAÍDA:
 * Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.#");

        //double[] numeros = new double[6];
        double numero = 0;
        double qntd_num = 0;
        
        for(int i = 0; i < 6; i++){
            numero = sc.nextDouble();
            if(numero > 0){ 
                qntd_num = qntd_num + 1;
            }
        }
        System.out.println(df.format(qntd_num) + " valores positivos");
	}
}