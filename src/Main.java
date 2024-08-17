public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;

        int miles = service.calculate(ticketPrice); // Количество миль

        System.out.println();
        System.out.println(miles);
    }
}