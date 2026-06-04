class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int newc=0;
        int newr=0;
        int[][] result= new int[r][c];
        if(m*n==r*c){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    
                        result[newr][newc]=mat[i][j];
                        newc++;
                    
                    if(newc==c){
                        
                        newr++;
                        newc=0;
                    
                    }

                }
            }
         return result;   
    
            }
            return mat;    
    }


}