
import java.util.Scanner;



public class array{
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] a= new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            for(int j=i+1;j<a.length-1;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            
        }

        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    
}