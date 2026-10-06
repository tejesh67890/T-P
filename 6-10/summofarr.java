public class summofarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=arr[0];
        for(int i=1;i<arr.length;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
