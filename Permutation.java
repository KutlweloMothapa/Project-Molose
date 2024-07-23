public class Permutation {
// Method that generates the permutations of our default ABC string
    public void permute(String str, int x, int y) { //x: starting index, y:ending index
	//Base case
	//If the starting index of the recursive function is equal to its end index
	//a valid permutation is produced, so we print it
        if (x == y)
            System.out.println(str);
        else { 
	//For each character from starting index to ending index in the string
            for (int j = x; j <= y; j++) { //Swap the starting index character with the current index character
                str = swap(str, x, j); //Generate permutations for the remaining string recursively
                permute(str, x + 1, y);
                str = swap(str, x, j); // Backtrack by swapping characters to their original positions
            }
        }
    }

    //Method to swap two characters
    public String swap(String s, int j, int z) {
        char temp;
    //String to character conversion for temporary hold and easy character manipulation
        char[] charArray = s.toCharArray();
    //Swap characters at index j and index z
        temp = charArray[j];
        charArray[j] = charArray[z];
        charArray[z] = temp;
        return String.valueOf(charArray); // Revert the character as an array back to string and return it
    }

    //Main method to test permutation generation
    public static void main(String[] args) {
   	//Create the permutation class instance
        Permutation permutation = new Permutation();
	//The permute method is called to generate all possible permutations of ABC
        permutation.permute("ABC", 0, 2);
    }
}
