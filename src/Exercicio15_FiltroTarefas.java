import java.util.ArrayList;

public class Exercicio15_FiltroTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}

