import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5];
        System.out.print("Enter the 5 elements of Array:");
        int sum = 0;
        int x = 5;
        int y = 7;

        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i< arr.length;i++){
           if (arr[i] == x || arr[i] == y){
               sum = sum + 1;
           }

        }
        System.out.println("The counting of x and y which is present in Array:" + sum);
    }
}
