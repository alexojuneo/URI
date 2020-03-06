import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
 * 
 * ENTRADA:
 * A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
 * 
 * SAÍDA:
 * Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        DecimalFormat df = new DecimalFormat("0.#");

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextDouble();
            if((numeros[i] == 0) || (numeros[i] < 0)){
                numeros[i] = 1;
            }
            System.out.println("X[" + i + "] = " + df.format(numeros[i]));
        }    
	}
}