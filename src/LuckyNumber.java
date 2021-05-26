public class LuckyNumber
{
    private final int min = 100000;
    private final int max = 999999;
    private int current = min;
    private int count = 0;

    public LuckyNumber() {
        search();
    }

    public static void main(String[] args) {
        LuckyNumber ln = new LuckyNumber();
    }

    private void search() {

        for (; current <= max; current++) {

            int left = 0;
            int right = 0;

            char[] arrLeft = Integer.toString(current).substring(0, 3).toCharArray();
            char[] arrRight = Integer.toString(current).substring(3, 6).toCharArray();

            for(char c : arrLeft){
                left += Integer.parseInt(String.valueOf(c));
            }

            for(char c : arrRight){
                right += Integer.parseInt(String.valueOf(c));
            }

            if(left == right){
                count++;

                output(current, left, right, arrLeft, arrRight);
            }

        }

        System.out.println("Всего совпадений: "+count);

    }

    private void output(int cur, int left, int right, char[] arrLeft, char[] arrRight) {

        System.out.println("Число: "+cur);

        for(char c : arrLeft){
            System.out.print(String.valueOf(c)+" ");
        }

        System.out.print(" == ");

        for(char c : arrRight){
            System.out.print(String.valueOf(c)+" ");
        }

        System.out.printf("\n %d == %d \n ------------ \n", left, right);
    }
}
