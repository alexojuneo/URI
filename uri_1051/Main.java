import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		double salario;
		salario = sc.nextDouble();

		double calculo_irpf_8, calculo_irpf_18, calculo_irpf_28;
		double verificar_salario = salario; 	
		double total_pagar_imposto = 0;

		DecimalFormat df = new DecimalFormat("####.###");   

		if(salario <= 2000.00){
			System.out.println("Isento");
		}   
		else if((verificar_salario >= 2000.01) && (verificar_salario <= 3000.00)){ //caso de teste 2500 ---- total a pagar: 40.00 // caso de teste 3000 ---- total a pagar: 80.00
			salario = (salario - 2000);
			calculo_irpf_8 = (salario * 8) / 100;
			if(salario <= 1000){	
				total_pagar_imposto = calculo_irpf_8;
			}
		}
		else if((verificar_salario >= 3000.01) && (verificar_salario <= 4500.00)){ //caso de teste 3500 --- total a pagar: 170.00 // caso de teste 4500 ---- total a pagar: 350.00
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
						calculo_irpf_28 = (salario * 28) / 100; //aplicou o resto do salário nos 28%
						salario = salario - salario; //zerou o salário
						total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18) + (calculo_irpf_28); //pegou os valores do imposto de 8, 18 e 28 e somou o total na variável total_pagar_imposto	
					}
				}
			}
		}  
		System.out.println("R$ " + df.format(total_pagar_imposto));
    }
}