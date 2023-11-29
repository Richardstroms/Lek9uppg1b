public class App {
    public static void main(String[] args) throws Exception {
 
        ritaLinje(23);
    }

    public static void ritaLinje(int längd) {
        for (int i = 0; i < längd; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
