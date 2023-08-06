public class largestString {
    public static void main(String[] args) {
        String [] Cars = {"Corolla" , "Civic" , "Prius" , "Honda"} ;

        String largest = Cars[0] ;
        for (int i=1 ; i< Cars.length ; i++){
           if(largest.compareTo(Cars[i]) < 0)        // Orders
               largest = Cars[i] ;
        }
        System.out.println("Largest String Among Them Is : "+largest);
    }
}
