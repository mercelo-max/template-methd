public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIN PATRON: CAFE ===");
        new PreparadorCafe().preparar();

        System.out.println("\n=== SIN PATRON: TE ===");
        new PreparadorTe().preparar();
    }
}
