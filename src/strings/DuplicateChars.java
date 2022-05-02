package strings;

import java.util.Locale;

public class DuplicateChars {
    static String cadena="estaron";
    public static void main(String args[]){
        String s= sort(cadena);
        boolean duplicates = findDuplicates(s);
        if(duplicates)
            System.out.println("Elementos duplicados");
        else
            System.out.println("no hay elementos duplicados");
    }
    public static boolean findDuplicates(String s){
        char[] chars = s.toLowerCase().toCharArray();
        for(int i=0;i<chars.length-1;i++){
            if(chars[i] == chars[i+1])
                return true;
        }
        return false;
    }
    public static String sort(String input){
        char[] chars = input.toLowerCase().toCharArray();
        int j=0;
        for(int i=0;i<chars.length;i++){
            char current= chars[i];
            j=i-1;
            while (j >= 0 && chars[j]> current){
                chars[j+1]=chars[j];
                j--;
            }
            chars[j+1]=current;

        }
        return String.valueOf(chars);

    }
}
