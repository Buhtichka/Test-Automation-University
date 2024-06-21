package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setFlavor("Vanilla");
        cake.setPrice(20.0);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: $" + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Chocolate");
        birthdayCake.setPrice(25.0);
        birthdayCake.setCandles(10);
        System.out.println("\n Birthday Cake flavor:" + birthdayCake.getFlavor());
        System.out.println("Birthday Cake price: $" + birthdayCake.getPrice());
        System.out.println("Number of candles: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Red Velvet");
        weddingCake.setPrice(100.0);
        weddingCake.setTiers(3);
        System.out.println("\n Wedding Cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake price: $" + weddingCake.getPrice());
        System.out.println("Number of tiers: " + weddingCake.getTiers());
    }
}
