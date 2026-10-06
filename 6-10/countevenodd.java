public class countevenodd {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6};
        int odd=0;
        int even=0;
        for(int i:arr){
            if(i==0){
                continue;
            }
            else if(i%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.println("odd:"+odd+" even:"+even);
    }
}
