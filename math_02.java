import java.util.Scanner;
public class math_02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
	
	  double delta, x1,x2,raiz;
	  int a,b,c;
System.out.println("Informe o valor de a(x²)");
a=sc.nextInt();
System.out.println("Informe o valor de b (x)");
b=sc.nextInt();
System.out.println("Informe o valor de c");
	c=sc.nextInt();
	
  delta = Math.pow(b, 2) - (4*a*c);
  x1= -b + Math.sqrt(delta) / (2*a);
  x2= -b - Math.sqrt(delta) / (2*a);
 
  System.out.println("O valor do seu delta é: %.2f" +delta);
  System.out.println("O valor do seu x1 é: %.2f" +x1);
  System.out.println("O valor do seu x2 é: %.2f" +x2);
  
	
	
	
	sc.close();
	}
}