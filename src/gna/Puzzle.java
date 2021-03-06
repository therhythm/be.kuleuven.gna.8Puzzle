package gna;

class Puzzle {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int[][] tiles = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tiles[i][j] = StdIn.readInt();

        Board initial = new Board(tiles);
        Solver solver = new Solver(initial);

        for (Board board : solver.solution())
            System.out.println(board);

        if (!solver.isSolvable())
            System.out.println("No solution possible");
        else
            System.out.println("Minimum number of moves = " + solver.moves());
    }
}


