public class lastoccur {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,5,6,0};
        int element=0;
        int last=0;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                last=i;
            }
        }
        System.out.println(last);
    }
}
