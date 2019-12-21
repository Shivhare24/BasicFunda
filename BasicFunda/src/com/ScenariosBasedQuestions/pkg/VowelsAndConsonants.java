package com.ScenariosBasedQuestions.pkg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			Integer testcase = Integer.parseUnsignedInt(reader.readLine());
			for (int i = 0; i <testcase; i++) {
				Integer length = Integer.parseUnsignedInt(reader.readLine());
				String input = reader.readLine();
					checkOccurance(input,length);		
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void checkOccurance( String input,Integer length ) {
        int count = 0;
        int temp ,k,x;

        for ( int i = 0; i<length; i++ ) {
            temp = 0;
            k =0;
            x = 0;
            for ( int j = i; j<length; j++ ) {
                // for vowels
               if ( isVowel(input.charAt(j)) && isVowel(input.charAt(i)) ){
                   if( i == j ) {
                       temp++;
                       k++;
                   }else {
                       if ( !isVowel(input.charAt( j - 1 ))) temp++;
                       else break;
                   }
               }else {
                   if ( k > 0  ) {
                       if ( isVowel( input.charAt(j-1) )) temp++;
                       else break;
                   }
               }
               if ( !isVowel(input.charAt(j))  &&  !isVowel(input.charAt(i)) ) {
                   if( i == j ) {
                       temp++;
                       x++;
                   }else {
                       if ( isVowel(input.charAt( j - 1 ))) temp++;
                       else break;
                   }
               }else {
                   if ( x > 0 ) {
                       if( !isVowel( input.charAt( j-1 ))) temp++;
                       else break;
                   }
               }

               // for Cons.
               if( temp > 1 ) count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isVowel( char ch ) {

        List<Character> list = Arrays.asList('a','e','i','o','u');
        return list.contains(ch);
    }

}