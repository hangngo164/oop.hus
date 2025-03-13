package oop.lab01.ex2;

public class PrintNumberInWord {
    public static void main(String[] args){
        System.out.println("Using nested-if:");
        usingNestedIf(1);
        usingNestedIf(2);
        usingNestedIf(3);
        usingNestedIf(4);
        usingNestedIf(5);
        usingNestedIf(6);
        usingNestedIf(7);
        usingNestedIf(8);
        usingNestedIf(9);
        usingNestedIf(10);
        System.out.println("Using switch - case -  dafault:");
        usingSwitchCase(1);
        usingSwitchCase(2);
        usingSwitchCase(3);
        usingSwitchCase(4);
        usingSwitchCase(5);
        usingSwitchCase(6);
        usingSwitchCase(7);
        usingSwitchCase(8);
        usingSwitchCase(9);
        usingSwitchCase(10);
    }
    public static void usingNestedIf(int number){
        System.out.println("The number is " + number);
        if(number == 1){
            System.out.println("ONE");
        }else if(number == 2){
            System.out.println("TWO");
        }else if(number == 3){
            System.out.println("THREE");
        }else if(number == 4){
            System.out.println("FOUR");
        }else if(number == 5){
            System.out.println("FIVE");
        }else if(number == 6){
            System.out.println("SIX");
        }else if(number == 7){
            System.out.println("SEVEN");
        }else if(number == 8){
            System.out.println("EIGHT");
        }else if(number == 9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }
    }

    public static void usingSwitchCase(int number){
        System.out.println("The number is " + number);
        switch(number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                 System.out.println("NINE");
                 break;
            default:
                System.out.println("OTHER");
        }
    }
}
