import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       // runEjerciciosPD();
       runMaze();
    }

    // public static void runEjerciciosPD() {
    //     EjercicioPD ejercicioPD = new EjercicioPD();
    //     System.out.println("Fibonacci recursivo");
    //     long start = System.nanoTime();
    //     long resultado = ejercicioPD.getFibonacci(50);
    //     long end = System.nanoTime();
    //     long duration = end - start;
    //     System.out.println("resultado= " + resultado + ", en tiempo: " + duration);

    //     System.out.println("Fibonacci recursivo Caching");
    //     start = System.nanoTime();
    //     resultado = ejercicioPD.getFibonacciPD(100);
    //     end = System.nanoTime();
    //     duration = end - start;
    //     System.out.println("resultado= " + resultado + ", en tiempo: " + duration);

    // }

    private static void runMaze() {
        boolean[][] predefinedMaze = {
                { true, true, true, true },
                { false, true, true, true },
                { true, true, false, false },
                { true, true, true, true }

        };
        Maze maze = new Maze(predefinedMaze);
        System.out.println("LABERINTO CARGADO: ");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolver> solverS = Arrays.asList(
                new MazeSolverRecursive());

        MazeSolver solver = solverS.get(0);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado: ");
        System.out.println(path);


        //compl
        System.out.println("\nCamino encontrado recursivo completo: ");
        MazeSolver solverComplete = solverS.get(0);
        path = solverComplete.getPath(maze.getGrid(),start,end);
        System.out.println(path);

    }
}
