package lista3_rafaela;
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        double percValid, percBranco, percNulo, validos, brancos, nulos, eleitores;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Quantos votos foram validos? ");
        validos = input.nextDouble();
        System.out.println("Quantos votos foram brancos? ");
        brancos = input.nextDouble();
        System.out.println("Quantos votos foram nulos? ");
        nulos = input.nextDouble();
        
        eleitores = validos + brancos + nulos;
        
        percValid = (validos * 100)/ eleitores;
        System.out.println("Votos validos: "+ percValid);
        percBranco = (brancos * 100)/ eleitores;
        System.out.println("Votos brancos"+ percBranco);
        percNulo = (nulos * 100)/ eleitores;
        System.out.println("Votos nulos: "+ percNulo);
    }
    
}
