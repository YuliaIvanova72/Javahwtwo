public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        long price = 10_000;
        long miles = service.calculate(price, true);
        System.out.println(miles);
    }
}