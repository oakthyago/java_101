import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =new Scanner(System.in);

        System.out.println("Digite uma filme");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Avaliação do Filme");
        double avaliacao = leitura.nextDouble();

        System.out.printf("%s %d %.1f%n", filme, anoDeLancamento, avaliacao);


    }
}
