import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		
		double n1, n2, n3, concFinal;
		
		System.out.println("Informe a sua primeira nota!");
		n1= sc.nextDouble();
		
		System.out.println("Informe a sua segunda nota!");
	n2= sc.nextDouble();
	
	System.out.println("Informe a sua terceira nota!");
		n3= sc.nextDouble();
		
		
		concFinal=(n1*2+n2*3+n3*5)/10;
		
		 if (concFinal>8 && concFinal <=10) {	
		System.out.println("Seu conceito final é A");
		 }
		if (concFinal>7 && concFinal <=8) {
			System.out.println("Seu conceito final é B");

		}
		
		if(concFinal>=6 && concFinal <=7) {
			System.out.println("Seu conceito final é C");
		
		}
		if(concFinal>=5 && concFinal <=6) {
			System.out.println("Seu conceito final é D");
		}
			if(concFinal>0 && concFinal <=5) {
				System.out.println("Seu conceito final é E");
			}
	
				sc.close();
			}
		
		
	
	}

