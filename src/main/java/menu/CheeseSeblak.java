package menu;

public class CheeseSeblak extends SeblakProduct{
    private String cheeseType;

    public CheeseSeblak(String idProduct, String nameProduct, int priceProduct, String cheeseType) {
        super(idProduct, nameProduct, priceProduct);
        this.cheeseType = cheeseType;
    }

    public final String getCheeseType() {
        return cheeseType;
    }

    public void setLevelCheese(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public void printProduct() {
        System.out.println("====================================");
        System.out.println("            Cheese Seblak           ");
        System.out.println("====================================");
        System.out.println("> ID: " + getIdProduct());
        System.out.println("> Name: " + getNameProduct());
        System.out.println("> Price: " + getPriceProduct());
        System.out.println("> Cheese Type: " + getCheeseType());
        System.out.println("====================================");
    }

}
