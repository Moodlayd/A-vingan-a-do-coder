

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int op, n1, n2, res=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        n1 = in.nextInt();
        System.out.println("1[Adição],  2[Subtração],  3[Divisão],  4[Multiplicação]");
        op = in.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = in.nextInt();
        while(op <= 0 || op > 4){
            System.out.println("Escolha umas das operações matematicas");
            System.out.println("1[Adição],  2[Subtração],  3[Divisão],  4[Multiplicação]");
            op = in.nextInt();
        }
        switch (op){
            case 1:
                res = n1 + n2;
                break;
            case 2:
                res = n1 - n2;
                break;
            case 3:
                res = n1 / n2;
                break;
            case 4:
                res = n1 * n2;
                break;
        }
        System.out.println(res);
    }
}