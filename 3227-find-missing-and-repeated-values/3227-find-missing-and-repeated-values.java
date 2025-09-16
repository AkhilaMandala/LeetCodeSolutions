class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int o = n * n;

        long sumN = (long) o * (o + 1) / 2;
        long squareN = (long) o * (o + 1) * (2L * o + 1) / 6;

        long sumGrid = 0, squareGrid = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long val = grid[i][j];
                sumGrid += val;
                squareGrid += val * val;
            }
        }

        long val1 = sumGrid - sumN;         // rep - miss
        long val2 = squareGrid - squareN;   // rep^2 - miss^2
        long val3 = val2 / val1;            // rep + miss

        int repeating = (int)((val3 + val1) / 2);
        int missing = (int)(repeating - val1);

        return new int[]{repeating, missing};
    }
}
