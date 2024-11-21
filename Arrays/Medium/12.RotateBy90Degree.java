/*
    Rotate by 90 degree
    Given a square mat[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space.

    Link: https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1

    Time Complexity: O(n^2)
    Auxiliary Space: O(1)
*/

/*
    Hint: Transpose and reverse each row.
*/

class GFG {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i++, j--);
        }
    }
    
    static void rotate(int mat[][]) {
        for(int i = 0; i < mat.length; i++){
            for(int j = i + 1; j < mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        for(int[] arr : mat){
            reverse(arr, 0, arr.length - 1);
        }
    }
}