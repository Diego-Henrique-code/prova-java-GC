import java.util.*;

public class Exercicio14_OrdenacaoDeTarefas implements Comparable<Exercicio14_OrdenacaoDeTarefas> {
    String titulo;

    public Exercicio14_OrdenacaoDeTarefas(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(Exercicio14_OrdenacaoDeTarefas outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    public String toString() {
        return titulo;
    }

    public static void main(String[] args) {
        List<Exercicio14_OrdenacaoDeTarefas> tarefas = new ArrayList<>();
        tarefas.add(new Exercicio14_OrdenacaoDeTarefas("Estudar"));
        tarefas.add(new Exercicio14_OrdenacaoDeTarefas("Almoçar"));
        tarefas.add(new Exercicio14_OrdenacaoDeTarefas("Dormir"));

        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}



