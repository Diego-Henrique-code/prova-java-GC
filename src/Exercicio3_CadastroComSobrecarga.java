public class Exercicio3_CadastroComSobrecarga {
    String nome;
    int quantidade;

    public Exercicio3_CadastroComSobrecarga(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Exercicio3_CadastroComSobrecarga(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        Exercicio3_CadastroComSobrecarga x = new Exercicio3_CadastroComSobrecarga("Caderno");
        Exercicio3_CadastroComSobrecarga y = new Exercicio3_CadastroComSobrecarga("Caneta", 3);
        System.out.println(x.quantidade + y.quantidade);
    }
}

