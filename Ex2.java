package lista3_rafaela;
import java.util.Scanner;
public class Ex2 {
    
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a terceria nota: ");
        nota3 = input.nextDouble();
        
        media = nota1 + nota2 + nota3 / 3;
        System.out.println("A média das notas do aluno é: "+ media);
        
        if (media >= 7){
        System.out.println("O aluno foi aprovado!");
        }
        else{
        System.out.println("Aluno reprovado!");
        }
    }
    
}
