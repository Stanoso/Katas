public class main {

    public static void main(String[] args) {

        System.out.println(isTriangleNumber(3126250));
        System.out.println(isTriangleNumber(11));


    }
    public static Boolean isTriangleNumber(long number) {
        if (number <= 0) {
            return false;
        }
        long sum = 0;
        for (int i = 1; i < number+1; i++) {
            sum += i;
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

}
