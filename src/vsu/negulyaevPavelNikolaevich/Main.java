package vsu.negulyaevPavelNikolaevich;
import ru.vsu.cs.util.ArrayUtils;

import java.util.HashMap;
public class Main {

    public static int[] readArrayFromConsole(){
        return ArrayUtils.readIntArrayFromConsole();
    }

    public static void writeArrayToConsole(int[] array) { // выводит массив в консоль
        System.out.print("Вывод массива в консоль: ");
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.print(array[i] + ";");
            }
            else System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static int solution(int[] array){
        HashMap<Integer, Integer> map = SolutionClass.HashMapSolution(array);
        int positionOfPreLast = SolutionClass.positionOfPreLast(map, array);
        return positionOfPreLast;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{3, 2, 2, 2, 3, 6, 2, 3, 9, 10, 3};
        int[] array2 = new int[]{8, 8, 8, 8, 8};
        int[] array3 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array4 = new int[]{-1,-1,-1,-1, 2, 2, 2};
        int[] array5 = new int[]{10, 10 , 9, 9, 8, 8, 7, 7}; // тесты
        int[] array6 = new int[]{7, 7, 8, 8, 9, 9, 10, 10};
        int[] array7 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array8 = new int[]{5, -5, 5, -5, 5, -5, 5, -5};
        int[] array9 = new int[]{1};
        int[] array10 = new int[]{-1,-2,-3,-4,-5,-6,-7,-8};
        System.out.println(solution(array1));
        System.out.println(solution(array2));
        System.out.println(solution(array3));
        System.out.println(solution(array4));
        System.out.println(solution(array5));
        System.out.println(solution(array6));
        System.out.println(solution(array7));
        System.out.println(solution(array8));
        System.out.println(solution(array9));
        System.out.println(solution(array10));

        System.out.println(solution(readArrayFromConsole()));

    }
}
