

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num, num2;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o 1º numero: ");
        num = in.nextInt();
        System.out.println("Informe o 2º numero: ");
        num2 = in.nextInt();

        if (num == num2){
            System.out.println("Numeros iguais");
        }else if (num > num2){
            System.out.println("Primeiro é maior");
        }else{
            System.out.println("Segundo é maior");
        }
    }
}