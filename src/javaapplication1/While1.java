public class While1 {
    public static void main(String[] args) {
        String[] menu = {"Milo", "Kopi", "Teh", "Susu", "Jus"};
        
        System.out.println("Jadwal minum:");
        int i = 0;
        while (i < menu.length) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        }
    }
}