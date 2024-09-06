public class Programa2 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculadora calculadora = new Calculadora();
            char continuar;
    
            do {
                System.out.println("Escolha a operação desejada:");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
    
                int escolha = scanner.nextInt();
    
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
    
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
    
                double resultado = 0;
                boolean operacaoValida = true;
    
                switch (escolha) {
                    case 1:
                        resultado = calculadora.somar(num1, num2);
                        break;
                    case 2:
                        resultado = calculadora.subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(num1, num2);
                        break;
                    case 4:
                        try {
                            resultado = calculadora.dividir(num1, num2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            operacaoValida = false;
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida.");
                        operacaoValida = false;
                        break;
                }
    
                if (operacaoValida) {
                    System.out.printf("O resultado é: %.2f%n", resultado);
                }
    
                System.out.println("Deseja realizar outra operação? (s/n): ");
                continuar = scanner.next().charAt(0);
    
            } while (continuar == 's' || continuar == 'S');
    
            scanner.close();
            System.out.println("Programa encerrado.");
        }
    }