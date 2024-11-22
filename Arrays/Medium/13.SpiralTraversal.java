/*
    Spiral Traversal of Matrix
    You are given a rectangular matrix, and your task is to return an array while traversing the matrix in spiral form.

    Link: https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

    Time Complexity: O(n*m)
    Auxiliary Space: O(n*m)
*/

/*
    Hint:  traverse right along the top, down the right, left along the bottom, and up the left, shrinking the boundaries after each layer. 
    Use up, down, left, and right pointers to track the shrinking edges.
*/

class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int up = 0, down = mat.length - 1, left = 0, right = mat[0].length - 1;
        
        while(left <= right && up <= down){
            
            if(left > right) break;
            for(int i = left; i <= right; i++){
                ans.add(mat[up][i]);
            }
            up++;
            
            if(up > down) break;
            for(int i = up; i <= down; i++){
                ans.add(mat[i][right]);
            }
            right--;
            
            if(left > right) break;
            for(int i = right; i >= left; i--){
                ans.add(mat[down][i]);
            }
            down--;
            
            if(up > down) break;
            for(int i = down; i >= up; i--){
                ans.add(mat[i][left]);
            }
            left++;
        }
        
        return ans;
    }
}