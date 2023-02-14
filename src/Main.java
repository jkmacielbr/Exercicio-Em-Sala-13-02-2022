import java.util.List;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Estoque<Livro>listaLivro = new Estoque<>();
        Estoque<Filme>listaFilme = new Estoque<>();
        Estoque<Brinquedo>listaBrinquedo = new Estoque<>();
        Estoque<Album>listaAlbum = new Estoque<>();

        listaLivro.addProduto(new Livro("Livro01"));
        listaLivro.addProduto(new Livro("Livro02"));
        listaLivro.addProduto(new Livro("Livro03"));
        listaFilme.addProduto(new Filme("Filme01"));
        listaFilme.addProduto(new Filme("Filme02"));
        listaBrinquedo.addProduto(new Brinquedo("Brinquedo01"));
        listaBrinquedo.addProduto(new Brinquedo("Brinquedo02"));
        listaAlbum.addProduto(new Album("Album01"));
        listaAlbum.addProduto(new Album("Album02"));

        System.out.println("LISTA OS LIVROS");
        listaLivro.listar().stream().forEach(elemento -> System.out.println(elemento));
        System.out.println();

        System.out.println("DELETAR FILME Filme02");
        listaFilme.deletaProduto("Filme02");
        System.out.println();

        System.out.println("LISTA ATUALIZADA DE FILMES");
        listaFilme.listar().stream().forEach(elemento -> System.out.println(elemento));
        System.out.println();

        System.out.println("LISTANDO BRINQUEDO -> BRINQUEDO01");
        System.out.println(listaBrinquedo.pesquisaProduto("Brinquedo01"));
        System.out.println();

        System.out.println("PESQUISANDO UM ALBUM -> Album02");
        System.out.println(listaAlbum.pesquisaProduto("Album02"));
        System.out.println();

        System.out.println("LISTA ATUALIZADA DE ALBUM");
        listaAlbum.listar().stream().forEach(elemento -> System.out.println(elemento));
        System.out.println();



        System.out.println(Estoque.pesquisaEstoque(listaLivro, new Livro("Livro01")));



    }


}