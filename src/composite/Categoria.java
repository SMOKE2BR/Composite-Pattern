package composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemCardapio {
    private List<ItemCardapio> itens = new ArrayList<>();

    public void addItem(ItemCardapio item) {
        itens.add(item);
    }

    @Override
    public String getConteudo() {
        StringBuilder conteudo = new StringBuilder("Categoria: " + getDescricao() + "\n");
        for (ItemCardapio item : itens) {
            conteudo.append("  ").append(item.getConteudo()).append("\n");
        }
        return conteudo.toString();
    }
}
