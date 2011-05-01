public class AveAge {
    public static void main(String[] args) throws NumberFormatException{
	if(args.length < 2){
	    System.out.println("Usage: AveAge 20 30 40 ...");
	    System.exit(-1);
	}
	double ave = 0.0;
	long startTime = System.currentTimeMillis();
	for(int i = 0; i < args.length; i++){
	    //	    System.out.println(args[i]);
	    ave = (double)((ave*i+Double.parseDouble(args[i]))/(i+1));    
	}
	System.out.println("ave="+ave);
	long endTime = System.currentTimeMillis();
	System.out.println("time="+(endTime - startTime));

	double sum = 0.0;
	startTime = System.currentTimeMillis();
	for(int i = 0; i < args.length; i++){
	    //	    System.out.println(args[i]);
	    sum += Double.parseDouble(args[i]);
	}
	System.out.println("ave="+(double)sum/(args.length));
	endTime = System.currentTimeMillis();
	System.out.println("time="+ (endTime - startTime));
    }
}