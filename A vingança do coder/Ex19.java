

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int g, i;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe os gols do Grêmio: ");
        g = in.nextInt();
        System.out.println("Informe os gols do Inter: ");
        i = in.nextInt();

        if (g == i){
            System.out.println("EMPATE");
        }else if(g > i){
            System.out.println("GRÊMIO GANHOU!");
        }else{
            System.out.println("INTER GANHOU!");
        }
    }
}