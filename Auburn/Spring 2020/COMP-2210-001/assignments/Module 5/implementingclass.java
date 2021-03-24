import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;
/**
 * Implementing WordSearchGame interface
 *
 * @author Haegang Yang
 * @version 04/09/2020
 * 
 */
 
public class implementingclass implements WordSearchGame
{
   TreeSet<String> words;
   String board[];
   SortedSet<String> validWords = new TreeSet<String>();
 
   public implementingclass() {
      words = new TreeSet<String>();
   }
   
   public void loadLexicon(String fileName) throws IllegalArgumentException {
      if (fileName == null) {
         throw new IllegalArgumentException();
      }
      
      try {
         File wordsFile = new File(fileName);
         Scanner sc = new Scanner(wordsFile);
         while (sc.hasNextLine()) {
            String data = sc.nextLine();
            Scanner lineScanner = new Scanner(data);
            lineScanner.useDelimiter(" ");
            words.add(lineScanner.next().toUpperCase());
         }
         int size = words.size();
         System.out.println(size);
      }
      catch (FileNotFoundException e) {
         throw new IllegalArgumentException();
      }
   }
   
   public void setBoard(String[] letterArray) {
      if (letterArray == null) {
         throw new IllegalArgumentException();
      }
      
      int dimension = letterArray.length;
      
      if (Math.sqrt(dimension) != (int)Math.sqrt(dimension)) {
         throw new IllegalArgumentException();
      }
      
      board = new String[dimension]; 
      
      for (int i = 0; i < dimension; i++) {
         board[i] = letterArray[i];
      }
   }   
   
   public String getBoard() {
      if (board.length != 0) {
         String theBoard = "";
         int dimension = (int)Math.sqrt(board.length + 1);
         for (int i = 0; i < board.length; i++) {
            theBoard += board[i];
            if (i < board.length - 1) {
               if ((i + 1) % dimension == 0) {
                  theBoard += "\n";
               }
               else {
                  theBoard += ", ";
               }
            }
         }
         return theBoard;
      }
      return "";
   }
   
   public SortedSet<String> getAllValidWords(int minimumWordLength) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (minimumWordLength < 1) {
         throw new IllegalArgumentException();
      }
      
      validWords = new TreeSet<String>();
      
      for (int i = 0; i < board.length; i++) {
         ArrayList<Integer> visited = new ArrayList<Integer>();
         digDeepDip(i, visited, minimumWordLength);
      }
      
      return validWords;
   }
   
   public int getScoreForWords(SortedSet<String> words, int minimumWordLength) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (minimumWordLength < 1) {
         throw new IllegalArgumentException();
      }
      
      int score = 0;
      
      Iterator it = words.iterator();
      
      while(it.hasNext()) {
         String word = (String)it.next();
         
         if (word.length() >= minimumWordLength && words.contains(word.toUpperCase()) && !isOnBoard(word.toUpperCase()).isEmpty()) {
            score += 1 + word.length() - minimumWordLength;
         }
      }
      
      return score;
   }
   
   public boolean isValidWord(String wordToCheck) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (wordToCheck == null) {
         throw new IllegalArgumentException();
      }
      
      if (words.contains(wordToCheck.toUpperCase())) {
         return true;
      }
      
      return false;
   }
   
   public boolean isValidPrefix(String prefixToCheck) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (prefixToCheck == null) {
         throw new IllegalArgumentException();
      }
      
      String floor = words.floor(prefixToCheck.toUpperCase());
      String ceiling = words.ceiling(prefixToCheck.toUpperCase());
      
      if(floor == null) {
         floor = prefixToCheck;
      }
      if (ceiling == null) {
         ceiling = prefixToCheck;
      }
      
      if (!floor.equalsIgnoreCase(ceiling)) {
         SortedSet<String> similarWords = words.subSet(floor, true, ceiling, true);
         for(String word: similarWords) {
            if (prefixToCheck.length() < word.length() && 
                prefixToCheck.equalsIgnoreCase(word.substring(0, prefixToCheck.length()))) {
               return true;
            }
         }
      }
      else if(prefixToCheck.equalsIgnoreCase(ceiling.substring(0, prefixToCheck.length()))) {
         return true;
      }
      
      return false;
   }
   
   public List<Integer> isOnBoard(String wordToCheck) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (wordToCheck == null) {
         throw new IllegalArgumentException();
      }
   
      List<Integer> positions = new ArrayList<Integer>();
      
      for (int i = 0; i < board.length; i++) {
         if (isValidPrefixToWord(board[i], wordToCheck)) {
            ArrayList<Integer> visited = new ArrayList<Integer>();
            visited = digDeepDipOn(i, visited, wordToCheck);
            
            String word = "";
            for(int position: visited) {
               word += board[position];
            }
            if (word.equalsIgnoreCase(wordToCheck)) {
               positions = visited;
               return positions;
            }
         }
      }
      return positions;
   }

   private ArrayList<Integer> createNextAddresses(int currentAddress, ArrayList<Integer> visited) {
      ArrayList<Integer> nextPossibleAddresses = new ArrayList<Integer>();
      int dimension = (int)Math.sqrt(board.length);
         
      int currentAdressRow = currentAddress / dimension;
      int currentAdressColumn = currentAddress % dimension;
         
      int rowStart = -1;
      int rowStop = 1;
      int columnStart = -1;
      int columnStop = 1;
         
      if(currentAdressRow - 1 < 0) {
         rowStart = 0;
      }
      if(currentAdressRow + 1 == dimension) {
         rowStop = 0;
      }
      if(currentAdressColumn - 1 < 0) {
         columnStart = 0;
      }
      if(currentAdressColumn + 1 == dimension) {
         columnStop = 0;
      }
         
      for(int i = rowStart; i <= rowStop; i++) {
         for(int j = columnStart; j <= columnStop; j++) {
            int possibleAddress = currentAddress + i * dimension + j;
            if(!visited.contains(possibleAddress) && possibleAddress >= 0
                  && possibleAddress < board.length) {
               nextPossibleAddresses.add(possibleAddress);
            }
         }
      }
         
      return nextPossibleAddresses;
   }
      
   private void digDeepDip(int address, ArrayList<Integer> visited,
                              int minimumWordLength) {     
      visited.add(address);
         
      String word = "";
      for(int position: visited) {
         word += board[position];
      }
         
      if(word.length() >= minimumWordLength && isValidWord(word) && !isOnBoard(word).isEmpty()) {
         validWords.add(word);
      }
         
      if (isValidPrefix(word)) {
         ArrayList<Integer> nextAddresses = createNextAddresses(address, visited);
            
         for (Integer nextAddress: nextAddresses) {
            digDeepDip(nextAddress, visited, minimumWordLength);
            visited.remove(nextAddress);
         }
      }
   }
      
   private ArrayList<Integer> digDeepDipOn(int address, ArrayList<Integer> visited, String wordToCheck) {
      visited.add(address);
      
      String word = "";
      for(int position: visited) {
         word += board[position];
      }
      
      if (word.equalsIgnoreCase(wordToCheck) || !isValidPrefixToWord(word, wordToCheck)) {
         return visited;
      }
            
      ArrayList<Integer> nextAddresses = createNextAddresses(address, visited);
            
      Iterator it = nextAddresses.iterator();
            
      while (it.hasNext()) {
         Integer nextAddress = (Integer)it.next();
         visited = digDeepDipOn(nextAddress, visited, wordToCheck);
         word = "";
         for(int position: visited) {
            word += board[position];
         }
         if (word.equalsIgnoreCase(wordToCheck)) {
            return visited;
         }
         visited.remove(nextAddress);
      }
      return visited;
   }
   
   public boolean isValidPrefixToWord(String prefixToCheck, String word) {
      if (words.isEmpty()) {
         throw new IllegalStateException();
      }
      if (prefixToCheck == null) {
         return false;
      }
      
      if (prefixToCheck.length() <= word.length() &&
          prefixToCheck.equalsIgnoreCase
          (word.substring(0, prefixToCheck.length()))) {
         return true;
      }
      
      return false;
   }
}

