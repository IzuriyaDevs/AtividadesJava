import java.util.Scanner;

public class Atv_03 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		
		double n1, n2;
		System.out.println("Informe um n�mero!");
		n1=sc.nextDouble();
		System.out.println("Informe outro n�mero!");
		n2=sc.nextDouble();
		
		if (n1>n2) {
			System.out.println(" N�mero 1 � maior que n�mero 2");
		}	
		
		
		if (n2>n1) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
	}

}
