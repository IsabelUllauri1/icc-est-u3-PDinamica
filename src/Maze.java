public class Maze {
    private boolean[][] grid;
    private int size;

    public Maze (boolean[][] grid) {
        this.grid = grid;
        this.size = grid.length;
    }

    public void printMaze() {
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? " - " : " * ");
            }
            System.out.println();
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }

}
