import java.util.Scanner;
public class ATT1 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void print(String text) {
        System.out.println(text);
    }
    
    public static float scanFloat(String text) {
        print(text);
        return sc.nextFloat();
    }

    public static void main(String[] args) {
        float saCarlos = scanFloat("Qual o salario de carlos?");
        float saJo�o = saCarlos/3;
        
        int m = 1;

        double rSCarlos = saCarlos*(1+m*0.02);
        double rSJo�o = saJo�o*(1+m*0.05);
        
        while(rSCarlos > rSJo�o) {
            rSCarlos = rSCarlos*(1.02);
            rSJo�o = rSJo�o*(1.05);
            m++;
        }
        print("Quantidade de meses necessarios: "+m);
        
        sc.close();
    }
    
}