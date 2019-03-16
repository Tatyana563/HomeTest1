import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        int[] myArray = {1,2,6,12,15};
      filtering(filter1,myArray);
      condition condition1 = new condition();
      filtering(condition1,myArray);
    }
    public static List<Integer> filtering(Predicate<Integer> pr, int...arr){
       List<Integer> result = new ArrayList<>();
       for(int temp:arr){
           if(pr.test(temp)){
               result.add(temp);
           }
       }
        System.out.println(result);
       return result;
    }
    // important to have it static
  static Predicate<Integer> filter1 = new Predicate<Integer>() {
       @Override
       public boolean test(Integer integer) {
           return integer>10;
       }
   };
}
class condition implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer>10;
    }
}