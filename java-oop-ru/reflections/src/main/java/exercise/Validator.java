package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) throws Exception {
        var failedValidation = new ArrayList<String>();
        for (Field field : address.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                var value = field.get(address);
                if (value == null) {
                    failedValidation.add(field.getName());
                }
            }
        }
        return failedValidation;
    }

    public static Map<String, List<String>> advancedValidate(Address address) throws Exception {
        Map<String, List<String>> result = new LinkedHashMap<>();
            for (Field field: address.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                List<String> error = new ArrayList<>();
                boolean notNull = field.isAnnotationPresent(NotNull.class);
                boolean minLength = field.isAnnotationPresent(MinLength.class);
                if (notNull && field.get(address) == null) error.add("can not be null");
                if (minLength && field.get(address).toString().length()
                        < field.getAnnotation(MinLength.class).minLength()) {
                    error.add("length less than " + field.getAnnotation(MinLength.class).minLength());
                }
                if (!error.isEmpty()) {
                    result.put(field.getName(), error);
                }
            }
        return result;
    }
}
// END
