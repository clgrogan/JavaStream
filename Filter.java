import java.util.ArrayList;

public class Filter {

    static ArrayList<Double> prices = new ArrayList<Double>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);
        System.out.println("\nCall method then loop to filter and print prices < 5.");
        filterLowPrices();

        System.out.println(
                "\nStream prices to \".filter\" and then use terminal operation \".forEach\" to print each remaining element.");
        System.out
                .println(
                        "\tprices.stream().filter(price -> price < 5)\n\t\t.forEach(price -> System.out.println(price));");
        prices.stream().filter(price -> price < 5)
                .forEach(price -> System.out.println(price));

        System.out.println();

    }

    public static void filterLowPrices() {
        System.out.println("\n\nLOW PRICES\nUsing a method call and a loop\n below is the loop in the method:");
        System.out.println(
                "\tfor (int i = 0; i < prices.size(); i++) {"
                        + "\n\t\tif (prices.get(i) < 5) {"
                        + "\n\t\t\tSystem.out.println(prices.get(i));"
                        + "\n\t} }");
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                System.out.println(prices.get(i));
            }
        }
    }

}
