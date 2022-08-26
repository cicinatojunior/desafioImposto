import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario , servico , capital , gMedicos , gEducacao, salarioMensal, iSalario , iServico , iCapital;
		double deducaoMaxima, gastosDedutiveis, iBruto, iDevido;
	    
		System.out.print("Renda Anual com salario: ");
	    salario = sc.nextDouble();
		
	    System.out.print("Renda Anual com prestacao de servico: ");
	    servico = sc.nextDouble();
		
	    System.out.print("Renda anual com capital: ");
	    capital = sc.nextDouble();
	    
	    System.out.print("Gastos Medicos: ");
	    gMedicos = sc.nextDouble();
	    
	    System.out.print("Gastos com Educacao: ");
	    gEducacao = sc.nextDouble();
	    
	    System.out.println("RELATORIO DE IMPOSTO DE RENDA ");
	    System.out.println("CONSOLIDADO DE RENDA: ");
	    
	    salarioMensal = salario/12;
	    
		
	    iSalario = 0;
	    if (salarioMensal <= 3000) {
	    	System.out.println("Imposto sobre o salario: ISENTO ");
	    }
	    else if (salarioMensal >= 3000 && salarioMensal < 5000) {
	        iSalario = salarioMensal*12*10/100;
	        System.out.printf("\nImposto sobre o salario: = %.3f\n", iSalario);
	    }
	    else {
	    	iSalario = salarioMensal*12*20/100;
	    	 System.out.printf("\nImposto sobre o salario: = %.3f\n", iSalario);
	    }
	    
	    //iServico = 0;
	    iServico = servico*15/100;
		System.out.printf("Imposto sobre serviço: = %2f\n", iServico);
		
		iCapital = capital*20/100;
		System.out.printf("Imposto sobre capital: = %2f\n", iCapital);
		
		System.out.println("DEDUÇÕES: ");
		
		deducaoMaxima = (iSalario + iServico + iCapital)*30/100;
		System.out.printf("Dedução Máxima: = %2f\n", deducaoMaxima);
		
		gastosDedutiveis = gMedicos + gEducacao;
		System.out.printf("Gastos dedutíveis: = %2f\n", gastosDedutiveis);
		
		System.out.println("RESUMO: ");
		
		iBruto=iSalario+iServico+iCapital;
		System.out.printf("Imposto Bruto Total: = %2f\n", iBruto);
		
		iDevido = 0;
		if (deducaoMaxima <= gastosDedutiveis) {
			System.out.printf("Abatimento: = %2f\n",deducaoMaxima );	
			iDevido = iBruto-deducaoMaxima;
			System.out.printf("Imposto Devido: = %2f\n",iDevido);
		}
		else {
			System.out.printf("Abatimento: = %2f\n",gastosDedutiveis );
			iDevido = iBruto-gastosDedutiveis;
			System.out.printf("Imposto Devido: = %2f\n",iDevido);
		}
		

		sc.close();
	}
}