import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheBiggestDate {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.of(2019,3,1);
        LocalDate local2 = LocalDate.of(2019,3,4);
        LocalDate local3 = LocalDate.of(2019,3,8);
        List<LocalDate> list1 = new ArrayList<>();
        Collections.addAll(list1,local1,local2,local3);
        TheBiggestDate theBiggestDate = new TheBiggestDate();
        theBiggestDate.maxDate(list1);
    }
    public LocalDate maxDate(List<LocalDate> list){
        LocalDate result=null;
        for(LocalDate temp:list){
           result = list.get(0);
            if(temp.isAfter(result)){
                result=temp;
            }
        }
        System.out.println(result);
        return result;
    }
}
