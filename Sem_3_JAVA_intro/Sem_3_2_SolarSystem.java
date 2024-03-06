package Sem_3_JAVA_intro;

import java.util.ArrayList;
import java.util.Collections;

/*Задание No2.1
 📌Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 📌Вывести название каждой планеты и количество его повторений в списке.
 Задание состоит из двух блоков
 Задание No2.2 (если выполнено первое задание)
 📌Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.*/
public class Sem_3_2_SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> arrayList = getListPlanets();
        System.out.println(arrayList);
        printRepeatPlanets(arrayList);
        deleteRepeatPlanet(arrayList);
        System.out.println(arrayList);

    }

    private static ArrayList<String> getListPlanets() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Меркурий");
        arrayList.add("Земля");
        arrayList.add("Юпитер");
        arrayList.add("Венера");
        arrayList.add("Земля");
        arrayList.add("Марс");
        arrayList.add("Юпитер");
        arrayList.add("Сатурн");
        arrayList.add("Земля");
        arrayList.add("Уран");
        arrayList.add("Нептун");
        arrayList.add("Юпитер");
        arrayList.add("Плутон");

        return arrayList;
    }

    private static void printRepeatPlanets(ArrayList<String> planets) {
        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        System.out.println(sortedPlanets);
        int count = 1;
        String planet = sortedPlanets.get(0);
        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i).equals(planet)) {
                count++;
            } else {
                System.out.println(planet + " = " + count);
                planet = sortedPlanets.get(i);
                count = 1;
            }
        }
        System.out.println(planet + " = " + count);
    }

    public static void deleteRepeatPlanet(ArrayList<String> planets) {
//        for (int i = 0; i < planets.size(); i++) {
//            String currentPlanet = planets.get(i);
//            for (int j = i + 1; j < planets.size(); j++) {
//                if (planets.get(j).equals(currentPlanet)){
//                    planets.remove(j);
//                    j--;
//                }
//            }
//        }

        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            for (int j = planets.size() - 1; j > i; j--) {
                if (planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);

                }
            }
        }

    }

}
