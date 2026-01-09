/**
 Створіть Java програму, яка виконує наступні завдання, використовуючи одновимірний масив:

 Створіть масив цілих чисел з 15 елементами.
 Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
 Виведіть початковий вигляд масиву.
 Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
 Виведіть відсортований масив.
 Попросіть користувача ввести число для пошуку в масиві.
 Використовуючи алгоритм бінарного пошуку, знайдіть і виведіть індекс введеного користувачем числа
 у відсортованому масиві або повідомте, якщо числа немає.
 Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

 Приклад:

 Початковий вигляд масиву: [45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91]

 Відсортований масив: [2, 7, 12, 23, 32, 34, 41, 45, 55, 65, 67, 78, 88, 91, 98]

 Введіть число для пошуку: 34 Індекс числа 34 у відсортованому масиві: 5
 */
///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] arrayOfRandomNumbers = new Random().ints(15, 1, 101).toArray();
    IO.println("basic Array = " + java.util.Arrays.toString(arrayOfRandomNumbers));

    for(int i = 0; i < arrayOfRandomNumbers.length; i++){
        int current = arrayOfRandomNumbers[i];
        int j = i-1;
        for(; j >=0; j--){
           if(current < arrayOfRandomNumbers[j]){
               arrayOfRandomNumbers[j+1] = arrayOfRandomNumbers[j];
           } else{
               break;
           }
        }
        arrayOfRandomNumbers[j+1]=current;
    }
    IO.println("sorted Array = " + java.util.Arrays.toString(arrayOfRandomNumbers));

}
