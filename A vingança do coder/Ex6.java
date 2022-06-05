
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int soma = 0, num, media = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº numero: ", i);
            num = in.nextInt();
            soma += num;
            media = (soma) / 10;
        }
        System.out.printf("A soma dos números é %d: \n E a média é %d", soma, media);
    }
}