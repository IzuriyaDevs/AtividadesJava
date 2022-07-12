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
   
    String nome, Avaliação,Nota;
   
   
    System.out.println("Qual o seu nome?");
    nome=sc.next();
   
    print("Qual maior time brasileiro? \n1-São Paulo\n2-Santos\n3-Grêmio\n4-Íbis");
    int p1=scanInt("Qual opção você escolhe");
    if(p1==4) {
   
    print("Você acertou");
   
    }
   
    else {
    print("Resposta errada");
    }
   
    //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
   
    print("Qual o Maior campeão da Champions League\n1-Real Madrid\n2-Vasco\n3-Milan\n4-Que absurdo óbvio que é o Bangu");
    int p2=scanInt("Qual opção você escolhe");
        if(p2==2) {
        print("Você acertou");
       
        }
       
        else { print("Resposta errada");
       
      //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
       
        }
        int p3;
        do { print("Qual o Maior campeão do Mundo\n1-Brasil\n2-Bangu\n3-Itália\n4-Finlândia");
    p3= scanInt("Qual opção você escolhe");
       
        }while(p3!=1);
        // aqui enquanto o usuário não acertar a resposta, a pergunta vai se repetir.
       
        int p4;
        do { print("Qual o Maior campeão da Libertadores\n1-Operário\n2-Independientes\n3-Boca Juniors\n4-Grêmio");
    p4= scanInt("Qual opção você escolhe");
       
        }while(p4!=2);
        // aqui enquanto o usuário não acertar a resposta, a pergunta vai se repetir.
       
        print("Qual maior time Gaúcho? \n1-Grêmio\n2-Grêmio, óbvio\n3-Grêmio, Vermelho não tem chance aqui\n4-Grêmio, apenas Grêmio");
    int p5=scanInt("Qual opção você escolhe");
    if(p5==3) {
   
    print("Você acertou");
   
    }
   
    else {
    print("Resposta errada");
    }
   
    int p6;
    do { print("Qual o Maior campeão da bola de ouro?\n1-Messi\n2-Ribamar\n3-Luan do corinthians\n4-Cristiano Ronaldo");
p6= scanInt("Qual opção você escolhe");
   
    }while(p6!=2);
    // aqui enquanto o usuário não acertar a resposta, a pergunta vai se repetir.
    
    print("Qual o Maior campeão da Europa League\n1-Sevilla\n2-Eintracht Frankfurt\n3-Barcelona\n4-Bob Marley");
    int p7=scanInt("Qual opção você escolhe");
        if(p7==1) {
        print("Você acertou");
       
        }
       
        else { print("Resposta errada");
        }
      //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
        
        int p8;
        do { print("Entre uma noite com a garota(o) que você quiser e um rolê com o Neymar, porquê você escolheria o Neymar\n1-Porque é o Ney\n2-Ney é agro, Ney é tech, Ney é pop.Ney é tudo\n3-Ney, Apenas Ney.\n4-Quem disse que eu prefiro o Ney?");
    p8= scanInt("Qual opção você escolhe");
       
        }while(p8!=2);
        // aqui enquanto o usuário não acertar a resposta, a pergunta vai se repetir.
        
        
        print("R10,R9,Ney ou Pelé\n1-R10\n2-R9\n3-Ney\n4-Pelé");
        int p9=scanInt("Qual opção você escolhe");
            if(p9==1) {
            print("Você acertou");
           
            }
            //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
            else { print("Tudo bem amigo, todos são craques.");
            }
            
            
            print("Pelé ou Maradona\n1-O único que tem 3 copas\n2-Pelé\n3- A única carreira que o Maradona foi maior que o Pelé foi a de pó\n4-Pelé, Rei do futebol");
            int p10=scanInt("Qual opção você escolhe");
                if(p10==3) {
                print("Você acertou");
               
                }
                //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
                else { print("Todo mundo sabe que Pelé é maior e melhor.");
                }
                //Aqui usei um if else para se o usuário responder certo acontecer isso, se responder errado acontecer aquilo
                
                System.out.println("Que nota você dá ao quiz?");
         
        sc.close();
    
}
}