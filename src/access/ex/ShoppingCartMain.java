package access.ex;

public class ShoppingCartMain {
    // 장바구니에는 상품을 최대 10개만 담을 수 있고 최대 10개만 담을수 있으면 찼다고 출력.
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
