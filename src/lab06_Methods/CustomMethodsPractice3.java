package lab06_Methods;

import utilities.StringUtility;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));

        System.out.println(endLy("Cydeo"));

        System.out.println(hasBad("bad"));

        System.out.println(atFirst("ersd"));

        System.out.println(isPalindrome("Recacer"));


    }
    public static String doubleChar(String str){
        String result = "";  // TThhee

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            result += each + "" + each;
        }

        return result;

    }

    public static boolean endLy(String str){
        return str.endsWith("ly");
    }

    public static boolean hasBad(String str){

        if(str.equals("bad")){
            return true;
        }

        if(str.length() < 4){
           return false;
        }

        if(str.substring(0,3).equals("bad")){
            return true;
        }

        if(str.substring(1,4).equals("bad")){
            return true;
        }

        return false;


    }

    public static String atFirst(String str){
        if(str.isEmpty()){
            return "@@";
        }else if(str.length() == 1){
            return str.charAt(0) + "@";
        }else{
            return str.substring(0,2);
        }
    }

    public static boolean isPalindrome(String str){

        return StringUtility.reverse(str).equalsIgnoreCase(str);
    }


}
