public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int num) {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i > num) {
                break;
            }
        }
    }
}
