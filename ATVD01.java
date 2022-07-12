import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ATVD01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		
		double num=0;
		
		int i=1, qntd=0;
		
		System.out.println("informe um número maior que 1");
		num= sc.nextDouble();
		
		do {
			
			if(num%i==0) 
				
			 qntd+=1; 
			 i+=1;
						
			}
					
		while(i<=num);
		if(qntd>2)
			System.out.println("Número não primo");
		
		else System.out.println("Número primo");

				
sc.close();		
		

}
}

	

