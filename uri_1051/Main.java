import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

/**
 * DESCRIÇÃO: 
 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
 * pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio.
 * A moeda deste país é o Rombus, cujo símbolo é o R$.
 * 
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * 
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
 * No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
 * O valor deve ser impresso com duas casas decimais.
 * 
 * ENTRADA:
 * A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
 * 
 * SAÍDA:
 * Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto.
 * Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
 */

public class Main {

    public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		double salario;
		salario = sc.nextDouble();
		double calculo_irpf_8, calculo_irpf_18, calculo_irpf_28;
		double verificar_salario = salario; 	
		double total_pagar_imposto = 0;

		DecimalFormat df = new DecimalFormat("###0.00");
		
		if((verificar_salario >= 2000.01) && (verificar_salario <= 3000.00)){
			salario = (salario - 2000);
			calculo_irpf_8 = (salario * 8) / 100;
			if(salario <= 1000){
				total_pagar_imposto = calculo_irpf_8;
			}
		}
		else if((verificar_salario >= 3000.01) && (verificar_salario <= 4500.00)){
			salario = (salario - 2000);
			calculo_irpf_8 = (1000 * 8) / 100;
			salario = (salario - 1000);
			if(salario <= 1500.00){
				calculo_irpf_18 = (salario * 18) / 100;
				salario = (salario - 1500.00);
				if(salario <= 0){
					total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18);
				}
			}
		}
		else if(verificar_salario >= 4500.01){
			salario = (salario - 2000);
			if(salario > 2500.00){		
				calculo_irpf_8 = (1000 * 8 ) / 100;	
				salario = (salario - 1000);		
				if(salario >= 1500){
					calculo_irpf_18 = (1500 * 18) / 100;
					salario = (salario - 1500.00);
					if(salario > 0.0){
						calculo_irpf_28 = (salario * 28) / 100;
						total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18) + (calculo_irpf_28); 
					}
				}
			}
		} 
		if(total_pagar_imposto >= 0.01){
			System.out.println("R$ " + df.format(total_pagar_imposto));
		}
		else{
			System.out.println("Isento");
		}
    }
}