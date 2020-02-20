import java.io.IOException;
import java.util.Scanner; 

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