public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
         int ticketPrice = 10_000;
         int pricesMiles = 20;
         int miles = service.calculate ( ticketPrice, pricesMiles ); // Количество миль

        System.out.println();
        System.out.println(miles);
    }
}