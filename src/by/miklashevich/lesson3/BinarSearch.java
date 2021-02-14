package by.miklashevich.lesson3;

public class BinarSearch {
    public static void main(String[] args) {

        int[] array = {1, 2, 7, 14, 23, 53, 56, 64, 67, 82, 94, 155, 236}; // создаем массив
        int elementToFind = 7; // вводим искомый элемент
        int startIndex = 0; // заводим переменную начала массива со значением = 0
        int endIndex = array.length - 1; // заводим переменную конца массива со значением  = длинна массива минус 1
        int middleIndex; // обьявляем переменную середины массива
        while (startIndex <= endIndex) { //задаем цикл деления массива пополам (выполняем пока конец массива на станет равным началу
            middleIndex = (startIndex + endIndex) / 2; // при каждом цикле ищем средний элемент массива

            if (array[middleIndex] == elementToFind) { // сравниваем число средней ячейки массива с искомым
                System.out.println("искомoе число " + elementToFind + " найдено в ячейке с номером " + middleIndex);

            }

            if (array[middleIndex] > elementToFind) { // если число средней ячейки массива больше искомого
                endIndex = middleIndex - 1; // устанавливаем новую границу поиска в ячейках до middleIndex
            } else {
                startIndex = middleIndex + 1; // устанавливаем новую границу поиска в ячейках после middleIndex
            }
        }

    }
}


