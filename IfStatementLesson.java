import java.time.DayOfWeek;

public class IfStatementLesson {

    public static void main(String[] args) {
        int hourofDay=7;
        if(hourofDay<11)
            System.out.println("Good Morning");
         System.out.println("Kumain ka na ba?");
         
         // if else
         if(hourofDay<11)
            System.out.println("Good Morning");
        else    
            System.out.println("Good Afternoon");
            System.out.println("Good Afternoon");

        // if, else if, else
         if(hourofDay<18)
            System.out.println("Good Evening");
        else if(hourofDay<=12)
         System.out.println("Good Afternoon");
        else    
            System.out.println("Good morning");
        // (boolean experession) ? T : F;
        System.out.println((hourofDay<=18)?"Good Evening":"Good Day");
        int 
        switch(hourofDay){

        }
         
    }
}