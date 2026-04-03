package biblioteca;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Criando a lista encadeada de livros
        LinkedList<Livro> listaLivros = new LinkedList<>();

        // Adicionando livros
        listaLivros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        listaLivros.add(new Livro("1984", "George Orwell", 1949));

        // Listando todos os livros
        System.out.println("📚 Lista de livros:");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        // Removendo um livro pelo título
        listaLivros.removeIf(livro -> livro.getTitulo().equals("Dom Casmurro"));

        System.out.println("\n📚 Lista após remoção:");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        // Acessando o primeiro e o último livro
        System.out.println("\nPrimeiro livro: " + listaLivros.getFirst());
        System.out.println("Último livro: " + listaLivros.getLast());
    }
}