package use.nullablej.gradle;

import lombok.val;
import lombok.experimental.ExtensionMethod;
import nullablej.NullableJ;

@ExtensionMethod({ NullableJ.class })
public class UseNullableJ {
    
    public static void main(String[] args) {
        val string = null;
        System.out.println(string._isNull());   // Prints 'true'.
        
        System.out.println(NullableJ._whenMatches("42"        , "^[0-9]+$").map(Integer::parseInt).orElse(-1));  // Prints 42
        System.out.println(NullableJ._whenMatches((String)null, "^[0-9]+$").map(Integer::parseInt).orElse(-1));  // Prints -1
    }
    
}