package composite;

public class Cardapio {
    private ItemCardapio menu;

    public void setMenu(ItemCardapio menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu.getConteudo();
    }
}
