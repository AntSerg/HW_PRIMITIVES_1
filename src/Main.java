public class Main {
    public static void main(String[] args) {
        int ticketPrice = 18_394;
        int rublesForBonusMile = 20;
        int bonusMile = ticketPrice / rublesForBonusMile;
        System.out.println("Стоимость билета: " + ticketPrice + " рублей\nНачисленно бонусных миль: " + bonusMile);
        System.out.println();
    }
}