package use.nullablej.gradle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lombok.val;
import lombok.experimental.ExtensionMethod;
import nawaman.nullable.NullableJ;

@SuppressWarnings("javadoc")
@ExtensionMethod({ NullableJ.class })
public class UseNullableJTest {
    
    @Test
    public void testNull() {
        val string = null;
        assertTrue(string._isNull());
    }
    
}
