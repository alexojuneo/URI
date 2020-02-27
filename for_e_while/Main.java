import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sla = 0;
        
        //System.out.println(n1 + "\n" +  n2);
        
        /*for(int i = n1; n1 <= n2; n1++){
            System.out.println("Número: " + n1);
            sla = sla + 1;
            System.out.println("Posição: " + (sla - 1));
        }
        */
        System.out.println("\n----------------\n");
        
        /*while(n1 <= n2){
           System.out.println("Número: " + n1);
           n1 = n1 +1; //or n1++;
           sla = sla + 1; //or sla++;
         
          System.out.println("Posição: " + (sla - 1));
        }*/
        
        System.out.println("\nQuantidade de posições: " + sla);
	}
}