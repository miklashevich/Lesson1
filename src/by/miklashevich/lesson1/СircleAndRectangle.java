package by.miklashevich.lesson1;

public class СircleAndRectangle {

        public static void main(String[] args) {
          int a=50;
          int b=23;
          int r=12;
            if (r * r >= (a * a + b * b) / 4) {

                System.out.println("Отверстие со сторонами" + " " + a + " " + "и" + " " + b + " " + "Можно закрыть картонкой с радиусом" + " " + r);
            }
            else {
                System.out.println("Отверстие со сторонами" + " " + a + " " + "и" + " " + b + " " + "Нельзя закрыть картонкой с радиусом" + " " + r);
            }

}
}






