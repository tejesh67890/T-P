public class camparearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int element=0;
        if(arr.length!=arr2.length){
            System.out.println("The arrays length are not equal");
        }else{
            for (int i=0;i<arr.length;i++) {
                if(arr[i]==arr2[i]){
                    element+=1;
                }
            }
            if(element==arr.length){
                System.out.println("Two arrays are eqaul");
            }else{
                System.out.println("Two arrays are not equal");
            }
        }
    }
}
