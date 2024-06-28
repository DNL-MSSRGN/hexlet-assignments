package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        if(apartments.isEmpty()){
            return new ArrayList<>();
        }

        var result = new ArrayList<String>();
        apartments.sort((x1 ,x2) -> Double.compare(x1.getArea(), x2.getArea()));

        for(var i = 0; i < n; i++) {
            var apartment = apartments.get(i).toString();
            result.add(apartment);
        }

        return result;
    }
}
// END
