package composite;

public class Prato extends ItemCardapio {
    private float preco;

    public float getPreco() { return preco; }
    public void setPreco(float preco) { this.preco = preco; }

    @Override
    public String getConteudo() {
        return "Prato: " + getDescricao() + " - R$" + preco;
    }
}
