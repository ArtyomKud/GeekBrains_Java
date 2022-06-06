package Java_Vol2;

public class Treadmill extends Inventory{
    private final String name = "Беговая дорожка";
    private final String purpose = "Бегать";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPurpose() {
        return purpose;
    }
}






