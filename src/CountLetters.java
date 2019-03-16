import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountLetters {
    public static void main(String[] args) {
        String myString = "oooohhytttr";
        CountLetters countLetters = new CountLetters();
        countLetters.count(myString);
    }
    public void count(String str){

        String[]arr = str.split("");
        List<String> list = new ArrayList<>();
        list=Arrays.stream(arr).distinct().collect(Collectors.toList());
        for(String temp:list){
            int result=0;
            for(String temp2:arr){
                if(temp.equals(temp2)){
                  result++;
                }
            }
            System.out.println(temp+""+result);
        }

    }
}
