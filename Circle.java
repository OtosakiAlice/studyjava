public class Circle {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double L = (r*2)*Math.PI;
        double S = r*r*Math.PI;
        System.out.println("半径"+r+"の円周は"+L+"で面積は"+S+"です");
    }
}
