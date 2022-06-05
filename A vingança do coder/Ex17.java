

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int senha = 1234;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a senha de acesso: ");
        senha = in.nextInt();
        while(senha != 1234){
            System.out.println("ACESSO NEGADO! Tente novamente: ");
            senha = in.nextInt();
        }
        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO!");
        }
    }
}