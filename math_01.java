import java.util.Scanner;
public class math_01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Informe um número!");
		double num =sc.nextDouble();
		
		double quad=Math.pow(num,2);
		double cubo=Math.pow(num, 3);
		double r2=Math.sqrt(num);
		double r3= Math.cbrt(num);
			
		System.out.println(" Seu número ao quadrado é:" +quad);
		System.out.println(" Seu número ao cubo é:" +cubo);
		System.out.println(" Seu número na Raíz quadrada é:" +r2);
		System.out.println(" Seu número na Raíz quadrada é:" +r3);

				
				sc.close();
	}

}
