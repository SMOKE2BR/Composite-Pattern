package composite;

public class Main {
    public static void main(String[] args) {
        Prato prato1 = new Prato();
        prato1.setDescricao("Lasanha");
        prato1.setPreco(35.0f);

        Prato prato2 = new Prato();
        prato2.setDescricao("Pizza Margherita");
        prato2.setPreco(40.0f);

        Categoria categoria = new Categoria();
        categoria.setDescricao("Pratos Principais");
        categoria.addItem(prato1);
        categoria.addItem(prato2);

        Cardapio cardapio = new Cardapio();
        cardapio.setMenu(categoria);

        System.out.println(cardapio.getMenu());
    }
}
