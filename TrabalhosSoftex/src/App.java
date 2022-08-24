import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
         * ProductOnline productOnline = new ProductOnline("Camiseta", 20d);
         * System.out.println(productOnline);
         * 
         * ObjectOutputStream objectOutput = new ObjectOutputStream(new
         * FileOutputStream("product.bytej"));
         * objectOutput.writeObject(productOnline);
         * objectOutput.close();
         */

        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("product.bytej"));
        ProductOnline productOnline = (ProductOnline) objectInput.readObject();
        objectInput.close();
        System.out.println(productOnline);
    }
}
