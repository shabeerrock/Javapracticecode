package org.example;
import java.util.List;
import java.util.Arrays;

public class StringReverser
{

//    12. Write a Java program to create a new list of strings, where each string is reversed from the original list, using Java streams.

    public static String revstringobj(String s)
    {
      return  new StringBuilder(s).reverse().toString();

    }

    public static void main(String[] args)
    {
        List<String> arlist = Arrays.asList("apple", "banana", "orange", "java");

        List<String> revString =  arlist.stream().map(StringReverser::revstringobj).toList();

        System.out.println("The RevString using StringBuilder"+revString);

      /*  13. Write a Java program to remove all strings from the list that are empty or null using streams.*/

        List<String> originalList = Arrays.asList("apple",
                null,         // This will be removed
                "banana",
                "",           // This will be removed (empty string)
                "orange",
                " ",          // This is NOT empty (it contains a space)
                null
        );

        List<String> properString = originalList.stream()
                                                .filter(words-> words != null)
                                                .filter(s -> !s.isEmpty())
                                                .filter(s->!s.isBlank())
                                                .toList();
        System.out.println(" The ProperString "+properString);



    }

}
