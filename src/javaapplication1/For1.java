public class For1 {
    public static void main(String[] args) {
        String[] menu = {"Milo", "Kopi", "Teh", "Susu", "Jus"};
        
        System.out.println("Jadwal minum:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
        }
    }
}