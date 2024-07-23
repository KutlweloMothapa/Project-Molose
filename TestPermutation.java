public class TestPermutation {
// Existing methods

// Tests the Permutation class by creating an instance of the recursive function and calling its methods
  public static void main(String[] args) {
    System.out.println("Permutations of ABC:"); //Header for the permutations of ABC
    System.out.println("___________________________________");
    Permutation permutation = new Permutation();
//The permute method is called to generate all possible permutations of ABC
    permutation.permute("ABC", 0, 2);
    System.out.println("___________________________________");
  }
}
