public class secminarr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] < secmin && arr[i] != min) {
                secmin = arr[i];
            }
        }
        System.out.println(secmin);
    }
}
