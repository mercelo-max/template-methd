public abstract class PreparadorBebida {

    // Template Method: fija el orden del algoritmo.
    public final void preparar() {
        hervirAgua();
        prepararBebida();
        servirEnTaza();
        agregarExtra();
    }

    private void hervirAgua() {
        System.out.println("Hirviendo agua");
    }

    // Cada bebida debe definir su forma de preparacion.
    protected abstract void prepararBebida();

    private void servirEnTaza() {
        System.out.println("Sirviendo en una taza");
    }

    // Hook opcional: una subclase puede redefinirlo.
    protected void agregarExtra() {
        // Por defecto, no se agrega nada.
    }
}
