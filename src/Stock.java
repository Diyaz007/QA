import java.util.ArrayList;

public class Stock {
    private int volume = 50;
    private ArrayList<Product> products;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Склад" +
                " \nМесто  = " + getVolume() +
                " \nПродукт = " + getProducts()+"\n";
    }
}
