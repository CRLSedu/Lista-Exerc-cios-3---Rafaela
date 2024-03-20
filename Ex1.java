package lista3_rafaela;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextInt();
        
        if (num1 > num2){
        System.out.println("O resultado da divisão é: "+ num1 / num2);
        }
        else{
        System.out.println("ERRO, não é possível realizar a divisão");
        }
    }
    
}
