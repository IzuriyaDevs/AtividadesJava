import java.util.Scanner;
public class math_01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Informe um n�mero!");
		double num =sc.nextDouble();
		
		double quad=Math.pow(num,2);
		double cubo=Math.pow(num, 3);
		double r2=Math.sqrt(num);
		double r3= Math.cbrt(num);
			
		System.out.println(" Seu n�mero ao quadrado �:" +quad);
		System.out.println(" Seu n�mero ao cubo �:" +cubo);
		System.out.println(" Seu n�mero na Ra�z quadrada �:" +r2);
		System.out.println(" Seu n�mero na Ra�z quadrada �:" +r3);

				
				sc.close();
	}

}
