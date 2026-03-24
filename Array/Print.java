import java.util.Scanner;
public class Print{
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter size of arr");
        int size=sc.nextInt();
       
        int arr [] =new int [size];
     System.out.println("Enter the value ");
      for(int i=0; i<size;i++){
     
        arr[i]=sc.nextInt();

      } 
      System.out.println("Input is ");
      for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
      }
      arr[0]=arr[0]+arr[1];
      arr[1]=arr[0]-arr[1];
      arr[0]=arr[0]-arr[1];
      for(int i=0;i<size;i++){
        System.out.println(arr[i]);
      }
    } 

}