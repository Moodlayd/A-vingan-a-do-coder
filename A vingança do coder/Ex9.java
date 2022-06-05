
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int j = 0, soma = 0;
        List<String> numeros = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 6; i++){
            System.out.printf("Informe o %dº numero: ", i);
            j = in.nextInt();
            if(j < 72){
                soma += j;
            }
            numeros.add(String.valueOf(j));
        }
        System.out.printf("A soma dos valores informados menores que 72 é: %d\n", soma);
        System.out.println("Você informou todos esses valores" + numeros);
    }
}