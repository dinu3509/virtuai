import java.util.*;

class Gagan{
    public static void main(String[] args){
        Scanner z= new Scanner(System.in);
        int year=z.nextInt();
        if((year%400)==0 ){
            System.out.println("its leap year");
}       else if(year%100==0){
    System.out.println("not a leap year");
}else if(year%4==0){
    System.out.println(" a leap year");
}else{
    System.out.println("not a leap year");
}


    }
}