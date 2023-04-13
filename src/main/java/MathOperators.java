public class MathOperators {

    public static void main(String[] args) {

        //Математические операторы
        int a = 10;
        int b = 6;

        int sum = a + b;
        System.out.println("result sum: " + sum);

        int sub = a - b;
        System.out.println("result sub: " + sub);

        int mult = a * b;
        System.out.println("result mult: " + mult);

        int div = a / b;
        System.out.println("result div: " + div);

        int rem = a % b;
        System.out.println("result rem: " + rem);

        //Переполнение
        int c = Integer.MAX_VALUE;
        int overflow = c + 111;
        System.out.println("result overflow: " + overflow);

        //Логический оператор && (сокращенное И)
        int d = 68;
        int e = 43;
        int f = 70;
        boolean i = (d > e) && (d > f);
        System.out.println("result and: " + i);

        ////Логический оператор || (сокращенное ИЛИ)
        boolean k = (d > e) || (d > f);
        System.out.println("result or: " + k);

        //Комбинации типов данных (int и double)
        int h = 15;
        double n = 5.78;
        System.out.println("result comb: " + (h / n));
    }
}
