import java.util.Scanner;

public class Atv_04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		double n1,n2,n3,;
		
		System.out.println("Informe o primeiro n�mero");
		n1=sc.nextDouble();
		System.out.println("Informe o segundo n�mero");
		n2=sc.nextDouble();
		System.out.println("Informe o terceiro n�mero");
		n3=sc.nextDouble();
	
		if (n1>n2) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
		if (n1>n3) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
		if (n2>n1) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
		if (n2>n3) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
		if (n3>n1) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
			
		}
		if (n3>n2) {
			System.out.println(" N�mero 2 � maior que n�mero 1");
		}
	}

}
