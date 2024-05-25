import java.util.Scanner;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private Boolean open;

    public Bottle(Integer totalCapacity, Integer availableLiquid, Boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public Boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public Integer emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        String correct = "You opened the bottle";
        String incorrect = "Bottle already opened";
        if (!open) {
            open = true;
            return correct;
        } else {
            return incorrect;
        }
    }

    public String closeBottle() {
        String correct = "You closed the bottle";
        String incorrect = "Bottle already closed";
        if (open) {
            open = false;
            return correct;
        } else {
            return incorrect;
        }
    }

    public String drink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cat iti doresti sa bei? ");
        int drink = scanner.nextInt();

        String result = drinkFailed();
        System.out.println(result); // Print the result of attempting to open the bottle

        result = notEnoughLiquid(drink);
        if (result != null) {
            return result;
        }

        availableLiquid -= drink;
        return "Ai baut: " + drink + " ml. Au ramas: " + availableLiquid + " ml.";
    }

    public String drinkFailed() {
        String closedMessage = "Vezi ca ii inchisa sticla desteptule, trebe sa o deschizi. Am deschis-o eu acum!";
        String openMessage = "Sticla este deschisa";
        if (!open) {
            openBottle(); // Open the bottle if it's closed
            return closedMessage;
        } else {
            return openMessage;
        }
    }

    public String notEnoughLiquid(int drink) {
        String insufficientMessage = "Din pacate, nu este atat lichid in sticla";
        if (drink > availableLiquid) {
            return insufficientMessage;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "availableLiquid=" + availableLiquid +
                ", totalCapacity=" + totalCapacity +
                ", open=" + open +
                '}';
    }
}
