public class HillPattern {
	// Bai 1.6
	public static void main( String[] args ) {
		int size = 5;
		HillPatternD(size);
	}

	public static void HillPatternA( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= (size * 2); col = col + 1 ) {
				if (( row + col > size ) && (row > col - size )) {
					System.out.print( "# " );
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
	}

	public static void HillPatternB( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= ( size * 2 ) - 1; col = col + 1 ) {
				if ( row == col ) {
					for ( int i = col; i <= ( size * 2 ) - 1; i = i + 1 ) {
						if ( row + i <= ( size * 2 ) ) {
							System.out.print( "# " );
						} else
							System.out.print( " " );
					}
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
	}

	public static void HillPatternC( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= ( size * 2 ); col = col + 1 ) {
				if (( row + col > size ) && ( row > col - size )) {
					System.out.print( "# " );
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
		for ( int row = 2; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= ( size * 2 ) - 1; col = col + 1 ) {
				if ( row == col ) {
					for ( int i = col; i <= ( size * 2 ) - 1; i = i + 1 ) {
						if ( row + i <= ( size * 2 ) ) {
							System.out.print( "# " );
						} else
							System.out.print( " " );
					}
				} else {
					System.out.print( "  " );
				}
			}
			System.out.println();
		}
	}

	public static void HillPatternD( int size ) {
		for ( int row = 1; row <= size; row = row + 1 ) {
			for ( int col = 1; col <= ( size * 2 ) - 1; col = col + 1 ) {
				if (( row + col > size + 1 ) && ( row > col + 1 - size )) {
					System.out.print( "  " );
				} else {
					System.out.print( "# " );
				}
			}
			System.out.println();
		}
		for ( int row = size - 1; row >= 1; row = row - 1 ) {
			for ( int col = size * 2 - 1; col >= 1; col = col - 1 ) {
				if (( row + col > size + 1 ) && ( row > col + 1 - size )) {
					System.out.print( "  " );
				} else {
					System.out.print( "# " );
				}
			}
			System.out.println();
		}
	}
}
