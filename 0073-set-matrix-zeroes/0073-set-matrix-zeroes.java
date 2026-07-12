class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;
        int col=matrix[0].length;
        Set<Integer> rowset=new HashSet<>();
        Set<Integer> colset=new HashSet<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowset.add(i);
                    colset.add(j);
                    
                }
            }


        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(rowset.contains(i)||colset.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }

    }
}