public class PreparadorCafe extends PreparadorBebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Filtrando cafe");
    }

    @Override
    protected void agregarExtra() {
        System.out.println("Agregando azucar");
    }
}
