public class secmaxarr {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int max=arr[0];
        int secmax=max;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
