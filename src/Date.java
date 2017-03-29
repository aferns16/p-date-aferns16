public class Date
{
    private int day;
    private int month;
    private int year;


    /**
     * Constructor for objects of class Date
     */
    public Date(int myDay, int myMonth, int myYear)
    {
        
        day = myDay;
        month = myMonth;
        year = myYear;
    
    
    }
    
    public Date (int myYear)
    {
        this.year = myYear;
        this.month = (int)Math.floor(Math.random()*12+1);
        this.day = (int)Math.floor(Math.random()*(getNumDaysOfMonths(this.month))+1);
    
    }
    
        public String printDate()
        {
        return toString();
       }
       public int getDay()
       {
        
        return this.day;
       }
       
        public int getMonth()
        {
        
        return this.month;
       }
       
        public int getYear() 
        {
        
        return this.year;
       }
       
       public boolean isSameDay(Date another)
       {
        
           return (this.day == another.getDay());  
       }
       
       public boolean isSameMonth(Date another)
       {
        
           return (this.month == another.getMonth());  
       }
       
       public boolean isSameYear(Date another)
       {
        
           return (this.year == another.getYear());  
       }
       
       public boolean isSame(Date another)
       {
           
           return((isSameDay(another))&&(isSameMonth(another))&&(isSameYear(another)));
           
       }
       
       public String transformIntoWord(boolean same)
       {
           String word = "NaN";
           if(same == true)
           {word = "Sí";
           }
           else if(same == false)
           {word = "No";
           }
           return word;
       }
       
       public String getMonthName(int month)
       {
          String mes = "NaN";
        switch(month)
        {
         case 1: mes = "Enero";   
         break;
         case 2: mes = "Febrero";
         break;
         case 3: mes = "Marzo";
         break;
         case 4: mes = "Abril";
         break;
         case 5: mes = "Mayo";
         break;
         case 6: mes = "Junio";
         break;
         case 7: mes = "Julio";
         break;
         case 8: mes = "Agosto";
         break;
         case 9: mes = "Septiembre";
         break;
         case 10: mes = "Octubre";
         break;
         case 11: mes = "Noviembre";
         break;
         case 12: mes = "Diciembre";
         break;
        }
        
       return mes;
        
    }
    
    public String printMonthName() {
    
        return (this.getMonthName(this.month));
        
    }
    
    public boolean checkDay()
    { 
        boolean check = false;
        switch(month)
        {
        case 1: 
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
            
         break;
         case 2: 
         if((this.getDay()<28)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 3: 
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 4: 
         if((this.getDay()<30)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 5:
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 6:
         if((this.getDay()<30)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 7:
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 8:
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 9: 
         if((this.getDay()<30)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 10:
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 11: 
         if((this.getDay()<30)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         case 12:
         if((this.getDay()<31)&&(this.getDay()>1))
        {
            check = true;
        }
         break;
         default: 
         check = false;
    
    
       }
       return check;
    }
    
    public String monthSeason()
    {
        String estacion = "NaN";
     switch(month)
         {
         case 1:        
         case 2:           
         case 3: estacion = "Invierno"; 
         break;
         case 4:        
         case 5:        
         case 6: estacion = "Primavera";
         break;
         case 7:        
         case 8:         
         case 9: estacion = "Verano";
         break;
         case 10: 
         case 11: 
         case 12: estacion = "Otoño";
         break;
         default: estacion = "No existe";
    
        }
        return estacion;
    }
    
    public String monthsLeft() 
    {
        StringBuilder salida = new StringBuilder();
        int i;
        for (i=this.getMonth(); i<=12; i++)
        {
            
            salida.append(getMonthName(i)+"\n");
                                           
    }
        return salida.toString();
    
    }
    
    public int numMonthsLeft()
    {
        int i,counter = 0;
        for (i=this.getMonth(); i<=12; i++)
        {
            counter++;        
    }
    return counter;
    }

    public int getNumDaysOfMonths(int month)
    {
        int numOfDays = 0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numOfDays = 31;
            break;
            case 2: numOfDays = 28;
            break;
            case 4:
            case 6:
            case 9:
            case 11: numOfDays = 30;
            break;
           
                                             
        }
    
        return numOfDays;
    }
    
    public int getNumDaysOfMonths()
    {
        return this.getNumDaysOfMonths(this.month);
        
        
    }
    
    public String printDatesUntilEndOfMonth()
    {
        StringBuilder salida = new StringBuilder();
        int i;
                
        for (i=this.day+1; i<=getNumDaysOfMonths(this.month);i++)
        {
            
            salida.append(i+"/"+this.getMonth()+"/"+this.getYear()+"\n");
           
        }
        return salida.toString();
    }
    
    public String printMonthsSameAmountOfDays()
    {
        StringBuilder salida = new StringBuilder();
        int i;
        
            for(i=1; i<=12; i++)
            {
                if(getNumDaysOfMonths(i)==getNumDaysOfMonths(this.month))
                {
                   salida.append((getMonthName(i)+"\n"));
                    
                }
            }
            return salida.toString();
    }
    
    public int passedDays()
    {
          int counter = this.day;
          int i;
          
          for(i=1;i<this.month;i++)        
          {
            counter = counter + getNumDaysOfMonths(i);
            
          }
          
          return counter;    
    }
         
    public int getNumGuess()
    {
        Date randomDate;
        boolean end = false;
        int counter = 0;
        
        while(end==false)
        {
            randomDate=new Date(this.year);
            counter++;
            
            if(this.isSame(randomDate))
            {
                end=true;
            }
            
           
        }
        return counter;
    }
    
      public String toString()
      {
         return this.day+ "/" + this.month +"/"+  this.year; 
          
       }
      
     
     
    /*public void printRandomDate()
    {
        Date random = new Date(this.year);
        System.out.println(random.getDay()+"/"+random.getMonth()+"/"+random.getYear());
    }*/
    }


        
       
        
       
        
    

    
    
    
   
