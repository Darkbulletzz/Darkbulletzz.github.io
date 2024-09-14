public class DNA {
  
  public static void main(String[] args) {
    
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;  // You can change this to dna2 or dna3 for testing
    int length = dna.length();
    System.out.println("Length: " + length);
    
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

    // Check if both start and stop codons exist and if the sequence between them is a multiple of 3
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      System.out.println("Condition 1, 2, and 3 are satisfied.");
      
      // Extract and print the protein
      String protein = dna.substring(start, stop + 3); 
      System.out.println("Protein: " + protein);
      
    } else {
      // If any condition is not met, print "No protein"
      System.out.println("No protein.");
    }
  }
}
