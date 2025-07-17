import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursive implements MazeSolver {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell star, Cell end) {
        List<Cell> path = new ArrayList<>();
        //primero si el laberinto existe y tenga datos;

        if(grid== null || grid.length==0){
            return path;

        }
        if(findPath(grid, star, end, path)){
            return path;
        }
        return new ArrayList<>();
        //return Path;  (solicitadas)
    }

    private boolean findPath(boolean[][] grid, Cell current, Cell end, List<Cell> path) {
    int row = current.getRow();
    int col = current.getCol();

    // Verifica fuera de límites o bloqueado
    if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || !grid[row][col]) {
        return false;
    }

    // Marca como visitado
    grid[row][col] = false;

    if (row == end.getRow() && col == end.getCol()) {
        path.add(current);
        return true;
    }

    // Movimiento en las 4 direcciones
    Cell[] directions = {
        new Cell(row + 1, col), new Cell(row - 1, col),
        new Cell(row, col + 1), new Cell(row, col - 1)
    };

    for (Cell next : directions) {
        if (findPath(grid, next, end, path)) {
            path.add(current);
            return true;
        }
    }

    return false;
}


}
