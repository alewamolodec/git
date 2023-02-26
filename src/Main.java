import java.sql.Time;
import java.time.LocalTime;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        for(int i =1; i<10;i++ ){
            System.out.print(i + " ");
            for (int j = 9; j>0;j--){
                System.out.print(j*i);
                System.out.println("");
            }
        }
        System.out.println("Dady");
        System.out.println(Year.now());
        System.out.println(Time.valueOf(LocalTime.now()));
    }

}