import java.util.Scanner;

public class UsaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não
    // for explicitamente declarado
    public UsaPessoa() {
    }

    public static void main(String[] args) {
        //Declara objeto pessoa1
        Scanner userinput = new Scanner(System.in);
        //Cria o objeto pessoa1 que é instância da classe
        Pessoa pessoa1 = new Pessoa();
        //Define os valores para os atributos de pessoa1
        System.out.println("Introduza o nome: ");
        pessoa1.setNome(userinput.nextLine());
        System.out.println("Introduza a idade(int): ");
        pessoa1.setIdade(Integer.parseInt(userinput.nextLine()));
        System.out.println("Introduza o genero(char): ");
        pessoa1.setGenero(userinput.next().charAt(0));

        System.out.println(
                "O objeto pessoa1 chama-se " + pessoa1.getNome() +
                        ", é do sexo " + pessoa1.getGenero() +
                        ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();

    }
}