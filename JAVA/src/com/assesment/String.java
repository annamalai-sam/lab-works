package com.assesment;
import java.lang.String;
import java.util.Arrays;

class string {
     public static void main(String[] args) {
         String name = "meenu";
         String lastName ="";
         char[] ch = new char[name.length()];
         for (int i = 0; i < name.length(); i++) {
             ch[i] = name.charAt(i);
         }
         System.out.println(string.removeDuplicate(ch,name.length()));

     }
     static String removeDuplicate(char str[], int n)
     {
         int index = 0;
         for (int i = 0; i < n; i++) {
             int j;
             for (j = 0; j < i; j++) {
                 if (str[i] == str[j]) {
                     break;
                 }
             }
             if (j == i) {
                 str[index++] = str[i];
             }
         }
         return String.valueOf(Arrays.copyOf(str, index));
     }
 }

