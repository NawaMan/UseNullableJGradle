package use.nullablej.gradle;

import nawaman.nullablej.nullvalue.processor.NullValue;

@SuppressWarnings("javadoc")
public class PhoneNumber {
    
    @NullValue
    public static final PhoneNumber nullPhoneNubmer = new PhoneNumber("000-000-0000");
    
    private String number;
    
    public PhoneNumber(String number) {
        super();
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }
    
}