package use.nullablej.gradle;

import lombok.val;
import lombok.experimental.ExtensionMethod;
import nawaman.nullablej.NullableJ;

@SuppressWarnings("javadoc")
@ExtensionMethod({ NullableJ.class })
public class UseNullableJ {
    
    public static void main(String[] args) {
        val string = null;
        System.out.println(string._isNull());   // Prints 'true'.
        
        System.out.println("42"          ._whenMatches("^[0-9]+$").map(Integer::parseInt).orElse(-1));  // Prints 42
        System.out.println(((String)null)._whenMatches("^[0-9]+$").map(Integer::parseInt).orElse(-1));  // Prints -1
    }
    
}