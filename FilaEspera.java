package biblioteca;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private Queue<String> fila;

    public FilaEspera() {
        fila = new LinkedList<>();
    }

    // Usuário entra na fila
    public void adicionarUsuario(String nomeUsuario) {
        fila.add(nomeUsuario);
        System.out.println(nomeUsuario + " entrou na fila de espera.");
    }

    // Usuário recebe o livro (sai da fila)
    public void atenderUsuario() {
        if (!fila.isEmpty()) {
            String usuario = fila.poll();
            System.out.println(usuario + " recebeu o livro!");
        } else {
            System.out.println("Fila vazia, nenhum usuário aguardando.");
        }
    }

    // Mostrar fila atual
    public void mostrarFila() {
        System.out.println("Fila de espera: " + fila);
    }
}