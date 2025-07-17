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

    private boolean findPath(boolean[][] grid, Cell star, Cell end, List<Cell> path){
        int row = star.row;
        int col =  star.col;

        // condiciones 1. que este dentro del maze, 2. que sea true
        if(row>= grid.length|| col>= grid[0].length|| !grid [row][col]){
            return false;
        }
        if(row == end.row && col==end.col){
            path.add(star);
         return true;
        }
        if(findPath(grid, new Cell(row+1, col), end, path)){
            path.add(star);
            return true;

        }
        if(findPath(grid, new Cell(row, col+1), end, path)){
            path.add(star);
            return true;

        }

        return false;
    }


}
