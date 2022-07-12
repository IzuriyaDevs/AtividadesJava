import java.util.Scanner;
public class ATT01 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

float multiplicacao;

System.out.println("Informe um número!");
multiplicacao=sc.nextFloat();

for(int x=1; x<=10;x++) {
	System.out.println("Tabuada de "+x+": "+(x*multiplicacao));
}
sc.close();
	
	
	
	}

}
