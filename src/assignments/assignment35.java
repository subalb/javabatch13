package assignments;

public class assignment35 {
    public static void main(String[] args) {
        int arr[] = {7, 21, 45, 6, 3, 1, 9, 12, 24, 2};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println(" Second Largest Number = " + second);
    }
}
