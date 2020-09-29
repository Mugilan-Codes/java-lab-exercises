# Week 6 - String Handling

---

## Lab.Ex.6

## Date: 23.09.2020

---

1. **Displaying a Sentence with Its Words Reversed**. Write an application
 that inputs a line of text, tokenizes the line with String method split and
  outputs the tokens in reverse order. Use space characters as delimiters.
  
1. **Displaying Strings in Uppercase and Lowercase**. Write an application that
 inputs a line of text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
 
1. **(Searching Strings)** Write an application that inputs a line of text and a
 search character and uses String method indexOf to determine the number of occurrences of the character in the text.
 
1. **Creating Three-Letter Strings from a Five-Letter Word**. Write an
 application that reads a five-letter word from the user and produces every possible three-letter string that can be derived from the letters of that word. For example, the three-letter words produced from the word “bathe” include “ate,” “bat,” “bet,” “tab,” “hat,” “the” and “tea.”
 
1. **Printing Dates in Various Formats**. Dates are printed in several common
 formats. Two of the more common formats are 04/25/1955 and April 25, 1955 Write an application that reads a date in the first format and prints it in the second format.
 
1. **Replacing Substrings and Splitting Strings** Sometimes it’s useful to
 replace parts of a string or to split a string into pieces. For this purpose, class String provides methods replaceAll, replaceFirst and split. These methods are demonstrated in the following lines.
 
    **Get two sentences as input from user**
    1. String First sentence = "This sentence $$$$$$ ends in 5 stars "
        1. Replace this --> the
        1. Replace $ --> &
        1. Replace stars --> Chocolates
    1. String Second sentence = "1, 2, 3, 4, A,B,C,D";
        1. (first two numbers 1,2) --> digit
        1. A,…D --> Alphabet
        
1. **Metric Conversions**. Write an application that will assist the user with
 metric conversions. Your application should allow the user to specify the names of the units as strings (i.e., centimeters, liters, grams, and so on, for the metric system and inches, quarts, pounds, and so on, for the English system) and should respond to simple questions, such as
    1. "How many inches are in 2 meters?"
    1. "How many liters are in 10 quarts?"
    1. Your application should recognize invalid conversions. For example, the question "How many feet are in 5 kilograms?" is not meaningful because "feet" is a unit of length, whereas "kilograms" is a unit of mass.