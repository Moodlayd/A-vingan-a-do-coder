

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int lados;
        double per, med;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe os lados do seu polígono: ");
        lados = in.nextInt();
        System.out.println("Informe a medida em cm: ");
        med = in.nextDouble();

        if(lados == 3){
            per = 3 * med;
            System.out.println("TRIANGULO de Perímetro: "+ per);
        }else if (lados == 4) {
            per = 4 * med;
            System.out.println("QUADRADO de Perímetro: " + per);
        }else if(lados == 5){
            per = 5 * med;
            System.out.println("PENTÁGONO de Perímetro: "+ per);
        }else if(lados < 3){
            System.out.println("MENOS DE 3 LADOS NÃO É UM POLÍGONO");
        }else{
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
    }
}