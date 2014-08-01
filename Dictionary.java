import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Dictionary {
    static final int[] primeNumbers = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    HashMap<Long,ArrayList<String>> dictionary;
    
    public void Dictionary(){
        dictionary = extractSowpoudWords(primeNumber;
    }
    
	public static HashMap<Long, ArrayList<String>> extractSowpoudWords(int[] primeNumbers){
        //ArrayList<String> arr = new ArrayList<String>();
		HashMap<Long,ArrayList<String>> dictionary = new HashMap<Long,ArrayList<String>>();
        BufferedReader br = null;
        try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:\\Users\\test\\Documents\\sowpoud.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				if(sCurrentLine.length() <= 7)
				{
				Long product = calculatePrimeProduct(primeNumbers, sCurrentLine.toString());
				if(dictionary.containsKey(product))
				{
					dictionary.get(product).add(sCurrentLine);
				}
				else
				{
					ArrayList<String> wordList = new ArrayList<String>();
					wordList.add(sCurrentLine);
					dictionary.put(product, wordList);
				}
				}
                //arr.add(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
        return dictionary;
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
}