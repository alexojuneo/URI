/* CONSTRUÇÃO COM SWITCH CASE DEFAULT (JAVA) */

import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia um número inteiro que representa um código de DDD para discagem interurbana.
 * Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
 * 
 * 61 - Brasilia
 * 71 - Salvador
 * 11 - Sao paulo
 * 21 - Rio de Janeiro 
 * 32 - Juiz de fora
 * 19 - Campinas
 * 27 - Vitoria
 * 31 - Belo Horizonte
 * 
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar: DDD nao cadastrado
 * 
 * ENTRADA:
 * A entrada consiste de um único valor inteiro.
 * 
 * SAÍDA:
 * Imprima o nome da cidade correspondente ao DDD existente na entrada.
 * Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

    	int DDD;
    	DDD = sc.nextInt();
        
        String local_DDD = "";
        
		switch(DDD){
			case 61:
		    		System.out.println("Brasilia");
		        	break;
			case 71:
		    		System.out.println("Salvador");
		        	break;
			case 11:
		    		System.out.println("Sao Paulo");
		        	break;
			case 21:
		    		System.out.println("Rio de Janeiro");
		        	break;
			case 32:
		    		System.out.println("Juiz de Fora");
		        	break;
			case 19:
		    		System.out.println("Campinas");
		        	break;
			case 27:
		    		System.out.println("Vitoria");
		        	break;
			case 31:
		    		System.out.println("Belo Horizonte");
		        	break;
			default: System.out.println("DDD nao cadastrado");
	    	}
      }
}

/* CONSTRUÇÃO COM IF (JAVA) */

/*
import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

    	int DDD;
    	DDD = input.nextInt();
        
        String local_DDD = "";
        
		if(DDD == 61){
	    		local_DDD = "Brasilia";
	    	}
	    	else if(DDD == 71){
	    	    	local_DDD = "Salvador";
	    	}
	    	else if(DDD == 11){
	    		local_DDD = "Sao Paulo";
	    	}
	    	else if(DDD == 21){
	    		local_DDD = "Rio de Janeiro";
	    	}
	    	else if(DDD == 32){
	    		local_DDD = "Juiz de Fora";
	    	}
	    	else if(DDD == 19){
	    		local_DDD = "Campinas";
	    	}
	    	else if(DDD == 27){
	    		local_DDD = "Vitoria";
	    	}
	    	else if(DDD == 31){
	    		local_DDD = "Belo Horizonte";
	    	}
		else{
			System.out.print("DDD nao cadastrado");					
		}

		if(local_DDD != ""){
			System.out.println(local_DDD);
		}
    }
}
*/
