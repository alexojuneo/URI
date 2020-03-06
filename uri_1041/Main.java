import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * 
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 * 
 * ENTRADA:
 * A entrada contem as coordenadas de um ponto.
 * 
 * SAÍDA:
 * A saída deve apresentar o quadrante em que o ponto se encontra.
 */


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();    

        String saida_coodernada = "";

        //Verificando se a coordernada está na origem
	    if((x == 0.0) && (y == 0.0)){
        	saida_coodernada = "Origem";
        } 

        //Verificando em qual quadrante está a coordernada 
        else if((x < 0.0) && (y > 0.0)){
            saida_coodernada = "Q2";
        }
        else if((x > 0.0) && (y > 0.0)){
            saida_coodernada = "Q1";
        }
        else if((x < 0.0) && (y < 0.0)){
            saida_coodernada = "Q3";
        }
        else if((x > 0.0) && (y < 0.0)){
            saida_coodernada = "Q4";
        }

        //Verificando se a coodernada está no eixo específico X ou Y
        else if((x < 0.0) && (y == 0.0)){
            saida_coodernada = "Eixo X";
        }
        else if((x > 0.0) && (y == 0.0)){
            saida_coodernada = "Eixo X";
        }
        else if((x == 0.0) && (y > 0.0)){
            saida_coodernada = "Eixo Y";
        }
        else if((x == 0.0) && (y < 0.0)){
            saida_coodernada = "Eixo Y";
        }
        
        System.out.println(saida_coodernada);
    }
}