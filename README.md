# 🧩 Proyecto: Ejercicios de Programación Dinámica y Resolución de Laberintos

Este proyecto implementa dos algoritmos fundamentales:
1. **Cálculo de la serie de Fibonacci** con y sin programación dinámica.
2. **Resolución de laberintos** utilizando un algoritmo recursivo de backtracking.

## 📁 Estructura del Proyecto

├── App.java # Clase principal que ejecuta los ejercicios
├── EjercicioPD.java # Algoritmos para calcular Fibonacci (recursivo y con caché)
├── Maze.java # Representación del laberinto (matriz booleana)
├── MazeSolver.java # Interfaz para resolver laberintos
├── MazeSolverRecursive.java # Solución recursiva básica
├── MazeSolverRecursiveComp.java # Solución recursiva completa (más robusta)
├── Cell.java # Clase auxiliar que representa una celda (fila, columna)


## 🚀 Cómo Ejecutar

Para compilar y ejecutar el programa desde la terminal:

```bash
javac *.java
java App
 ```
## Módulo 1: Fibonacci
Archivo: EjercicioPD.java

Se implementan dos versiones del algoritmo de Fibonacci:

getFibonacci(n)
Versión recursiva pura. Tiene alta complejidad temporal y no es eficiente para valores grandes.

getFibonacciPD(n)
Versión optimizada con programación dinámica (memoización). Es mucho más rápida al almacenar subproblemas previamente calculados.

Ejemplo de ejecución
java
Copiar
Editar
getFibonacci(50);       // Recursivo lento
getFibonacciPD(100);    // Con cache rápida

## 🧭 Módulo 2: Resolución de Laberinto
Archivos relacionados:
Maze.java, MazeSolverRecursive.java, MazeSolverRecursiveComp.java, Cell.java

Este módulo resuelve laberintos representados como una matriz de booleanos, donde:

true representa un camino válido.

false representa un obstáculo o pared.

El algoritmo implementa backtracking recursivo para encontrar un camino desde una celda de inicio hasta una celda destino.

Ejemplo de Laberinto
Visualización por consola:
```
 -  -  -  -
 *  -  -  -
 -  -  *  *
 -  -  -  -
```

Leyenda:

- camino permitido (true)

* obstáculo (false)

Algoritmos disponibles
MazeSolverRecursive: versión básica, explora solo abajo y derecha.

MazeSolverRecursiveComp: versión completa, explora en 4 direcciones (abajo, derecha, arriba, izquierda) y controla visitados.

## Results
<img width="1193" height="134" alt="Screenshot 2025-07-16 082109" src="https://github.com/user-attachments/assets/e3716bc0-e1d3-40ab-b295-eba73d153764" />

<img width="962" height="341" alt="Screenshot 2025-07-16 215711" src="https://github.com/user-attachments/assets/f3f6caec-b317-4d1c-9266-4df3257e21d2" />


## 📦 Dependencias
Este proyecto está implementado completamente en Java puro.
No se requiere ninguna librería externa.

## ✍️ Autor
Isabel Ullauri

