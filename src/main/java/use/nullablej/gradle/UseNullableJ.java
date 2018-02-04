package use.nullablej.gradle;

import lombok.val;
import lombok.experimental.ExtensionMethod;
import nawaman.nullable.NullableJ;

@SuppressWarnings("javadoc")
@ExtensionMethod({ NullableJ.class })
public class UseNullableJ {
    
    public static void main(String[] args) {
        val string = null;
        System.out.println(string._isNull());   // Print 'true's
    }
    
}