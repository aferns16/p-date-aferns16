
/**
 * Write a description of class MainDate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainDate
{

   public static void main(String args[])
   {
       
       Date today = new Date (18,2,2017);
       Date tomorrow = new Date (28,3,2017);
       
       
       System.out.println(today.printDate());
       System.out.println("¿Día correcto? " + today.transformIntoWord(today.checkDay()));
       System.out.println("Nombre del mes: "+today.printMonthName());
       System.out.println("Estación del mes: "+today.monthSeason());      
       System.out.println("Meses restantes: " +today.numMonthsLeft()+", que son:\n"+ today.monthsLeft()); //Contando el propio mes     
       System.out.println("Días del mes: "+ today.getNumDaysOfMonths());
       System.out.println("Días pasados desde inicio del año: "+today.passedDays());
       System.out.println("Fechas hasta final de mes:\n"+today.printDatesUntilEndOfMonth());     
       System.out.println("Meses con mismos días: "+today.printMonthsSameAmountOfDays());
       System.out.println("Intentos para acertar nuestra fecha con otra generada aleatoriamente: "+today.getNumGuess());
       System.out.println("Segunda fecha: " + tomorrow.printDate());
       System.out.println("¿Es el mismo día? "+today.transformIntoWord(today.isSameDay(tomorrow)));
       System.out.println("¿Es el mismo mes? "+today.transformIntoWord(today.isSameMonth(tomorrow)));
       System.out.println("¿Es el mismo año? "+today.transformIntoWord(today.isSameYear(tomorrow)));
       System.out.println("¿Es la misma fecha? "+today.transformIntoWord(today.isSame(tomorrow)));
       
      
    }
}

