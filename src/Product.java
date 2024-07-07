package src;

public class Product extends Menu {
    private double price;
    private String catalog;

    public Product(String name, String comment, double price, String catalog) {
        super(name, comment);
        this.price = price;
        this.catalog = catalog;
    }

    public double getPrice() {
        return price;
    }

    public String getCatalog() {
        return catalog;
    }

    @Override
    public void Show() {
        System.out.printf("%-20s | W %s |%s\n", getName(), price, getComment());
    }
    public void Show(int EA) {
        System.out.printf("%-20s | W %s | %s개 |%s\n", getName(), price,EA, getComment());
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Product) {
            Product temp = (Product)obj;
            return this.getName().equals(temp.getName()) &&
                    this.getPrice() == temp.getPrice() &&
                    this.getComment().equals(temp.getComment()) &&
                    this.getCatalog().equals(temp.getCatalog());
        }
        return false;
    }
}
