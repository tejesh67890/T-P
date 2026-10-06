public class swapadj {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int s=0;
        int n=1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[s];
            System.out.println(temp);
            arr[s]=arr[n];
            System.out.println(arr[s]);
            arr[n]=temp;
            System.out.println(arr[n]);
            s+=2;
            n=s+1;
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
