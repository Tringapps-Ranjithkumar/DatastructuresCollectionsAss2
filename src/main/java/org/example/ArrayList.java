package org.example;
import java.util.*;
import java.util.logging.Logger;
public class ArrayList{
    public static void main(String[] args){
        final Logger logger = Logger.getLogger("InfoLogging");
        Scanner sc=new Scanner(System.in);
        java.util.ArrayList<Integer> myArray = new java.util.ArrayList<Integer>();
        int op=1;
        while(op>=1 && op<=4){
            logger.info("Select the below Operations \n 1. add \n 2. remove \n 3.Print elements \n 4.exit");
            op=sc.nextInt();
            switch (op){
                case 1:
                    logger.info("Enter the no of element to be added");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++) {
                        int element = sc.nextInt();
                        myArray.add(element);
                    }
                    break;
                    case 2:
                    logger.info("enter the element to be removed");
                    int search=sc.nextInt();
                    if(myArray.contains(search)){
                        myArray.remove(myArray.indexOf(search));
                    }
                    break;
                case 3:
                    for(int i:myArray){
                        String s=String.valueOf(i);
                        logger.info(s);
                    }
                    break;
                case 4:
                    op=10;
                    break;
                default:
                    logger.info("Something went Wrong");

            }
        }
    }
}
