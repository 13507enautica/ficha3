public class Pessoa {
    private String nome;
    private int idade;
    private char genero;

    public void falar() {
        System.out.println("Ola!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public char getGenero() {
        return genero;
    }

    /* Construtor default para os objetos da classe
                    Pessoa*/
    public Pessoa() {
    }

    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
    }

    public Pessoa(String n, char g, int i) {
        this(n, g); // usa o construtor anterior
        this.idade = i;
    }

    public Pessoa(String n, int i, char g) {
        nome = n;
        idade = i;
        genero = g;
    }
}