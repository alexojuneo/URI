import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
 * A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 * se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 * se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 * se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 * se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 * se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * 
 * ENTRADA:
 * A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
 * 
 * SAÍDA:
 * Imprima todas as classificações do triângulo especificado na entrada.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double A, B, C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double tempA, tempB, tempC;

        tempA = Math.max(A, Math.max(B, C));
        tempB = 0;
        tempC = 0;

        if(tempA == A){	
            tempB = Math.max(B, C);		
            tempC = Math.min(B, C);
        }
        if(tempA == B){
            tempB = Math.max(C, A);
            tempC = Math.min(C, A);
        }
        if(tempA == C){
            tempB = Math.max(A, B);
            tempC = Math.min(A, B);
        }

        A = tempA;
        B = tempB;
        C = tempC;
	
    	if(A >= (B+C)){
    		System.out.println("NAO FORMA TRIANGULO");		
    	}
	    else{
	    	if((A * A ) == ((B * B) + (C * C))){
	    		System.out.println("TRIANGULO RETANGULO");		
	    	}
	    	if((A * A ) > ((B * B) + (C * C))){
	    		System.out.println("TRIANGULO OBTUSANGULO");		
	    	}
	    	if((A * A ) < ((B * B) + (C * C))){
	    		System.out.println("TRIANGULO ACUTANGULO");	
	    	}
	    	if((A * A ) == (B * B) && (A * A) == (C * C)){
	    		System.out.println("TRIANGULO EQUILATERO");
	    	}
	    	if((A == B) && (A != C) || (A == C) && (A != B) || (B == C) && (B != A) || (C == A) && (C != B)){
	    		System.out.println("TRIANGULO ISOSCELES");	
	    	}
	    }
    }
}