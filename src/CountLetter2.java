public class CountLetter2 {
    public static void main(String[] args) {
        CountLetter2 countLetter2 = new CountLetter2();
        String str ="world is wonderful";
        countLetter2.countL(str,'w');
    }
    public void countL(String str, char letter){
        int count=0;
        char [] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){

            if(arr[i]==letter){
              count++;
            }

        }
        System.out.println("Letter"+" "+ count +" " +"times");
    }
}
