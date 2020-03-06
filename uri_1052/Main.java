/* 1 SOLUÇÃO */

import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia um valor inteiro entre 1 e 12, inclusive.
 * Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.
 * 
 * ENTRADA:
 * A entrada contém um único valor inteiro.
 * 
 * SAÍDA:
 * Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
 */

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

    	int A;
    	A = input.nextInt();
    
    	if(A == 1){
    		System.out.println("January");
    	}
    	else if(A == 2){
    		System.out.println("February");
    	}
    	else if(A == 3){
    		System.out.println("March");
    	}
    	else if(A == 4){
    		System.out.println("April");
    	}
    	else if(A == 5){
    		System.out.println("May");
    	}
    	else if(A == 6){
    		System.out.println("June");
    	}
    	else if(A == 7){
    		System.out.println("July");
    	}
    	else if(A == 8){
    		System.out.println("August");
    	}
    	else if(A == 9){
    		System.out.println("September");
    	}
    	else if(A == 10){
    		System.out.println("October");
    	}
    	else if(A == 11){
    		System.out.println("November");
    	}
    	else{
    		System.out.println("December");
    	}
 
    }
 
}


/* 2 SOLUÇÃO */
/*

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

    	int A;
    	A = input.nextInt();
        
        String mes;
        
    	if(A == 1){
    		mes = "January";
    	}
    	else if(A == 2){
    	    mes = "February";
    	}
    	else if(A == 3){
    		mes = "March";
    	}
    	else if(A == 4){
    		mes = "April";
    	}
    	else if(A == 5){
    		mes = "May";
    	}
    	else if(A == 6){
    		mes = "June";
    	}
    	else if(A == 7){
    		mes = "July";
    	}
    	else if(A == 8){
    		mes = "August";
    	}
    	else if(A == 9){
    		mes = "September";
    	}
    	else if(A == 10){
    		mes = "October";
    	}
    	else if(A == 11){
    		mes = "November";
    	}
    	else{
    		mes = "December";
    	}
    	
    	System.out.println("" + mes);

    }
 
}

*/
