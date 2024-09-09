public class Multiples {
    public static void main(String[] args) {
        int mThree = 0;
        int mFive = 0;

        for (int i=0; i<1000; i++) {
            if (i % 3 == 0) {
                mThree++;
            }
            if (i % 5 == 0) {
                mFive++;
            }
        }
        System.out.println(mThree);
        System.out.println(mFive);

    }
}
