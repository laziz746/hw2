public class MyArrayDataException extends Costom {

    public MyArrayDataException(int row, int col) {


        super(String.format("В ячейке лежит символ или текст вместо числа[%d, %d]", row, col));
    }
}