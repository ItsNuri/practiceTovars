import java.util.Arrays;

public class Category {
    private String name;
    private Tovar[]tovars;

    public Category(String name, Tovar[] tovars) {
        this.name = name;
        this.tovars = tovars;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tovar[] getTovars() {
        return tovars;
    }

    public void setTovars(Tovar[] tovars) {
        this.tovars = tovars;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", tovars=" + Arrays.toString(tovars) +
                '}';
    }
}
