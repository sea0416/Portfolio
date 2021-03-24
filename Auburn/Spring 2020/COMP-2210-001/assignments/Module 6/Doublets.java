import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.SortedSet;

import java.util.stream.Collectors;

/**
 * Provides an implementation of the WordLadderGame interface. 
 *
 * @author Haegang Yang (hzy0052@auburn.edu)
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2019-03-29 DH
 * @version 2020-04-10 KM
 */
public class Doublets implements WordLadderGame {

    // The word list used to validate words.
    // Must be instantiated and populated in the constructor.
    /////////////////////////////////////////////////////////////////////////////
    // DECLARE A FIELD NAMED lexicon HERE. THIS FIELD IS USED TO STORE ALL THE //
    // WORDS IN THE WORD LIST. YOU CAN CREATE YOUR OWN COLLECTION FOR THIS     //
    // PURPOSE OF YOU CAN USE ONE OF THE JCF COLLECTIONS. SUGGESTED CHOICES    //
    // ARE TreeSet (a red-black tree) OR HashSet (a closed addressed hash      //
    // table with chaining).
    /////////////////////////////////////////////////////////////////////////////
   TreeSet<String> lexicon;

    /**
     * Instantiates a new instance of Doublets with the lexicon populated with
     * the strings in the provided InputStream. The InputStream can be formatted
     * in different ways as long as the first string on each line is a word to be
     * stored in the lexicon.
     */
   public Doublets(InputStream in) {
      try {
            //////////////////////////////////////
            // INSTANTIATE lexicon OBJECT HERE  //
            //////////////////////////////////////
         lexicon = new TreeSet<String>();
         Scanner s =
                new Scanner(new BufferedReader(new InputStreamReader(in)));
         while (s.hasNext()) {
            String str = s.next();
                /////////////////////////////////////////////////////////////
                // INSERT CODE HERE TO APPROPRIATELY STORE str IN lexicon. //
                /////////////////////////////////////////////////////////////
            lexicon.add(str.toUpperCase());
            s.nextLine();
         }
         in.close();
      }
      catch (java.io.IOException e) {
         System.err.println("Error reading from InputStream.");
         System.exit(1);
      }
   }


    //////////////////////////////////////////////////////////////
    // ADD IMPLEMENTATIONS FOR ALL WordLadderGame METHODS HERE  //
    //////////////////////////////////////////////////////////////
   public int getHammingDistance(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return -1;
      }
      
      int dist_counter = 0;
      for(int i = 0; i < str1.length(); i++) {
         if (str1.charAt(i) != str2.charAt(i)) {
            dist_counter += 1;
         }
      }
      return dist_counter;
   }

   public List<String> getMinLadder(String start, String end) {
      List<String> ladder = new ArrayList<String>();
      
      if (!(isWord(start) && isWord(end)) ||
            getHammingDistance(start, end) == -1) {
         return ladder;
      }
      TreeSet<String> visited = new TreeSet<String>();
      Deque<Node> queue = new ArrayDeque<>();
      queue.addLast(new Node(start, null));
      
      visited.add(start);
      
      while (!queue.isEmpty()) {
         Node n = queue.removeFirst();
         String word = n.word;
         
         if (word.equalsIgnoreCase(end)) {
            Node p = n;
            while(p != null) {
               ladder.add(0, p.word);
               p = p.predecessor;
            }
            return ladder;
         }
         
         for (String neighbor : getNeighbors(word)) {
            if (!(visited.contains(neighbor))) {
               visited.add(neighbor);
               queue.addLast(new Node(neighbor, n));
            }
         }
      }
      
      return ladder;
   }

   
    
    
   private class Node {
      String word;
      Node predecessor;
   
      public Node(String p, Node pred) {
         word = p;
         predecessor = pred;
      }
   }


   public List<String> getNeighbors(String word) {
      List<String> neighbors = new ArrayList<String>();
      
      if (word.isEmpty()) {
         return neighbors;
      }
   
      for(int i = 0; i < word.length(); i++) {
         for(char letter = 'a'; letter <= 'z'; letter++) {
            char[] wordArray = word.toCharArray();
            wordArray[i] = letter;
            String neighbor = new String(wordArray);
            if (word.charAt(i) != letter && isWord(neighbor)) {
               neighbors.add(neighbor);
            }
         }
      }
      
      return neighbors;
   }


   public int getWordCount() {
      return lexicon.size();
   }


   public boolean isWord(String str) {
      return lexicon.contains(str.toUpperCase()) ? true : false;
   }

   public boolean isWordLadder(List<String> sequence) {
      if (sequence.isEmpty()) {
         return false;
      }
      
      if (sequence.size() == 1) {
         if (isWord(sequence.get(0))) {
            return true;
         }
         return false;
      }
      
      for (int i = 1; i < sequence.size(); i++) {
         String startWord = sequence.get(i - 1);
         String endWord = sequence.get(i);
         if (!(isWord(startWord) && isWord(endWord))) {
            return false;
         }
         if (getHammingDistance(startWord, endWord) != 1) {
            return false;
         }
      }
      return true;
   }
}
