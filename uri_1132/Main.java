import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = 0; int y = 0; int total_soma = 0; int maior = 0; int menor = 0;

        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > y){
            maior = x; menor = y;
        }
        else{
            maior = y; menor = x;
        }
        for(int i = menor; i <= maior; i++){
            if(!((i % 13) == 0)){
                total_soma = total_soma + i;
            }
        }
        if(total_soma != 0){
            System.out.println(total_soma);
        }
	}
}