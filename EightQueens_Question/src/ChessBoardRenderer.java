public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...

		boolean isBlack = false;
		
		if (square%16 < 8) { // Odd rows
			
			if (square%2 == 1) {
				
				isBlack = true;
				
			}
			
		}
		
		else { // Even rows
			
			if (square%2 == 0) {
				
				isBlack = true;
				
			}
			
		}
		System.out.println(square);
		return isBlack;
	}
}
