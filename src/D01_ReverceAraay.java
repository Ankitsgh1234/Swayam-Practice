import java.util.*; 
import java.io.*; 

public class D01_ReverceAraay {
    public static void reverseArray(ArrayList<Integer> nrr, int m) {
        int n = nrr.size();
        int j = m + 1;
        int k = n - 1;
        
        while (j < k) {
            int temp = nrr.get(j);
            nrr.set(j, nrr.get(k));
            nrr.set(k, temp);
            j++;
            k--;
        }
        // ? Don't print anything ? platform does that
    }
}
