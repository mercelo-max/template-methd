# Template Method: preparación de café y té

Proyecto educativo en Java para explicar y defender el patrón de diseño **Template Method**, pensado para la materia Análisis de Sistemas.

## Requisitos
- JDK instalado (Java 8 o superior).
- Terminal o IDE como IntelliJ IDEA, Eclipse o VS Code.

## Ejecutar la versión sin patrón
```bash
cd java/sin_patron
javac *.java
java Main
```

## Ejecutar la versión con Template Method
```bash
cd java/con_patron
javac *.java
java Main
```

Si usás Windows PowerShell, los comandos son iguales. Ejecutá cada versión desde su propia carpeta para evitar mezclar los archivos `Main.java`.

## Qué comparar
En la versión sin patrón, los pasos de hervir agua y servir en taza se repiten en las clases concretas. En la versión con patrón, esos pasos comunes están centralizados en `PreparadorBebida`. El método `preparar()` fija el orden y las subclases implementan los pasos variables.

## Contenido del paquete
- `java/sin_patron/`: versión inicial sin el patrón.
- `java/con_patron/`: versión refactorizada con Template Method.
- `uml/`: diagramas genérico y concreto en PlantUML.
- `practica/`: consigna y solución sugerida del ejercicio.
- `documento_trabajo.pdf`: documento explicativo de apoyo.
- `presentacion.pptx`: presentación editable de 16 diapositivas con el problema, UML, código Java, comparación con Strategy, criterios de uso, ejercicio y bibliografía.
- `guion_presentacion.md`: distribución sugerida de los 20 minutos, práctica de 10 minutos y preguntas frecuentes.
- `verificacion_ejecucion.txt`: registro de verificación del ejemplo Java.

## Nota para la defensa
El patrón no es automáticamente mejor en todos los casos. Se justifica si existen varios procesos con una estructura estable y algunos pasos variables. Si solo hay una bebida y no se espera agregar variantes, la abstracción puede ser innecesaria.

## Para personalizar antes de entregar
Reemplazá `[Nombre 1]` y `[Nombre 2]` en la portada, revisá las convenciones de la cátedra para UML y bibliografía, y adaptá el guion a la distribución real del equipo. El ZIP incluye los materiales fuente, pero no crea un repositorio remoto ni genera commits de Git.
