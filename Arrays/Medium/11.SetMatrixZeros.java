/*
    Set Matrix Zeros
    Given a Matrix arr of size n x m, the task is to set all rows and columns to zeroes if a particular element is zero, in constant space complexity.

    Link: https://www.geeksforgeeks.org/problems/set-matrix-zeroes/1

    Time Complexity: O(2*(n*m))
    Space Complexity: O(1)
*/

/*
    Hint: Use the first row and column as markers for zeros, process inner cells first, then handle the first row and column separately.
*/

class Solution {
    public void setMatrixZeroes(int[][] arr) {
        int row0 = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 0){
                    if(i == 0){
                        row0 = 0;   
                    }else{
                        arr[i][0] = 0;
                    }
                    arr[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        
        if(arr[0][0] == 0){
            for(int i = 0; i < arr.length; i++){
                arr[i][0] = 0;
            }
        }
        
        if(row0 == 0){
            for(int i = 0; i < arr[0].length; i++){
                arr[0][i] = 0;
            }
        }
    }
}