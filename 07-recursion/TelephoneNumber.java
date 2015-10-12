package Recursion;

public class TelephoneNumber {
	private static int PHONE_NUMBER_LENGTH = 7;
	private static int [] phoneNum;
	private static char[] result = new char[ PHONE_NUMBER_LENGTH ];

	public static void main(String[] args) {
		phoneNum = new int[]{4,9,7,1,9,2,7};
		printWords();
	}

	public static void printWords() {
		// Initialize result with first telephone word
		for( int i = 0; i < PHONE_NUMBER_LENGTH; ++i )
			result[i] = getCharKey( phoneNum[i], 0 );
		for( ; ; ) { // Infinite loop
			for( int i = 0; i < PHONE_NUMBER_LENGTH; ++i ) {
				System.out.print( result[i] );
			}
			System.out.print( '\n' );
			/* Start at the end and try to increment from right
			 * to left.
			 */
			for( int i = PHONE_NUMBER_LENGTH - 1; i >= -1; --i ) {
				if( i == -1 ) // if attempted to carry past leftmost digit,
					return; // we're done, so return
				/* Start with high value, carry case so 0 and 1
				 * special cases are dealt with right away
				 */
				if( getCharKey( phoneNum[i], 2 ) == result[i] ||
						phoneNum[i] == 0 || phoneNum[i] == 1 ){
					result[i] = getCharKey( phoneNum[i], 0 );
					// No break, so loop continues to next digit
				} else if ( getCharKey( phoneNum[i], 0 ) == result[i] ) {
					result[i] = getCharKey( phoneNum[i], 1 );
					break;
				} else if ( getCharKey( phoneNum[i], 1 ) == result[i] ) {
					result[i] = getCharKey( phoneNum[i], 2 );
					break;
				}
			}
		}
	}

	private static char getCharKey(int telKey, int place){
		switch (telKey){
		case 1:
			switch (place){
			default: return '1';
			}
		case 2:
			switch (place){
			case 0: return 'a';
			case 1: return 'b';
			case 2: return 'c';
			}
		case 3:
			switch (place){
			case 0: return 'd';
			case 1: return 'e';
			case 2: return 'f';
			}
		case 4:
			switch (place){
			case 0: return 'g';
			case 1: return 'h';
			case 2: return 'i';
			}
		case 5:
			switch (place){
			case 0: return 'j';
			case 1: return 'k';
			case 2: return 'l';
			}
		case 6:
			switch (place){
			case 0: return 'm';
			case 1: return 'n';
			case 2: return 'o';
			}
		case 7:
			switch (place){
			case 0: return 'p';
			case 1: return 'r';
			case 2: return 's';
			}
		case 8:
			switch (place){
			case 0: return 't';
			case 1: return 'u';
			case 2: return 'v';
			}
		case 9:
			switch (place){
			case 0: return 'w';
			case 1: return 'x';
			case 2: return 'y';
			}
		default: return ' ';
		}
	}
}

