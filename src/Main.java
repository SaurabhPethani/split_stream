import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Range> splitStream(List<Integer> stream) {
        int countZero = 0, startIndex=-1;
        // capture (window/subset of elements) enclosed with these many number of leading & trailing zeros
        int splitAfterZeros = 4;
        List<Range> ranges = new ArrayList<>();

        for (int i=0; i<stream.size(); i++) {
            Integer val = stream.get(i);
            if(val == 0 ) {
                countZero++;
                if(startIndex != -1 && countZero == splitAfterZeros) {
                    // reset index variable to i-4
                    // so new iteration will get start from (endIndex + 1)
                    i -= splitAfterZeros;
                    ranges.add(new Range(startIndex, i));
                    startIndex = -1;
                }
            } else if(val >= 0 ) {
                if(countZero >= splitAfterZeros) {
                    startIndex = i;
                } else if( countZero != 0) {
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