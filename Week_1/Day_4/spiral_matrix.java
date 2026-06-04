class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int rw=n-1;
        int tw=0;
        int lw=0;
        int dw=m-1;
        List<Integer> result = new ArrayList<>();
        while(tw<=dw && lw<=rw){
        for(int j=lw;j<=rw;j++){
            result.add(matrix[tw][j]);
        }
        tw++;
        for(int i=tw;i<=dw;i++){
            result.add(matrix[i][rw]);
        }
        rw--;
        if(tw<=dw){
        for(int j=rw;j>=lw;j--){
            result.add(matrix[dw][j]);
        }
        dw--;
        }
        if(lw<=rw){
        for(int i=dw;i>=tw;i--){
            result.add(matrix[i][lw]);
        }
        lw++;        
        }
        }

        return result;
    }
}