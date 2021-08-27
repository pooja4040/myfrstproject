package Assignment;

import java.io.File;



public class Exceptionhandling {
	public int AREC(int a, int b){
        return a/b;
        }
	
    public int arithmetic(int a, int b){
        return a/b;
        }
    
    public char nullpointer(String x){
        return x.charAt(0);
        }
    
    public char stringindexout(String x){
        return x.charAt(25);
        }
    
    public File filenotfound(String x) {
        File file=new File(x);
        return file;
        }
    
    public int numberformat(String x){
        int m=Integer.parseInt(x);
        return m;
    }
    
    public int arrayindexout(int[] x){
        return x[10];
    }
    
}
 
 



