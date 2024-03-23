public class Range {
    int startIndex;

    int endIndex;

    int numberOfItems;

    public Range(int startIndex, int endIndex, int numberOfItems) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.numberOfItems = (endIndex - startIndex)+1;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public String toString() {
        return "Range{" +
                "startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                ", numberOfItems=" + (numberOfItems) +
                '}';
    }
}
