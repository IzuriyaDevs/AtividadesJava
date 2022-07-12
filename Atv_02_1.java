import java.util.Scanner;

public class Atv_02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		
		double nota1, nota2, nota3,media;
		
		System.out.println("Informe a primeira nota!");
		nota1= sc.nextDouble();
		
		System.out.println("Informe a segunda nota!");
		nota2= sc.nextDouble();

		System.out.println("Informe a terceira nota!");
		nota3= sc.nextDouble();
		
		media= (nota1+nota2+nota3)/3;
		
		 if (media <0 && media <=3) {	
		 System.out.println("Reprovado");
		 }
				if (media>3 && media <=7) {
					System.out.println(" Exame");
				}
					if (media>7 && media <=10) {
						System.out.println(" Aprovado");
					}
			
		
		sc.close();
	}

}
