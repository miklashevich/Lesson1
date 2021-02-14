package by.miklashevich.lesson3;

public class task7 {
    public static void main(String[] args)   {
        int myArray[] = {2,3,1,9,8,10}; // задаем массив myArray
        int indexMax = 0; // переменной indexMax присваиваем знач.0
        int indexMin = 0; // переменной indexMin присваиваем знач.0
        int max = myArray[0]; // переменной max присваиваем 0 ячейку
        int min = myArray[0]; // переменной max присваиваем 0 ячейку


        for (int i = 0; i < myArray.length; i++) // перебираем все ячейки массива
        {
            if (myArray[i] > max) // если значение ячейки i > max
            {
                indexMax = i; // ячейке i присваиваем переменную indexMax
                max = myArray[i]; // значение ячейки i присваиваем переменной max
            }
            else if(myArray[i] < min)  // если  значение ячейки i < min
            {
                indexMin = i;  // ячейке i присваиваем переменную indexMin
                min = myArray[i]; // значение ячейки i присваиваем переменной min
            }


        }
        int sum = 0;
        for (int i = Math.min(indexMin, indexMax)+1; i < Math.max(indexMin, indexMax); ++i)
        // цикл перебирает ячейки в диапазоне м/ду мин и максим.значением (не включает их)

        {
            sum += myArray[i]; // с каждым циклом значение увеличивается на значение ячейки i
        }
        System.out.println("Сумма элементов между максимальным и минимальным значениями: " + sum);
    }
}
