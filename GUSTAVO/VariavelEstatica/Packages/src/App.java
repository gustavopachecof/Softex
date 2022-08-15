import java.util.Scanner;

import ferramentas.Martelo;
import funcionario.funcionario;

public class App {

    public static void main(String[] args) {

        pessoa g1Pessoa = new pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nome: %s \nIdade: %d", g1Pessoa.getNome(), g1Pessoa.getIdade());
        
        boolean Ferias = true;
        boolean martelo = false;
        
        Martelo.Martelar(martelo);
        funcionario.ferias(Ferias);

        sc.close();
    }

}