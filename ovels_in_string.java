public class ovels_in_string {
    public static void main(String[] args) {
        String name="sudeep";
        char charry[]=name.toLowerCase().toCharArray();
        for(char ch:charry){
            if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+" : vowel");
            }
            else{
                System.out.println(ch +" : consonent");
            }
        } 
    }
    
}
