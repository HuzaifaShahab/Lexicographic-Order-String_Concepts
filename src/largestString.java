public class largestString {
    public static void main(String[] args) {
        String [] Cars = {"Corolla" , "Civic" , "Prius" , "Honda"} ;  // Collection of Cars-Strings

        String largest = Cars[0] ;                                   // Assumption
        for (int i=1 ; i< Cars.length ; i++){
            // largest < 0 -- Negative m/ l<C[i]
           if(largest.compareTo(Cars[i]) < 0)        // On the basis of Lexicographic-Order
               largest = Cars[i] ;
        }
        System.out.println("Largest String Among Them Is : "+largest);
    }
}
