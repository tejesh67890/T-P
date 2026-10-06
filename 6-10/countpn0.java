public class countpn0{
    public static void main(String[] args) {
        int arr[]={0,1,2,-3,4,5,6};
        int positive=0;
        int negitive=0;
        int zero=0;
        for(int i:arr){
            if(i==0){
                zero+=1;
            }
            else if(i>0){
                positive+=1;
            }else{
                negitive+=1;
            }
        }
        System.out.println("positive:"+positive+" negitive:"+negitive+" zero:"+zero);
    }
    
    
}
