

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int maca;
        double valor = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de maças: ");
        maca = in.nextInt();
        if (maca >= 1 && maca < 12){
            valor = maca * 0.30;
            System.out.printf("Menos de 12, suas maças saem por 0.30 centavos cada, o total da suas compra deu %.2f", valor);
        }else{
            valor = maca * 0.25;
            System.out.printf("Mais de 12, suas maças saem por 0.25 centavos cada, o total da sua compra deu: %.2f", valor);
        }
    }
}