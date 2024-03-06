/*Задание No3
1.Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
2.Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке
3.Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке.*/
public class Task_6_3_UserExceptions {
    public class DivisionByZeroException extends Exception{  //создаем свой класс
        public DivisionByZeroException(){
            super("Делить на 0 нельзя!");   // добавим сообщение
        }
    }

    public class NullArrayElementException extends Exception{  //создаем свой класс
        public NullArrayElementException(){
            super("Обращение к пустому элементу массива");   // добавим сообщение
        }
    }

    public class FileNotFoundException extends Exception{  //создаем свой класс
        public FileNotFoundException(){
            super("File not found");   // добавим сообщение
        }
    }
}
