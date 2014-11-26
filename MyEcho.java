import java.io.*;

public class MyEcho{
     public static void main(String[] args){
         try{
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               String str="";
               do{
                    System.out.print(">");
                    str = br.readLine();
                    if(str.equals("")){
                         System.out.println("empty, retry.");
                         continue;
                    }
                    System.out.println(String.format("echo>%s",str));
               }while(!str.equals("EXIT"));
	 }catch(IOException e){
	     System.exit(100);
	 }
     }
} 