//Pedro Antonio Nava Hernández Programación Avanzada
package chickens02;



public class Chickens02 {
    public static void main(String[] args) {
        int daysweek=7,monday=100, thursday= 117, wednesday= 117;
        double dailyAverage,costegg=16.09,monthlyAverage,monthlyProfit;
       dailyAverage= costegg*daysweek;
      monthlyAverage= (dailyAverage/(30));
      

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
   
    }
    
}
