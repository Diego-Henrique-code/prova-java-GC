public class Exercicio8_ConstrutorUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("João", 25);
        System.out.println("Nome: " + u.nome);
        System.out.println("Idade: " + u.idade);
    }
}

class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }
}

