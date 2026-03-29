class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int top = 0;
        int bottom = ROWS - 1;

        while (top <= bottom) {
            int midRow = (top+bottom) / 2;
            if(target < matrix[midRow][0]){
                bottom = midRow - 1;
            }
            else if(target > matrix[midRow][COLS-1]){
                top = midRow + 1;
            }
            else{
                top = midRow;
                break;
            }
        }
        
        int targetRow = top;
        if(targetRow >= ROWS || targetRow < 0) {
            return false;
        }
        int l = 0;
        int r = COLS - 1;

        while(l<=r){
            int mid = (l+r) / 2;
            if(target < matrix[targetRow][mid]){
                r = mid - 1;
            }
            else if(target > matrix[targetRow][mid]){
                l = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
