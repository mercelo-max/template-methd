public class PreparadorTe extends PreparadorBebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Colocando saquito de te");
    }

    @Override
    protected void agregarExtra() {
        System.out.println("Agregando limon");
    }
}
