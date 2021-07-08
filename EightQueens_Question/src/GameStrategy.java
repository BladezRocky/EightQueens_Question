public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		
		int column = cellId % 8;

		return column;	
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		int row = (int) cellId/8; 
		
		return row;	
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
		*/
		
		for (int i=0; i<8; i++) {
			
			for (int j=0; j<8; j++) {
				
				if (placedQueens[i][j]) {
					
					if (i==row || j==col) {
						
						isValid = false; // Same row/column
						
					}
					
					// To check diagonal
					
					int rowDiff = Math.abs(i-row);
					int colDiff = Math.abs(j-col);
					
					if (rowDiff == colDiff) { // Along same Diagonal
					
						isValid = false;
						
					}	
				}
				
			}
			
			
			
			
		}
		
		if (isValid) {
			
			placedQueens[row][col] = true;
			numQueens++;
		}
		
		return isValid;
	}
}














