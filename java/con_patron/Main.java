public class Main {
    public static void main(String[] args) {
        // La variable usa el tipo abstracto; el objeto es concreto.
        PreparadorBebida cafe = new PreparadorCafe();
        PreparadorBebida te = new PreparadorTe();

        System.out.println("=== CON TEMPLATE METHOD: CAFE ===");
        cafe.preparar();

        System.out.println("\n=== CON TEMPLATE METHOD: TE ===");
        te.preparar();
    }
}
