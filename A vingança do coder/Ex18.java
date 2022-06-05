

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
         int sexo;
         double imc, h;
         Scanner in = new Scanner(System.in);

        System.out.println("[1] Masculino -- [2] Feminino");
        sexo = in.nextInt();
        System.out.println("Informe sua altura: ");
        h = in.nextDouble();

        if (sexo == 1){
            //masculino
            imc = (72.7 * h) - 58;
            System.out.printf("Seu peso ideal seria: %.2f", imc);
        }else{
            //feminino
            imc = (62.1 *h) - 44.7;
            System.out.printf("Seu peso ideal seria: %.2f", imc);
        }
    }
}