
/**
 * LinearSearch class searches for a specific word using iterative and recursive methods.
 *                     the class inherits from  SearchAlgorithm class
 * @author Miriam Mnyuku 
 * @date August 5, 2017
 */
public class LinearSearch extends SearchAlgorithm
{

    /**
     * Constructor for objects of class LinearSearch
     * 
     * @param: none
     * @return: none
     * precondition: none
     * postcondition: creates a new LinearSearch object when called
     */

    public LinearSearch()
    {
    }

    /**
     * search() will search through the string array until it finds wordToFind
     * 
     * @param:  array of words and a target "wordToFind" 
     * @return:  number of times the target word is found   
     * precondition: an array of words
     * postcondition: an index where the specific word is located
     */
    public int search(String[] words, String wordToFind) throws ItemNotFoundException
    {
        int size = words.length;
        for(int i = 0; i < size; i++)
        {
            if(words[i].equals(wordToFind))
            {
                return i;
            }
            incrementCount();
        }
        throw new ItemNotFoundException();
    }

    /**
     * recSearch()searches recursively by calling linearSearch(), for a specific word in an array of words and return the index of its position in the array
     * 
     * @param: string array of words and a specific word to search for
     * @return: an integer showing number of times the target word is found 
     * precondition: an array of words
     * postcondition: 
     */
    public int recSearch(String[] words, String wordToFind) throws ItemNotFoundException
    {
        linearSearch(words, wordToFind, 0);
        throw new ItemNotFoundException();
    }

    /**
     * @overload linearSearch()
     * linearSearch()searches recursively for a specific word in an array of words and return the index of its position in the array
     * 
     * @param: string array of words and a specific word to search for
     * @return: an integer showing number of times the target word is found 
     * precondition: an array of words
     * postcondition: the number of times "wordToFind" is found
     */
    private static int linearSearch(String[] words, String wordToFind, int index) throws ItemNotFoundException
    {
        if(words.length == index)
        {
            throw new ItemNotFoundException();
        }
        else if(words[index].equals(wordToFind))
        {
            return index;
        }
        else 
        {
            index++;
            return linearSearch(words, wordToFind, index);
        }
    }
}
