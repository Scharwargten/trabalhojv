import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // -------------------- Evento 1 -------------------- \\
        System.out.println("=== Cadastro do Evento 1 ===");
        System.out.print("Código: ");
        int codigo1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome1 = entrada.nextLine();

        System.out.print("Local: ");
        String local1 = entrada.nextLine();

        System.out.print("Valor da inscrição: ");
        double valor1 = entrada.nextDouble();

        System.out.print("Quantidade de vagas: ");
        int vagas1 = entrada.nextInt();

        System.out.print("Carga horária (em horas): ");
        int carga1 = entrada.nextInt();

        Evento evento1 = new Evento(codigo1, nome1, local1, valor1, vagas1, carga1);

        // -------------------- Evento 2 -------------------- \\
        System.out.println("\n=== Cadastro do Evento 2 ===");
        System.out.print("Código: ");
        int codigo2 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome2 = entrada.nextLine();

        System.out.print("Local: ");
        String local2 = entrada.nextLine();

        System.out.print("Valor da inscrição: ");
        double valor2 = entrada.nextDouble();

        System.out.print("Quantidade de vagas: ");
        int vagas2 = entrada.nextInt();

        System.out.print("Carga horária (em horas): ");
        int carga2 = entrada.nextInt();

        Evento evento2 = new Evento(codigo2, nome2, local2, valor2, vagas2, carga2);

        // -------------------- Evento 3 -------------------- \\
        System.out.println("\n=== Cadastro do Evento 3 ===");
        System.out.print("Código: ");
        int codigo3 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome3 = entrada.nextLine();

        System.out.print("Local: ");
        String local3 = entrada.nextLine();

        System.out.print("Valor da inscrição: ");
        double valor3 = entrada.nextDouble();

        System.out.print("Quantidade de vagas: ");
        int vagas3 = entrada.nextInt();

        System.out.print("Carga horária (em horas): ");
        int carga3 = entrada.nextInt();

        Evento evento3 = new Evento(codigo3, nome3, local3, valor3, vagas3, carga3);

        entrada.close();
    }

}