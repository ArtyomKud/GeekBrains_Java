package groupId;

public class MyArrayDataException extends Throwable{
    int x1;
    int y1;
    public MyArrayDataException (int x1, int y1){
        this.x1 = x1;
        this.y1=y1;
    }
    public void printStackTrace(){
        System.out.println("Не удалось преобразование строки в число в ячейке: [" +x1+"] "+" ["+y1+"]");
    }


}
