package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StremPratices
{
  public static void main(String[] args) {
    List<String> arlist = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
    Map<String, Long> armap = arlist.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    System.out.println(armap);



        List<String> list = Arrays.asList("I", "am", "a", "java", "developer");

         String maxWord = list.stream()
            .max(Comparator.comparingInt(String::length))
            .orElse("");

        System.out.println("Biggest word: " + maxWord);

  /*    Convert a list of strings to uppercase , sort them and print*/

        List<String> arlist2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        List<String> sortUpperCase = arlist2.stream()
                                            .map(words-> words.toUpperCase())
                                            .sorted()
                                            .toList();

        System.out.println("Sorting in stream "+sortUpperCase);

     /* Get the list of strings where the length of each element is >5 and get the count*/

      List<String> arlist3 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple","sam","GOPI");

      Long lengthCount = arlist3.stream()
                                .filter(words->words.length() > 5 )
                                .count() ;

      System.out.println("THE words in counts"+lengthCount);

/*      3. Remove duplicates from a list*/

      List<String> arlist4 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple","sam","GOPI");

      List<String> removeduplicates = arlist4.stream().distinct().toList();

      System.out.println("the unique values are ::"+removeduplicates);

/*      4. Get the list of strings having a particular word*/

      List<String> sentences = Arrays.asList(
              "Java Stream API is powerful.",
              "Functional programming in Java is easier now.",
              "Streams help process collections.",
              "This is a test of the Stream filter."
      );

      String targetwords = "Java";

      List<String> particularWords = sentences.stream().filter(words -> words.contains(targetwords)).toList();

      System.out.println(" The TargetWords present ::"+particularWords);

 /*     5. Write a Java program to remove strings that start with a specific word from a list using streams. */

      List<String> arlist5 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple","sam","GOPI");

      List<String> removeString = arlist5.stream()
                                         .filter(words -> !words.startsWith("a"))
                                         .toList();

      System.out.println(" The Remove the String ::"+removeString);

     /* 6. Find the first element in a list that starts with a particular letter using streams */

      List<String> arlist6 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

      Optional<String> firstElement = arlist6.stream()
                                             .filter(words -> words.startsWith("T"))
                                             .findFirst();

      String result = firstElement.orElse("THE VALUE IS NOT PRESENT");

      System.out.println("The Result ::"+result);

     /* 7. Get the length of each name in a list*/

      List<String> arlist7 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

      List<Integer> LengthOfWords = arlist7.stream()
                                            .map(words->words.length())
                                            .toList();

      System.out.println(" The lenght of words in each List"+LengthOfWords);


   /* Intermediate*/

   /* 8. Sort the list of strings based on their lengths in ascending/descending order.*/

    List<String> arlist8 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

    List<Integer> sortlist = arlist8.stream().map(words->words.length()).sorted().toList() ;

    System.out.println(" Orginal words "+arlist8);
    System.out.println(" The sorted lenght of ascending order "+sortlist);

    /*obtimized sollution*/

    List<String> arlist9 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

    List<String> sortlist1 = arlist9.stream()
                                    .sorted(Comparator.comparingInt(String::length))
                                    .toList();

    System.out.println(" The Words by lenght ::"+sortlist1);

    /*For desending order */
    List<String> arlist10 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

    List<String> sortedDesc =  arlist10.stream()
                                       .sorted(Comparator.comparingInt(String::length).reversed())
                                       .toList();

    System.out.println("the SortedDesc Order of list ::"+sortedDesc);

    List<String> arlist11 = Arrays.asList("apple", "banana", "apple", "orange", "btnana", "apple","sam","GOPI");

    List<String> sortedAsc = arlist11.stream()
            .sorted(
                    // Primary sort: Ascending Length
                    Comparator.comparingInt(String::length)
                            // Secondary sort (tie-breaker): Alphabetical (A-Z)
                            .thenComparing(String::toString)
            )
            .toList();

    System.out.println("Combined Ascending Sort: " + sortedAsc);
// Expected Output: [sam, GOPI, apple, apple, apple, banana, btnana, orange]
// Notice: "banana" (b) comes before "btnana" (b) and "orange" (o) comes last for the 6-letter words.

    /*9. Find the longest word in the list.*/

    List<String> arlist12 = Arrays.asList("apple", "banana", "apple", "orange", "btnanastg", "apple","sam","GOPI");

    Optional<String> sortedList = arlist12.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst();

    List<String> optionaltoList = sortedList.stream().collect(Collectors.toList());

    System.out.println(" The sortedList in Stream "+sortedList);

    System.out.println(" The optionaltoList data "+optionaltoList);


    /* optimized way */

    List<String> arlist13 = Arrays.asList("apple", "banana", "apple", "orange", "btnanastg", "apple","sam","GOPI");

    Optional<String> maxLength = arlist13.stream()
                                         .max(Comparator.comparingInt(String::length));

    System.out.println(" The Optimized solution for the max length ::"+maxLength);

    /*10. Get the list of strings having vowels*/

    List<String> arlist14 = Arrays.asList("apple", "banana", "apple", "orange", "btnanastg", "apple","sam","GOPI","hw");

    String Vowels = "AEIOU";

    List<String> stringVowels = arlist14.stream().filter(words->words.toUpperCase().chars().anyMatch(c-> Vowels.indexOf(c) != -1 ))
                                                 .toList();

    System.out.println("The stringVowels is having ::"+stringVowels);

    List<String> arlist15 = Arrays.asList("apple", "banana", "apple", "orange", "btnanastg", "apple","sam","GOPI","hw");

    //String Vowels = "AEIOU";

    List<String> stringVowelss = arlist14.stream().map(words -> words.toLowerCase())
                               .filter(words->words.matches(".*[aeiou].*") )
                               .toList();

    System.out.println("The stringVowels 2 is having ::"+stringVowelss);

  /*  11. convert a list of strings into a single string, separated by commas, using streams*/

    List<String> arlist16 = Arrays.asList("apple", "banana", "apple", "orange", "btnanastg", "apple","sam","GOPI","hw");

    String inString =  arlist16.stream().collect(Collectors.joining(", "));

    System.out.println(" 11. convert the list to string ::"+inString);

    String fullSentence = arlist16.stream()
            .collect(Collectors.joining(", ", "The fruits are: [", "]."));

    System.out.println(fullSentence);

    /*12. Write a Java program to create a new list of strings, where each string is reversed from the original list, using Java streams.*/





  }


  }


