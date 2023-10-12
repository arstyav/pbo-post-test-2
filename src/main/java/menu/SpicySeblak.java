package menu;

public class SpicySeblak extends SeblakProduct{
    private String levelSpicy;

    public SpicySeblak(String idProduct, String nameProduct, int priceProduct, String levelSpicy) {
        super(idProduct, nameProduct, priceProduct);
        this.levelSpicy = levelSpicy;
    }

    public final String getLevelSpicy() {
        return levelSpicy;
    }
    public void setLevelSpicy(String levelSpicy) {
        this.levelSpicy = levelSpicy;
    }

    @Override
    public void printProduct() {
        System.out.println("====================================");
        System.out.println("            Spicy Seblak            ");
        System.out.println("====================================");
        System.out.println("> ID: " + getIdProduct());
        System.out.println("> Name: " + getNameProduct());
        System.out.println("> Price: " + getPriceProduct());
        System.out.println("> Level Spicy: " + getLevelSpicy());
        System.out.println("====================================");
    }


}
