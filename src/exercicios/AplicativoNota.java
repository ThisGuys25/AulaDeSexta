import java.util.Scanner;

public class AplicativoNota{
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Digite sua nota A1: ");
        float nota_a1 = a1.nextFloat();

        Scanner a2 = new Scanner(System.in);
        System.out.println("Digite sua nota A2: ");
        float nota_a2 = a2.nextFloat();
        
        float nota_a3;
        float soma;

        soma = nota_a1 + nota_a2;
        if(soma < 6){
            Scanner a3 = new Scanner(System.in);
            System.out.println("Digite sua nota A3: ");
            nota_a3 = a3.nextFloat();
            if(nota_a1 < nota_a2){
               nota_a1 = nota_a3;
               soma = nota_a1 + nota_a2;
            }
            else{
                nota_a2 = nota_a3;
                soma = nota_a1 + nota_a2;
            }
        }
        if(soma > 6){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("ALuno reprovado!");
        }
        
    }
}
