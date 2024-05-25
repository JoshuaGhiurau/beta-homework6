import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ThreePersons threePersons = new ThreePersons();
        ThreeProduct threeProduct = new ThreeProduct();
        WaterBottle waterBottle = new WaterBottle();

        System.out.println(threePersons.vlad);
        System.out.println(threePersons.josh);
        System.out.println(threePersons.michael);

        System.out.println("--------------------------------------++++++++++++++++++++++++++++++---------------------------------------");

        System.out.println(threeProduct.masa);
        System.out.println(threeProduct.scaun);
        System.out.println(threeProduct.macbook);

        System.out.println("--------------------------------------++++++++++++++++++++++++++++++---------------------------------------");

        System.out.println("Mai este stock din masa? " + threeProduct.masa.hasStock());
        System.out.println("Mai este stock din scaun? " + threeProduct.scaun.hasStock());
        System.out.println("Mai este stock din macbook? " + threeProduct.macbook.hasStock());

        System.out.println("--------------------------------------++++++++++++++++++++++++++++++---------------------------------------");

        System.out.println("Este masa furniture? " + threeProduct.masa.isCategory("furniture"));
        System.out.println("Este scaun furniture? " + threeProduct.scaun.isCategory("furniture"));
        System.out.println("Este macbook furniture? " + threeProduct.macbook.isCategory("furniture"));

        System.out.println("--------------------------------------++++++++++++++++++++++++++++++---------------------------------------");

        System.out.println("Are sticla licid? " + waterBottle.apa.hasLiquid());
        System.out.println("Cantitatea de apa este: " + waterBottle.apa.getAvailableLiquid());
        System.out.println("Cantitatea de spatiu liber din sticla este: " + waterBottle.apa.emptyCapacity());
        System.out.println(waterBottle.apa.openBottle());
        System.out.println(waterBottle.apa.closeBottle());

        System.out.println("--------------------------------------++++++++++++++++++++++++++++++---------------------------------------");

        System.out.println(waterBottle.apa.drink());
    }
}