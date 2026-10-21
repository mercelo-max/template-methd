# Práctica para compañeros: Template Method

## Consigna (10 minutos)
Una aplicación prepara dos tipos de sándwich: vegetariano y de pollo. Ambos procesos deben seguir este orden:
1. Preparar el pan.
2. Preparar el relleno (cambia según el tipo).
3. Armar el sándwich.
4. Agregar salsa (paso opcional que puede variar).

Implementá una clase abstracta `PreparadorSandwich` con un método plantilla `preparar()` que controle el orden. Después creá `SandwichVegetariano` y `SandwichPollo`. Incluí un `Main` que prepare ambos.

## Pistas
- El método plantilla debe ser `public final`.
- El paso variable obligatorio puede ser abstracto.
- El paso opcional puede tener una implementación por defecto vacía.
- No hace falta usar paquetes ni bibliotecas externas.

## Solución de referencia
```java
abstract class PreparadorSandwich {
    public final void preparar() {
        prepararPan();
        prepararRelleno();
        armar();
        agregarSalsa();
    }

    private void prepararPan() {
        System.out.println("Preparando pan");
    }

    protected abstract void prepararRelleno();

    private void armar() {
        System.out.println("Armando sandwich");
    }

    protected void agregarSalsa() {
        // Paso opcional.
    }
}

class SandwichVegetariano extends PreparadorSandwich {
    @Override
    protected void prepararRelleno() {
        System.out.println("Agregando vegetales y queso");
    }

    @Override
    protected void agregarSalsa() {
        System.out.println("Agregando salsa de yogur");
    }
}

class SandwichPollo extends PreparadorSandwich {
    @Override
    protected void prepararRelleno() {
        System.out.println("Agregando pollo y lechuga");
    }

    @Override
    protected void agregarSalsa() {
        System.out.println("Agregando mayonesa");
    }
}

public class Main {
    public static void main(String[] args) {
        PreparadorSandwich vegetariano = new SandwichVegetariano();
        PreparadorSandwich pollo = new SandwichPollo();

        vegetariano.preparar();
        System.out.println();
        pollo.preparar();
    }
}
```

## Qué debe observarse en la resolución
- Ambos sándwiches ejecutan los pasos en el mismo orden.
- El relleno y la salsa varían por subclase.
- El código común se escribe una sola vez.
- `preparar()` es `final`, por lo que las subclases no pueden cambiar el flujo general.
