public class RecursivePattern 

{ 
      

static void printn(int num) 
{ 
    
    if (num == 0) 
        return; 
    System.out.print ("* "); 
  
   
    printn(num - 1); 
} 
  

static void pattern(int n, int i) 
{ 
  
    if (n == 0) 
        return; 
    printn(i); 
    System.out.println(); 
  
    
    pattern(n - 1, i + 1); 
} 
  

public static void main (int n)  
{ 
  
    int n = 5; 
    pattern(n, 1); 
} 
}
