import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDat
 class Period1 {
    void between()
    {

    }
    public  static void main(String args[]){
        int year=2020;
        int month=11;
        int dayOfMonth=23;
        LocalDate d1=LocalDate.of(year, month, dayOfMonth);
        LocalDate d2=LocalDate.of(2021, 2, 23);
        Period period=Period.between(d1,d2);

    }
    
}
