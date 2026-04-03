package biblioteca;

import java.util.Stack;

public class HistoricoNavegacao {
    private Stack<Livro> pilha;

    public HistoricoNavegacao() {
        pilha = new Stack<>();
    }

    // Usuário visualiza um livro
    public void visualizarLivro(Livro livro) {
        pilha.push(livro);
        System.out.println("Visualizou: " + livro);
    }

    // Voltar ao último livro visualizado
    public void voltarUltimoLivro() {
        if (!pilha.isEmpty()) {
            Livro ultimo = pilha.pop();
            System.out.println("Voltando ao livro: " + ultimo);
        } else {
            System.out.println("Histórico vazio.");
        }
    }

    // Mostrar histórico completo
    public void mostrarHistorico() {
        System.out.println("Histórico de navegação: " + pilha);
    }
}