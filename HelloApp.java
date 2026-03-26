/*
*@author:Dhruv Gupta
*@version:1.0
*/

public class HelloApp{
    public static void main(String[] args){
        String name="World";
        if(args.length>0){
            name=args[0];
       }
       System.out.println("Hello, " +name+ "!");
    }
}