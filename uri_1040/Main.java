import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

    	double nota1, nota2, nota3, nota4, media, nota_exame = 0.0, media_final = 0.0;
    	nota1 = input.nextDouble();
    	nota2 = input.nextDouble();
    	nota3 = input.nextDouble();
    	nota4 = input.nextDouble();

	   media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;
	   DecimalFormat df = new DecimalFormat("#.#");      
	   media = Double.valueOf(df.format(media));
           nota_exame = Double.valueOf(df.format(nota_exame));
	   media_final = Double.valueOf(df.format(media_final));


        if(media >= 7.0){
        	System.out.println("Media: " + (media) + "\n" + "Aluno aprovado.");
        }
        else if(media < 5.0){
        	System.out.println("Media: " + (media) + "\n" + "Aluno reprovado.");
        }
        else if(media >= 5 && media <= 6.9){
            
    		nota_exame = input.nextDouble();
    		media_final = (nota_exame + media) / 2;
    		
    	    if(media_final >= 5.0){
    			System.out.println("Media: " + (media) + "\n" + "Aluno em exame." + "\n" + "Nota do exame: " + nota_exame + "\n" + "Aluno aprovado." + "\n" + "Media final: " + media_final);
    		}
    		else{
    			System.out.println("Media: " + media + "\n" + "Aluno em exame." + "\n" + "Nota do exame: " + nota_exame + "\n" + "Aluno reprovado." + "\n" + "Media final: " + media_final);
    		}		
    	}
    }
}