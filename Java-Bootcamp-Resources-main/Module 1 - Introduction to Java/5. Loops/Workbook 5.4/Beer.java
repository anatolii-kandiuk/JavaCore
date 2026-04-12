public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       sing(100);
    }

    /**
     * Function name -- sing.
     * @param i (int)
     *
     *
     * Inside the function:
     *  1. print:
     *    <i> bottles of beer on the wall, <i> bottles of beer!
     *    take one down, pass it around <i-1>, bottles of beer on the wall!
     */
    private static void sing(int i) {
        for (int j = i; j > 0; j--) {
            System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer!");
            System.out.println("Take one down, pass it around, " + (j - 1) + " bottles of beer on the wall!");
        }
    }
}
