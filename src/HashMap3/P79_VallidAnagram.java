package HashMap3;

public class P79_VallidAnagram {

    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[256];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        for(char ch:t.toCharArray()){
            arr[ch]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
                return true;

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anaggram", "aangragn"));
    }
}


