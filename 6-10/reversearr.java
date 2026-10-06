public class reversearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int s=0;
        int e=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
