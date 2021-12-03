package vsu.negulyaevPavelNikolaevich;

import java.util.HashMap;

public class SolutionClass {
    public static HashMap<Integer, Integer> HashMapSolution(int[] array){ // конвертирует массив в HashMap(ассоциативный массив) по принципу ключ - это число
        HashMap<Integer, Integer> map = new HashMap<>();                  // а значение под ключом - сколько таких чисел в массиве

        for (Integer i : array) { // for each или же итеррация по хешмапу
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
            }
        }
        return map;
    }
    public static int positionOfPreLast(HashMap<Integer, Integer> map, int[] mainArray) { // метод возвращает вторую с конца позицию того самого числа, которое повторяется несколько раз
        int preLastPosition = -1; // в случае если все элементы массива разные - вернуть -1
        int valueThatRepeats = 0;
        int maxRepeats = 0;
        Integer key;
        Integer value; // объектные типы данных венесены чтобы не плодить их в цикле каждую итерацию(хотя и не факт что они плодятся)
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) { //
            key = entry.getKey();
            value = entry.getValue();

            if(value.intValue() >= maxRepeats){
                maxRepeats = value.intValue();
                valueThatRepeats = key.intValue();
            }
        }
        int count = 0;
        for(int i = 0; i < mainArray.length; i++){
            if(mainArray[i] == valueThatRepeats){
                count++;
                if(count == maxRepeats-1){
                    return i;
                }
            }
        }
        return preLastPosition;
    }
}
