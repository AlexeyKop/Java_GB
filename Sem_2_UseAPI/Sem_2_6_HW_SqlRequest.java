package Sem_2_UseAPI;/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

public class Sem_2_6_HW_SqlRequest {

    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        System.out.println(answer(QUERY, PARAMS));
    }

    public static String answer(String QUERY, String PARAMS) {
        // Убираем лишние символы в JSON строке
        PARAMS = PARAMS.replaceAll("[{}\"]", "");

        // Разбиваем параметры по запятой
        String[] paramsArray = PARAMS.split(", ");

        // Создаем StringBuilder для формирования WHERE части запроса
        StringBuilder whereClause = new StringBuilder();

        // Проходим по каждому параметру
        for (String param : paramsArray) {
            // Разбиваем параметр на ключ и значение
            String[] keyValue = param.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            // Если значение не равно "null" и не null
            if (!"null".equals(value) && value != null) {
                // Если уже есть предыдущие условия в WHERE, добавляем "and" перед следующим условием
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                // Добавляем условие в WHERE часть запроса
                whereClause.append(key).append("='").append(value).append("'");
            }
        }

        // Если WHERE часть запроса не пустая, добавляем к исходному запросу
        if (whereClause.length() > 0) {
            QUERY += whereClause.toString();
        } else {
            // Иначе, если WHERE пустая, убираем " where " из запроса
            QUERY = QUERY.substring(0, QUERY.length() - 7);
        }

        // Создаем новый StringBuilder и возвращаем результат
        StringBuilder result = new StringBuilder();
        result.append(QUERY);
        return String.valueOf(result);
    }

}


