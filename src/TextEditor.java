import java.util.ArrayList;
import java.util.Scanner;
public class TextEditor {
    private ArrayList<String> history;
    private int currentIndex;

    public TextEditor() {
        this.history = new ArrayList<>();
        this.currentIndex = -1;
    }
    public void write(String text) {
        if (currentIndex < history.size() - 1) {
            history.subList(currentIndex + 1, history.size()).clear();
        }

        if (currentIndex == -1) {
            history.add(text);
        } else {
            history.add(currentIndex + 1, text);
        }
        currentIndex++;
    }

    public void show() {
        if (currentIndex == -1) {
            System.out.println("Tidak ada teks.");
        } else {
            System.out.println(history.get(currentIndex));
        }
    }

    public void undo() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Undo berhasil. Isi teks sekarang: " + history.get(currentIndex));
        } else {
            System.out.println("Tidak bisa undo lagi.");
        }
    }

    public void redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            System.out.println("Redo berhasil. Isi teks sekarang: " + history.get(currentIndex));
        } else {
            System.out.println("Tidak bisa redo lagi.");
        }
    }
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih fungsi:");
            System.out.println("1. Show");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Write");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    textEditor.show();
                    break;
                case 2:
                    textEditor.undo();
                    break;
                case 3:
                    textEditor.redo();
                    break;
                case 4:
                    System.out.print("Masukkan teks: ");
                    String text = scanner.nextLine();
                    textEditor.write(text);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}