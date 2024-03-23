import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Range> splitStream(List<Integer> stream) {
        int countZero = 0, startIndex=-1, endIndex=-1, items = -1;
        List<Range> ranges = new ArrayList<>();

        for (int i=0; i<stream.size(); i++) {
            Integer val = stream.get(i);
            if(val == 0 ) {
                countZero++;
                if(startIndex != -1 && countZero == 4) {
                    i -= 4;
                    ranges.add(new Range(startIndex, i, items));
                    startIndex = -1;
                }
            } else if(val >= 0 ) {
                if(countZero >= 4) {
                    startIndex = i;
                } else if(countZero < 4 && countZero != 0) {
                    startIndex = -1;
                }
                countZero = 0;
            }
        }

        return ranges;
    }
    public static void main(String[] args) {

        List<Integer> stream = List.of(0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,1,1,0,0,0,0);
        System.out.println("Hello world! "+stream.size());
        List<Range> range = splitStream(stream);
        System.out.println("Ranges "+range);
    }
}