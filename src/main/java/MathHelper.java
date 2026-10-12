public class MathHelper {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(MathHelper.sum(10, 5));
        System.out.println(MathHelper.max(7, 20));
        System.out.println(MathHelper.isEven(3));

    }
}
