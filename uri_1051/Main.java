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
	double total_pagar_imposto;

	DecimalFormat df = new DecimalFormat("####.###");   

	if(salario <= 2000.00){
        System.out.println("Isento");
    }   
	else if((verificar_salario > 2000.01) && (verificar_salario <= 3000.00)){ 
		salario = (salario - 2000);
		calculo_irpf_8 = (salario * 8) / 100;
		if(salario <= 1000){	
			total_pagar_imposto = calculo_irpf_8;
		   	System.out.println("R$ " + df.format(total_pagar_imposto));
		}
	}
	else if(verificar_salario <= 4500.00){
		salario = (salario - 2000);
		calculo_irpf_8 = (1000 * 8) / 100;
		salario = (salario - 1000);
		if(salario <= 1500.00){
			calculo_irpf_18 = (salario * 18) / 100;
			salario = (salario - 1500.00);
			total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18);
			System.out.println("R$ " + df.format(total_pagar_imposto));
		}
	}
	else if(verificar_salario > 4500.00){
		salario = (salario - 2000);
			if(salario > 2500.00){		
				calculo_irpf_8 = (1000 * 8 ) / 100;	
				salario = (salario - 1000);		
				if(salario >= 1500){
					calculo_irpf_18 = (1500 * 18) / 100;
					salario = (salario - 1500);
					if(salario > 0){
						calculo_irpf_28 = (salario * 28) / 100;
						total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18) + (calculo_irpf_28);	
						System.out.println("R$ " + df.format(total_pagar_imposto));			
					}
				}
				else if(salario < 1500){
					calculo_irpf_18 = (1500 * 18) / 100;
					salario = (salario - 1500);
					total_pagar_imposto = (calculo_irpf_8) + (calculo_irpf_18);	
					System.out.println("R$ " + df.format(total_pagar_imposto));	
				}	
			}
		}  
    }
}