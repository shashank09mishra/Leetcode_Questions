class Solution {

    // Function to solve Sudoku
    public void solveSudoku(char[][] board) {
        backtrack(board);  // Start backtracking from the board
    }

    // Backtracking function
    public boolean backtrack(char[][] board) {
        // Loop through each cell in the 9x9 Sudoku board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                // If the current cell is empty ('.')
                if (board[r][c] == '.') {

                    // Try placing digits 1 to 9
                    for (char ch = '1'; ch <= '9'; ch++) {
                        
                        // Check if placing 'ch' is valid
                        if (isValid(board, r, c, ch)) {
                            
                            // Place the digit temporarily
                            board[r][c] = ch;

                            // Recurse to solve the rest of the board
                            if (backtrack(board)) {
                                return true;  // If solved, keep this placement
                            }

                            // Otherwise, undo (backtrack) and try next digit
                            board[r][c] = '.';
                        }
                    }

                    // If no digit 1-9 works, return false (dead end → backtrack)
                    return false;
                }
            }
        }

        // If no '.' left, puzzle is solved
        return true;
    }

    // Function to check if placing 'ch' at (r,c) is valid
    public boolean isValid(char[][] board, int r, int c, char ch) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == ch) return false;  // digit already in row
            if (board[i][c] == ch) return false;  // digit already in col
        }

        // Find top-left corner of 3x3 sub-box
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;

        // Check inside the 3x3 sub-box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == ch) {
                    return false; // digit already in sub-box
                }
            }
        }

        // If no conflict, it's valid
        return true;
    }
}

/*
----------------- Hinglish Summary -----------------
\U0001f449 Yeh code Sudoku solve karne ke liye Backtracking use karta hai.

1. Har cell scan karo:
   - Agar '.' mila to usme '1' se '9' tak try karo.

2. Har number place karne se pehle check karo ki:
   - Row me duplicate nahi hai
   - Column me duplicate nahi hai
   - 3x3 box me duplicate nahi hai

3. Agar valid hai → number daalo aur recursion se aage solve karo.
   - Agar solution mil gaya → return true
   - Agar nahi mila → undo (cell = '.') aur next digit try karo

4. Agar sab cells fill ho gaye bina issue ke → Sudoku solved ✅

Backtracking ka funda simple hai:
   "Ek choice lo → agar valid hai to aage jao → warna wapas undo karo aur dusri choice try karo."
-----------------------------------------------------
*/
