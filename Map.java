import java.util.ArrayList;
import java.util.stream.Collectors;

public class Map {

    static ArrayList<Double> prices = new ArrayList<Double>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> withTax = new ArrayList<Double>();
        tax(withTax);

        ArrayList<Double> taxMap = new ArrayList<Double>();
        taxMap.addAll(prices.stream()
                .map((price) -> price * 1.13)
                .collect(Collectors.toList()));
        System.out.println("\nLoopy");
        System.out.println(withTax.toString());
        System.out.println("\nMap");
        System.out.println(taxMap.toString());
        System.out.println();
    }

    public static void tax(ArrayList<Double> withTax) {
        for (int i = 0; i < prices.size(); i++) {
            withTax.add(prices.get(i) * 1.13);
        }
    }

}
