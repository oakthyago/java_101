import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner leitura =new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int i = 0;



        while (nota != -1){
            System.out.println("Digite notas e use -1 para encerrar");
            nota = leitura.nextInt();
            if(nota != -1) {

                media += nota;
                i += 1;
            }
        }
        System.out.printf("A média das notas é %.2f%n" ,media/i);

    }
}
