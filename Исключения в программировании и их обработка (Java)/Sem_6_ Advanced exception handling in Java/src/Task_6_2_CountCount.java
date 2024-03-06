import java.io.IOException;

public class Task_6_2_CountCount implements AutoCloseable{
    private int count;  // переменная счётчик
    private boolean closed = false; // добавим флаг - объеект открыт или закрыт
    public void add() throws IOException{   // метод инкременирования счетика
        if (closed){                        // вернем исключение, если объект закрыт
            throw new IOException();
        }
        count++;                            // иначе увеличим счетчик
    }

    public String toString(){                  //для удобства добавим метод печати нашего счетчика
        return String.valueOf(count);
    }

    @Override                               // наш класс требует реализации метода закрытия
    public void close() throws Exception {
        closed = true;                      // в случае закрытия объекта, флагу присвоим true
    }
}
