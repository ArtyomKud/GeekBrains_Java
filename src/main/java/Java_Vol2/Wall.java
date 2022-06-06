package Java_Vol2;

public class Wall extends Inventory {
    private final String name = "Стена";
    private final String purpose = "Перепрыгнуть";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPurpose() {
        return purpose;
    }
}

