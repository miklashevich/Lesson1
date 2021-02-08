package by.miklashevich.lesson1;

public class СircleAndRectangle {

        public static void main(String[] args) {
            double a = 50.5;
            double b = 23.3;
            double r = 12.0;
            if (r * r >= (a * a + b * b) / 4.0) {

                System.out.println("Отверстие со сторонами" + " " + a + " " + "и" + " " + b + " " + "Можно закрыть картонкой с радиусом" + " " + r);
            } else {
                System.out.println("Отверстие со сторонами" + " " + a + " " + "и" + " " + b + " " + "Нельзя закрыть картонкой с радиусом" + " " + r);
            }

        }
}






