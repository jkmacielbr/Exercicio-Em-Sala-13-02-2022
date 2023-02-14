import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Produto> {

    List<T> lista = new ArrayList<T>();

    public void addProduto(T t) {
        lista.add(t);
    }

    public T pesquisaProduto(String nome) {
        for (T produto : lista) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }

        }
        return null; //lista.stream().filter((c -> c.getClass().equals(nome)))
    }

    public boolean deletaProduto(String nome) {
        T produto = pesquisaProduto(nome);
        if (produto != null) {
            lista.remove(produto);
            return true;
        }
        return false;
    }

    public List<T> listar(){

        return lista;
    }

    public static <T extends Produto> T pesquisaEstoque (Estoque<T> lista2, T t){
        for (T produto : lista2.lista) {
            if (produto.getNome().equals(t.getNome())) {
                return produto;
            }

        }
        return null;
    }



}
