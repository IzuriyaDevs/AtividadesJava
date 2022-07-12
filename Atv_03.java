import java.util.Scanner;

public class Atv_03 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		
		double n1, n2;
		System.out.println("Informe um número!");
		n1=sc.nextDouble();
		System.out.println("Informe outro número!");
		n2=sc.nextDouble();
		
		if (n1>n2) {
			System.out.println(" Número 1 é maior que número 2");
		}	
		
		
		if (n2>n1) {
			System.out.println(" Número 2 é maior que número 1");
		}
	}

}
