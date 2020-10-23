import java.util.*;

public class isogram {

    public static boolean isIsogram(String str){
        boolean result = true;
        if (str.length() != 0){
            String lowerCase = str.toLowerCase().trim();
            char[] charArray = lowerCase.toCharArray();
            HashSet<Character> set = new HashSet<>();
            for (char c : charArray) set.add(c);
            if (set.size() < charArray.length) result = false;
        }
        return result;
    }

}