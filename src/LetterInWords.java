public class LetterInWords {
    public static void main(String[] args) {
        String myString = "aaaannnlkj";
        LetterInWords letterInWords = new LetterInWords();
        letterInWords.countLetter(myString,'a');
    }
    public void countLetter(String str, char letter){
        int count=0;
        for(int i=0;i<str.length();i++){

            if(letter==str.charAt(i)){
                count++;
            }

        }
        System.out.println("Letter"+" "+ letter+" "+"was found"+" "+count+" "+ "times");
    }
}
