

public class lenth_of_each_word {
    public static void main(String[] args) {
        String name="sudeep naik gmail hello ankola";
        for (String s : name.split(" ")) {
            if(s.length()%2==0){
                System.out.println(s+" : "+s.length()+" Even");
            }
            else{
                System.out.println(s+" : "+s.length()+" Odd");
            }
            
        }
    }
    
}
