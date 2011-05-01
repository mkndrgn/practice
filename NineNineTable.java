public class NineNineTable {

    private static final String LINE = "--+--+--+--+--+--+--+--+--+--+";

    public static void main(String[] args){
	for(int i = 0; i <= 9; i++){
	    for(int j = 0; j <= 9; j++){

		if(i == 0 && j == 0){
		    printRowHeader();
		    break;
		}
		else if(j == 0){
		    printColHeader(i);
		}
		else{
		    System.out.print(format(i*j)+"+");
		}

		if(j == 9){
		    System.out.println();
		}
	    }
	}
	printRowFooter();
    }

    private static void printRowHeader(){
	System.out.println("  + 1+ 2+ 3+ 4+ 5+ 6+ 7+ 8+ 9 ");
	System.out.println(LINE);
    }

    private static void printRowFooter(){
	System.out.println(LINE);
    }

    private static void printColHeader(int i){
	System.out.print(format(i)+"+");
    }

    public static String format(int i){
	String number = String.valueOf(i);
	if(String.valueOf(i).length() == 1){
	    number = " " + number;
	}
	return number;
    }

}