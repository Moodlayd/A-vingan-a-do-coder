

import java.util.Scanner;
//o 14 é junto com esse
public class Ex22 {
    public static void main(String[] args) {
        double nota, soma = 0, media = 0;
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
        if (media >= 6.0){
            System.out.println("PARABÉNS! Você foi aprovado com a média: "+media);
        }else{
            System.out.println("Infelizmente, você foi reprovado com a media: "+media);
        }
    }
}