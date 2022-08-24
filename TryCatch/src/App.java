import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        String idade = sc.nextLine();

        try {
            System.out.println("Sua idade: " + idade);
        } catch (Exception e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        sc.close();
    }
}
