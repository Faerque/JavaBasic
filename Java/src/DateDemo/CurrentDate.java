package DateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Formatted Current Date is = "+currentDate);



    }

}
