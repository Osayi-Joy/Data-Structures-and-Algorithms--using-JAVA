package mine;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[]{1,2,3,4,9}, 8));
        System.out.println(hasPairWithSum(new int[]{1,2,3,4,4}, 8));
        System.out.println(hasPairWithSum(new int[]{}, 8));


    }

    public static boolean hasPairWithSum(int[] arr, int sum){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] == sum){
                return true;
            }
            if(arr[i] + arr[j] < sum){
                i++;
            }
            if(arr[i] + arr[j] > sum){
                j--;
            }
        }
        return false;
    }
}
