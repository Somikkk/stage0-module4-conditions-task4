package school.mjc.stage0.conditions.task4;




public class MaxNumberPrinter {
    public static void main(String[] args) {

    }
    public void printGreatest(int first, int second, int third) {
        int greatest;

        if(first >= second && first >= third) {
            greatest = first;
        } else if(second >= first && second >= third) {
            greatest = second;
        } else {
            greatest = third;
        }

        System.out.println(greatest);
    }
}
