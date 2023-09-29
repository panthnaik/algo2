public class count_frequency {
   
        public static int[] countFrequency(int n, int x, int []nums){
           int count=0;
           int ar[]=new int[n];
           for(int i=1;i<=x;i++){
               for(int j=0;j<n;j++){
                   if(i==nums[j]){
                       count++;
                   }
               }
            ar[i-1]=count;
            count=0;
           }
        return ar;
        }
    public static void main(String[] args) {
        int nums[]={1, 3, 4, 3, 4, 1};
        int ar[]=countFrequency(6, 4,nums);
        for(int i=0;i<6;i++){
            System.out.println(ar[i]);
        }
    }
}
