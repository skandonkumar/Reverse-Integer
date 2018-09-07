import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int reverse(int x) {
        String[] ans = null;
        String str = Integer.toString(x);
        List<String> list = Arrays.asList(str.split(""));
        Collections.reverse(list);
        
        return 0;
    }
}


