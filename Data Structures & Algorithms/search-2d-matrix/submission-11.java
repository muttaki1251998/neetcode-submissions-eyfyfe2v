class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int top = 0;
        int bottom = ROWS - 1;
        int targetRow = -1;
        while(top <= bottom) {
            int midRow = (top + bottom) / 2;
            if(target < matrix[midRow][0]) {
                bottom = midRow - 1;
            }
            else if(target > matrix[midRow][COLS-1]) {
                top = midRow + 1;
            }
            else {
                targetRow = midRow;
                break;
            }
        }

        // Edge case if target does not exist
        if(targetRow == -1)
        {
            return false;
        }

        int left = 0;
        int right = COLS - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(target < matrix[targetRow][mid]){
                right = mid - 1;
            }
            else if(target > matrix[targetRow][mid]){
                left = mid + 1;
            }
            else {
             return true;
            }
        }
        return false;  
    }
}
