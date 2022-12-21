
import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int D = input.nextInt(); // valor do produto com o desconto
    int V = M - D;
    int Z = (D * 100) / M;

        System.out.println("O desconto foi de " + (100 - Z) + "%");
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
  
}
}