import java.util.Scanner;

public class IceCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] energias = new double[10];
        double soma = 0;
        double maior = 0;
        int indice_maior = 0;
        int altissima_energia = 0;

        System.out.println("--- Sistema de monitoramento IceCube ---");
        System.out.println("Me informe os níveis de energia registrados em TeV por favor meu mano:");

        for (int i = 0; i < energias.length; i++) {
            System.out.print("Sensor [" + i + "]: ");
            energias[i] = sc.nextDouble();

            soma += energias[i];

            if (i == 0 || energias[i] > maior) {
                maior = energias[i];
                indice_maior = i;
            }

            if (energias[i] > 100) {
                altissima_energia++;
            }
        }
 
        double media = soma / energias.length;

        System.out.println();
        System.out.println(" Relatorio de monitoramento do IceCube ");
        System.out.printf("Sendo a media de energia capturada de %.2f TeV%n", media);
        System.out.printf("O maior pico de energia indo de %.2f TeV (O Sensor [%d])%n", maior, indice_maior);
        System.out.println("Por fim o total de sensores com evento menor que 100 TeV: " + altissima_energia);

        sc.close();

    }
}