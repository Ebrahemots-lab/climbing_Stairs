class Main{
    public static void main (String args[]){

/*
this code will calculate how many ways it will take to climb the 7 stairs 
Date : 2/7/2023
*/

        
        /*

        stairs = 7 

        ----- 21
            ---- 13
                ----- 8
                    ----- 5
                        ----- 3
                             -----  2  current
                                ----- 1 =  r2
                                     -- 1     r1
         */



        int r1 = 1 ;
        int r2 = 1 ; // 0
        int current;
        for(int i = 2 ; i <= 7 ; i++){
            current = r1 + r2; // 2
            r1 = r2 ;
            r2 = current;
            System.out.println(r2);
        }


    }

}
