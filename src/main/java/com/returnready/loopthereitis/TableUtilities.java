package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String number="";
        int product;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                product=i*j;
                if(product<10){
                    number +="  "+product+" ";
                }else{
                    number +=" "+product+" ";
                }
                number +="|";
            }
            number+="\n";
        }

        return number;
    }

    public static String getLargeMultiplicationTable() {
        String number="";
        int product;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                product=i*j;
                if(product > 9 && product < 100){
                    number +=" "+product+" ";
                }else if (product < 10 ) {
                    number +="  "+product+" ";
                } else { //otherwise product is equal to 100
                    number += product + " ";

                }
                number +="|";
            }
            number+="\n";
        }
        System.out.println(number);
        return number;
    }

    public static String getMultiplicationTable(int tableSize) {
        String number="";
        int product;
        for(int i=1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
                product=i*j;
                if(product > 9 && product < 100){
                    number +=" "+product+" ";
                }else if (product < 10 ) {
                    number +="  "+product+" ";
                } else { //otherwise product is equal to 100
                    number += product + " ";

                }
                number +="|";
            }
            number+="\n";
        }
        System.out.println(number);
        return number;
    }
}
