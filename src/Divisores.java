
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Divisores {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num, cont=0;

        do {

            System.out.println("Dame el valor de un numero: ");
            num = Integer.parseInt(bf.readLine());
            
 

        } while (num < 1 || num > 1000000);
        
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0){
                cont++;
            }
           
        }
        
        System.out.println(cont);
    }
    
}
