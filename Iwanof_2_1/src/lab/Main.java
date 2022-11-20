package lab;

public class Main {
    /**
     * Method, where the individual task is begin tested
     * @param args - Command line arguments
     */
    public static void main(String[] args) {
        MetroWithSort metro;
        metro = new MetroWithSort("Geroev Praci", "1955",
                "21:32", "Biggest Comment for metro", 50);
        metro = new MetroWithSort("Armiiska", "1978",
                "22:12", "Comment less", 170);
        metro = new MetroWithSort("Prospekt Gagarina", "1931",
                "23:11", "small", 37);
        metro.Test();
    }
}
