package src.wordcount;

import java.io.*;

public class WordCount
{
    public static void main(String args[]) throws IOException
    {
        File file = new File("inputwords.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        
        // Initializing counters
        int words_count = 0;
        int sentences_count = 0;
        int characters_count = 0;
        int paragraphs_count = 1;
        int whitespaces_count = 0;
        int new_line_count = 0;
        while ((line = reader.readLine()) != null)
        {
            if (line.equals(""))
            {
                paragraphs_count++;
                new_line_count += 1;
            } 
            else
            {
                new_line_count += 1;
                characters_count += line.length();
                String[] wordList = line.split("\\s+");
                words_count += wordList.length;
                whitespaces_count = words_count - 1;
                String[] sentenceList = line.split("[!?.:]+");
                sentences_count += sentenceList.length;
            }
        }
        // \n is also new line character.
        characters_count += new_line_count;
        System.out.println("New line :"+new_line_count);
        System.out.println("Number of words = " + words_count);
        System.out.println("Number of sentences = " + sentences_count);
        System.out.println("Number of characters = " + characters_count);
        System.out.println("Number of paragraphs = " + paragraphs_count);
        System.out.println("Number of whitespaces = " + whitespaces_count);

        reader.close(); //close buffered reader
    }
}