import java.util.Scanner;

public class Unidade_2 {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.print("Digite o Ano de Nascimento: ");
        int anoNasc = sc.nextInt();

        System.out.print("Digite o Ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoNasc - anoAtual;

        System.out.println("A idade da pessoa é: " + idade);

    }
}
