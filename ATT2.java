import java.util.Scanner;
public class ATT2{
   
    public static Scanner sc = new Scanner(System.in);
   
    public static void print(String text) {
        System.out.println(text);
    }
   
    public static int scanInt(String text) {
        print(text);
        return sc.nextInt();
    }
   

    public static void main(String[] args) {
   
    String nome, Avalia��o,Nota;
   
   
    System.out.println("Qual o seu nome?");
    nome=sc.next();
   
    print("Qual maior time brasileiro? \n1-S�o Paulo\n2-Santos\n3-Gr�mio\n4-�bis");
    int p1=scanInt("Qual op��o voc� escolhe");
    if(p1==4) {
   
    print("Voc� acertou");
   
    }
   
    else {
    print("Resposta errada");
    }
   
    //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
   
    print("Qual o Maior campe�o da Champions League\n1-Real Madrid\n2-Vasco\n3-Milan\n4-Que absurdo �bvio que � o Bangu");
    int p2=scanInt("Qual op��o voc� escolhe");
        if(p2==2) {
        print("Voc� acertou");
       
        }
       
        else { print("Resposta errada");
       
      //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
       
        }
        int p3;
        do { print("Qual o Maior campe�o do Mundo\n1-Brasil\n2-Bangu\n3-It�lia\n4-Finl�ndia");
    p3= scanInt("Qual op��o voc� escolhe");
       
        }while(p3!=1);
        // aqui enquanto o usu�rio n�o acertar a resposta, a pergunta vai se repetir.
       
        int p4;
        do { print("Qual o Maior campe�o da Libertadores\n1-Oper�rio\n2-Independientes\n3-Boca Juniors\n4-Gr�mio");
    p4= scanInt("Qual op��o voc� escolhe");
       
        }while(p4!=2);
        // aqui enquanto o usu�rio n�o acertar a resposta, a pergunta vai se repetir.
       
        print("Qual maior time Ga�cho? \n1-Gr�mio\n2-Gr�mio, �bvio\n3-Gr�mio, Vermelho n�o tem chance aqui\n4-Gr�mio, apenas Gr�mio");
    int p5=scanInt("Qual op��o voc� escolhe");
    if(p5==3) {
   
    print("Voc� acertou");
   
    }
   
    else {
    print("Resposta errada");
    }
   
    int p6;
    do { print("Qual o Maior campe�o da bola de ouro?\n1-Messi\n2-Ribamar\n3-Luan do corinthians\n4-Cristiano Ronaldo");
p6= scanInt("Qual op��o voc� escolhe");
   
    }while(p6!=2);
    // aqui enquanto o usu�rio n�o acertar a resposta, a pergunta vai se repetir.
    
    print("Qual o Maior campe�o da Europa League\n1-Sevilla\n2-Eintracht Frankfurt\n3-Barcelona\n4-Bob Marley");
    int p7=scanInt("Qual op��o voc� escolhe");
        if(p7==1) {
        print("Voc� acertou");
       
        }
       
        else { print("Resposta errada");
        }
      //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
        
        int p8;
        do { print("Entre uma noite com a garota(o) que voc� quiser e um rol� com o Neymar, porqu� voc� escolheria o Neymar\n1-Porque � o Ney\n2-Ney � agro, Ney � tech, Ney � pop.Ney � tudo\n3-Ney, Apenas Ney.\n4-Quem disse que eu prefiro o Ney?");
    p8= scanInt("Qual op��o voc� escolhe");
       
        }while(p8!=2);
        // aqui enquanto o usu�rio n�o acertar a resposta, a pergunta vai se repetir.
        
        
        print("R10,R9,Ney ou Pel�\n1-R10\n2-R9\n3-Ney\n4-Pel�");
        int p9=scanInt("Qual op��o voc� escolhe");
            if(p9==1) {
            print("Voc� acertou");
           
            }
            //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
            else { print("Tudo bem amigo, todos s�o craques.");
            }
            
            
            print("Pel� ou Maradona\n1-O �nico que tem 3 copas\n2-Pel�\n3- A �nica carreira que o Maradona foi maior que o Pel� foi a de p�\n4-Pel�, Rei do futebol");
            int p10=scanInt("Qual op��o voc� escolhe");
                if(p10==3) {
                print("Voc� acertou");
               
                }
                //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
                else { print("Todo mundo sabe que Pel� � maior e melhor.");
                }
                //Aqui usei um if else para se o usu�rio responder certo acontecer isso, se responder errado acontecer aquilo
                
                System.out.println("Que nota voc� d� ao quiz?");
         
        sc.close();
    
}
}