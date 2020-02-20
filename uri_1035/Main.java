import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input =  new Scanner(System.in);

    	int A;
    	int B;
    	int C;
    	int D;
    	int sumDC;
    	int sumAB;
    
    	A = input.nextInt();
    	B = input.nextInt();
    	C = input.nextInt();
    	D = input.nextInt();
    
    	sumDC = D + C;
    	sumAB = A + B;
    
    	if((B > C) && (D > A) && (sumDC > sumAB) && (C > 0 && D > 0) && ((A % 2) == 0)){
    		System.out.println("Valores aceitos");
    	}
    	else {
    		System.out.println("Valores nao aceitos");
    	}
 
    }
 
}