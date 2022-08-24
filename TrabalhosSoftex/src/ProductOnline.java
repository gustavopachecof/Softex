import java.io.Serializable;

public class ProductOnline implements Serializable {

    private String name;
    private Double price;
    private static final long serialVersionUID = 8847923823887048081l;
    
    public ProductOnline() {}

    public ProductOnline(String name, Double price){
        this.price = price;
        this.name = name;
    }
    
}
