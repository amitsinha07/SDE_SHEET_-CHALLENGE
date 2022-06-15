class Solution {
    public void rotate(int[][] arr) {
        
        int n = arr.length;
        
        //Transpose of matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp; 
            }
        }
        
        //reverse cols
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp; 
            }
        }
    }
}