package za.ac.cput.projects.assignment7crud.util;

import java.util.UUID;

public class Misc {
    public static String generateSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        String suffixId = "";

        for(int x = 0; x < className.length(); x++){
            if(Character.isUpperCase(className.charAt(x))){
                char character = className.charAt(x);
                suffixId = suffixId + character + "";
            }
        }
        return suffixId.replaceAll("\\r+","");
    }

}
