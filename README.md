Scrabble
========
1. Obtain input in the form of seven alphabets
2. Create Tile Class using alphabet and associated score
3. Read text file and create dictionary, calculating unique prime prime product for each word(anagrams will have same prime score) along the way (eliminate words longer than 7 letters). Dictionary is a hash map with key as prime product and value as Arraylist of all anagrams words with that product.
4. create a power set (unique sets of characters; NO PERMUTATIONS REQUIRED)
5. Generate the unique score (using the associated prime number with each letter ) for each of the sets obtained above
6. Match with the dictionary obtained in step 3 to obtain all the valid words that can be formed.
7. for each valid word, calculate the score of the word using the scrabble score of each letter.
8. sort the hash map containing valid words and their scores.
9. return max scoring word(s).
