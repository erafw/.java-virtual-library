package biblioteca;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ===== Semana 2: Lista de Livros =====
        LinkedList<Livro> listaLivros = new LinkedList<>();

        // Adicionando livros
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l3 = new Livro("1984", "George Orwell", 1949);

        listaLivros.add(l1);
        listaLivros.add(l2);
        listaLivros.add(l3);

        System.out.println("📚 Lista de livros:");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        listaLivros.removeIf(livro -> livro.getTitulo().equals("Dom Casmurro"));

        System.out.println("\n📚 Lista após remoção:");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("\nPrimeiro livro: " + listaLivros.getFirst());
        System.out.println("Último livro: " + listaLivros.getLast());

        // ===== Semana 3: Fila de Espera =====
        System.out.println("\n==== Fila de Espera ====");
        FilaEspera fila = new FilaEspera();
        fila.adicionarUsuario("Maria");
        fila.adicionarUsuario("João");
        fila.adicionarUsuario("Ana");
        fila.mostrarFila();
        fila.atenderUsuario();
        fila.mostrarFila();

        // ===== Semana 3: Histórico de Navegação =====
        System.out.println("\n==== Histórico de Navegação ====");
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.visualizarLivro(l1);
        historico.visualizarLivro(l2);
        historico.visualizarLivro(l3);
        historico.mostrarHistorico();
        historico.voltarUltimoLivro();
        historico.mostrarHistorico();
    }
}