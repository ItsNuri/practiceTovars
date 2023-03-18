import java.util.Arrays;

public class Basket {

    private Tovar[]tovars;

    public Basket(Tovar[] tovars) {
        this.tovars = tovars;
    }

    public Basket() {
    }

    public Tovar[] getTovars() {
        return tovars;
    }

    public void setTovars(Tovar[] tovars) {
        this.tovars = tovars;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "tovars=" + Arrays.toString(tovars) +
                '}';
    }
}
