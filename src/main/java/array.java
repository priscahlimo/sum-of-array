public class array {

    public static void main(String[] args) {
        int arr[] = {12,14,15,9};
        Sum(arr);

    }

    public static void Sum(int[] arr){
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
