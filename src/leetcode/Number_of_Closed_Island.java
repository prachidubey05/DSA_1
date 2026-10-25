class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length, count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 0 && dfs(grid, r, c)) count++;
            }
        }
        return count;
    }

    private boolean dfs(int[][] g, int r, int c) {
        if (r < 0 || r >= g.length || c < 0 || c >= g[0].length) return false;
        if (g[r][c] == 1) return true;
        g[r][c] = 1; 
        boolean top = dfs(g, r - 1, c), bot = dfs(g, r + 1, c);
        boolean left = dfs(g, r, c - 1), right = dfs(g, r, c + 1);
        return top && bot && left && right;
    }
}
