package String;

public class P13_CountVowelAndConsonent {
    public static void Count(String sb){
        int vowel=0;
        int space=0;
        int consonent =0;
        int number=0;
        for(char ch:sb.toCharArray()){
            
            if(ch>='0'&&ch<='9'){
                number++;
            }
            if(ch>=' '){
                space++;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else if(ch>='a'&&ch<='z'){
                consonent++;
            }

        }
        System.out.println("Number :- "+number);
        System.out.println("space :- "+space);
        System.out.println("vowel :- "+vowel);
        System.out.println("consonent :- "+consonent);
    }
    public static void main(String[] args) {
        String s="ankit 6585 kamr 57 kumar 55 singh";
        Count(s);
        
    }

}
