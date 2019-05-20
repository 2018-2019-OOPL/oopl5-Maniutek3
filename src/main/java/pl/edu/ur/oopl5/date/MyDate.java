package pl.edu.ur.oopl5.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args){
        Date data=new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
        System.out.println("Aktualna data: " + ft.format(data));
    }
}
