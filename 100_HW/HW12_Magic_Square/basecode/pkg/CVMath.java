package pkg;

public class CVMath {
    public static int findMid(int one, int two, int three) {
        return (one + two + three - Math.min(one, Math.min(two, three)) - Math.max(one, Math.max(two, three)));
    }

    public static void specialSquare(int theinput) {
        int count = 0;
        int num = 1;

        while (count < theinput) {
            double sqrt = Math.sqrt(num);
            if (sqrt == (int) sqrt) {
                int sum = 0;
                int i = 1;

                while (sum < num) {
                    sum = sum + i;
                    i = i + 1;
                }

                if (sum == num) {
                    System.out.println(num);
                    count = count + 1;
                }
            }
            num = num + 1;
        }
    }
}
