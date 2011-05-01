import java.text.DecimalFormat;

public class NineNineTable {

    public static void main(String[] args){
	DecimalFormat format = new DecimalFormat("00");
	for(int i = 0; i <= 9; i++){
	    for(int j = 0; j <= 9; j++){

		if(i == 0 && j == 0){
		    printRowHeader();
		    break;
		}
		else if(j == 0){
		    printColHeader(format, i);
		}
		else{
		    System.out.print(format.format(i*j)+"+");
		}

		if(j == 9){
		    System.out.println();
		}
	    }
	}
    }

    private static void printRowHeader(){
	System.out.println("  + 1+ 2+ 3+ 4+ 5+ 6+ 7+ 8+ 9");
	System.out.println("--+--+--+--+--+--+--+--+--+--");
    }

    private static void printColHeader(DecimalFormat format, int i){
	System.out.print(format.format(i)+"+");
    }

}