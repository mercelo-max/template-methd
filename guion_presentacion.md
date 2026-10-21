# Guion de exposición — Template Method

Material complementario para la presentación de 16 diapositivas. Está pensado para una clase de **Análisis de Sistemas** y una exposición de 20 minutos, seguida de 10 minutos de práctica y 5 minutos de preguntas.

## Reparto sugerido de los 20 minutos

| Tiempo | Responsable | Diapositivas | Qué explicar |
|---|---|---:|---|
| 0–3 min | Integrante 1 | 1–2 | Presentar el objetivo, el caso de la cafetería y los requisitos funcionales. Distinguir qué pasos son comunes y cuáles varían. |
| 3–6 min | Integrante 1 | 3–5 | Mostrar la duplicación de la solución inicial, presentar Template Method y explicar los roles del UML genérico. |
| 6–11 min | Integrante 2 | 6–8 | Recorrer la clase abstracta, los métodos `final`, `abstract` y el hook; después relacionarlos con las clases concretas y el UML del ejemplo. |
| 11–14 min | Integrante 2 | 9 | Ejecutar el `Main`, leer la salida y explicar el polimorfismo. |
| 14–17 min | Ambos | 10–11 | Comparar Template Method con Strategy y justificar cuándo conviene —o no— usar el patrón. |
| 17–20 min | Ambos | 12 | Presentar el ejercicio, aclarar la consigna y explicar qué deben identificar los grupos. La solución está en las diapositivas 13–14 para usarla después de la práctica. |

## Práctica de 10 minutos

La consigna pide diseñar preparadores de sándwiches vegetarianos y de pollo. Ambos procesos preparan el pan, el relleno y el sándwich; la salsa es opcional.

1. **Minutos 0–2:** identificar los pasos comunes y variables.
2. **Minutos 2–5:** diseñar la clase abstracta y el método `preparar()` que fija el orden.
3. **Minutos 5–8:** definir las clases concretas y sobrescribir los métodos variables.
4. **Minutos 8–10:** revisar qué se evita duplicar y compartir la solución.

## Preguntas que pueden aparecer

**¿Por qué `preparar()` es `final`?**  
Para impedir que las subclases cambien el orden definido por la clase base. En este ejemplo, el orden es una regla del proceso.

**¿Cuál es la diferencia entre un método abstracto y un hook?**  
El método abstracto no tiene implementación y obliga a las clases concretas a definir el paso variable. El hook tiene una implementación por defecto —incluso puede quedar vacía— y permite personalizar un paso opcional.

**¿Template Method y Strategy son lo mismo?**  
No. Template Method utiliza herencia para fijar el flujo y permitir variaciones en algunos pasos. Strategy utiliza composición para intercambiar algoritmos o estrategias.

**¿Por qué no usar siempre Template Method?**  
Porque la herencia puede añadir rigidez y complejidad. El patrón vale la pena cuando hay una secuencia común, estable y justificada por los requisitos.

**¿Dónde se ve el polimorfismo?**  
`cafe` y `te` tienen tipo de referencia `PreparadorBebida`, pero apuntan a objetos concretos distintos. Al llamar `preparar()`, cada objeto ejecuta la implementación concreta de los pasos sobrescritos.

**¿Qué ocurre si queremos agregar chocolate al café?**  
Se puede personalizar el hook `agregarExtra()` en `PreparadorCafe`. Si las reglas de extras se vuelven demasiado complejas, conviene volver a analizar el diseño en lugar de forzar toda la lógica en el hook.

## Cierre sugerido

“Desde Análisis de Sistemas, primero detectamos los requisitos comunes y variables. Luego modelamos una solución que mantiene el flujo compartido en una clase base y deja que las clases concretas definan los detalles. Template Method es útil si esa estructura realmente se repite y permanece estable”.
