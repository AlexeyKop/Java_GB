package Sem_5_Map;

import java.util.HashMap;
import java.util.Map;

/*Задание No3
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022
'I' , 1
'V' , 5
'X' , 10
'L' , 50
'C' , 100
'D' , 500
'M' , 1000*/
public class S_5_3_RomanToArabic {
    public static void main(String[] args) {
        String inputData = "MMXXIV";
        System.out.println(convertToArabic(inputData));
    }

    public static Map<Character, Integer> getRomanArabicMap(){
        Map<Character, Integer> dictRomNum = new HashMap<Character, Integer>();
        dictRomNum.put('I' , 1);
        dictRomNum.put('V' , 5);
        dictRomNum.put('X' , 10);
        dictRomNum.put('L' , 50);
        dictRomNum.put('C' , 100);
        dictRomNum.put('D' , 500);
        dictRomNum.put('M' , 1000);

        return dictRomNum;
    }

    public static int convertToArabic(String strNum) {
        Map<Character, Integer> dictRom = getRomanArabicMap();
        int resArabian = dictRom.get(strNum.charAt(strNum.length() - 1));
        int prevValue = resArabian;

        for (int i = strNum.length()-2; i >= 0 ; i--) {
            int curValue = dictRom.get(strNum.charAt(i));
            if (curValue < prevValue) {
                resArabian -= curValue;
            } else {
                resArabian += curValue;
            }
            prevValue = curValue;
        }
        return resArabian;
    }

}
