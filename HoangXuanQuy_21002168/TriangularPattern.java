class TriangularPattern {
	// Bai 1.4
	public static void main( String[] args ) {
		int size = 5;
		TriangularPatternA(size);
	}

	public static void TriangularPatternA( int size ) {
			for ( int col = 1; col <= size; col = col + 1 ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
				if ( row >= col ) {
					System.out.print( "#" + " " );
				}
			}
			System.out.println();
		}
	}

	public static void TriangularPatternB( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= size; col = col + 1 ) {
				if ( row + col <= size + 1 ) {
					System.out.print( "#" + " " );
				}
			}
			System.out.println();
		}
	}

	public static void TriangularPatternC( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= size; col = col + 1 ) {
				if ( row <= col ) {
					System.out.print( "#" + " " );
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
	}

	public static void TriangularPatternD( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= size; col = col + 1 ) {
				if ( row + col >= size + 1 ) {
					System.out.print( "#" + " " );
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
	}
}
