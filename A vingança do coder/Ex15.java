

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int idade, ano;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        ano = in.nextInt();
        idade = 2022 - ano;
        if (idade >= 16){
            System.out.println("Já pode votar!");
        }else{
            System.out.println("Não pode votar ainda");
        }
    }
}