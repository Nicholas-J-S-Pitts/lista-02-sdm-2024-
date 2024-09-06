import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            System.out.println("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();

            IMC imc = new IMC(peso, altura);

            double valorIMC = imc.calcularIMC();
            String categoria = imc.obterCategoria();

            System.out.printf("O IMC é %.2f e a categoria é: %s%n", valorIMC, categoria);


            System.out.println("Deseja calcular o IMC novamente? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}