

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double nota = 0;
        double media = 0, soma = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 4; i++){
            System.out.printf("Informe sua %dº nota: ",i);
            nota = in.nextDouble();
            while(nota < 0 || nota > 10){
                System.out.println("informe um valor de 0 a 10");
                nota = in.nextDouble();
            }
            soma += nota;
            media = soma / 4;
        }
        if (media > 5){
            System.out.println("Você passou no teste com "+media+" de media! ");
        }else{
            System.out.println("Tente Novamente!");
        }
    }
}