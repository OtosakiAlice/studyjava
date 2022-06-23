public class SumOfArgs {
    public static void main(String[] args) {
        double sum = 0;
        for (String s:args) {
            sum += Double.parseDouble(s);
        }
        System.out.printf("合計は%sです",sum);
    }
}
