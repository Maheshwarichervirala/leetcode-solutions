class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] ans = new int[rows * cols][2];

        int[][] dir = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };

        ans[0] = new int[]{rStart, cStart};

        int index = 1;
        int steps = 1;
        int d = 0;

        while (index < rows * cols) {

            for (int i = 0; i < 2; i++) {

                for (int j = 0; j < steps; j++) {

                    rStart += dir[d][0];
                    cStart += dir[d][1];

                    if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {

                        ans[index++] = new int[]{rStart, cStart};
                    }
                }

                d = (d + 1) % 4;
            }

            steps++;
        }

        return ans;
    }
}