package za.ac.cput.util;
import org.springframework.beans.propertyeditors.UUIDEditor;


import java.util.UUID;

public class Helper {
    public static Boolean isNullOrEmpty(String s) {
    if(s == null || s.isEmpty())
        return true;
    return false;
}
public static String generateId(){
        return UUID.randomUUID().toString();
}

//email validation
    //email validation
    //email validation
}
