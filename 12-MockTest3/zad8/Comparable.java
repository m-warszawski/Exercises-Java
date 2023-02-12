import java.util.Arrays;

public interface Comparable {
    static void sort(Product[] products) {
        Product[] array = products;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (array[i].getName().compareTo(array[j].getName()) > 0) {
                    Product temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
//        System.out.println("FDFSD)");
    }
}
