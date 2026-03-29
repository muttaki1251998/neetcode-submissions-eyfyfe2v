class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        top, bottom = 0, ROWS - 1

        while top <= bottom:
            mid_row = (top+bottom) // 2
            if(target > matrix[mid_row][-1]):
                top = mid_row + 1
            elif(target < matrix[mid_row][0]):
                bottom = mid_row - 1
            else:
                break
        if (top > bottom):
            return False

        mid = mid_row
        l, r = 0, COLS - 1

        while l <= r:
            mid_element = (l+r) // 2
            if(target < matrix[mid][mid_element]):
                r = mid_element - 1
            elif(target > matrix[mid][mid_element]):
                l = mid_element + 1
            else:
                return True

        return False