import java.util.*;

public class ScrabbleScore{

String lettersAvailable = "ABCDEFG";
int[] primeNumbers = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
Dictionary dict = new Dictionary();
    
     public static void main(String []args)
     {
         ArrayList<String> allCombinations = new ArrayList<String>();
         generateAllCombinations("AB",7, allCombinations);
         //System.out.print(allCombinations);
     }
     
    public static ArrayList<String> getpowerset(String string,int n,ArrayList<String> allCombinations)
    {
        if(n < 0)
        {
            return null;
        }
        if(n == 0)
        {
            if(allCombinations.size() != 0)
                allCombinations = new ArrayList<String>();
            allCombinations.add(" ");            
            return allCombinations;
        }
        allCombinations = getpowerset(string, n-1, allCombinations);
        
        ArrayList<String> tmp=new ArrayList<String>();
        
        for(String s : allCombinations)
        {
            if(s.equals(" "))
                tmp.add(string.charAt(n-1));
            else
                tmp.add(s+string.charAt(n-1));
        }
        allCombinations.addAll(tmp);
        return allCombinations;
    }
    
    public static long calculatePrimeProduct(int[] primeNumbers, String word)
    {
		long product = 1;
		for(int i = 0; i < word.length(); i++)
		{
			product *= primeNumbers[word.charAt(i)-65];
		}
		return product;

	}
    
    //hash table with key as the scrabble score and the valid word list 
    public static int genUniqScore(ArayList<String> allCombinations)
    {
        int[] alphabetScore = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        HashMap<long, ArrayList<String>> AllPossibleWordList = new HashMap<int, ArrayList<String>>();
        for(String g : allCombinations){
            if(g.length() > 1)
            {
                long primeProduct = calculatePrimeProduct(primeNumbers,g);
                if(dict.dictionary.get(primeProduct).contains(g))
                {
                    ArrayList<String> word;
                    if(AllPossibleWordList.containsKey(computeScoreGivenWord(g)))
                    {
                      word = new ArrayList<String>();
                      word = AllPossibleWordList.get(computeScoreGivenWord(g));
                      word.add(g);
                      AllPossibleWordList.put(computeScoreGivenWord(g),word);
                    }
                    else
                    {
                        word = new ArrayList<String>();
                        word.add(g);
                        AllPossibleWordList.put(computeScoreGivenWord(g),word);
                    }
                }
            }
        }
    }
    
    public static int computeScoreGivenWord(String string)
    {
        return 100;
    }

    private static void generateAllCombinations(String string,
			ArrayList<String> allCombinations) {
    
    }

}