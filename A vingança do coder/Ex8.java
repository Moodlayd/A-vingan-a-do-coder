

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int n , soma = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº numero: ", i);
            n = in.nextInt();
            soma += n;
        }
        System.out.printf("A soma dos números informados é %d", soma);
    }
}