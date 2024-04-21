/**
 *  @author [YOUR NAME GOES HERE]
 *  
 *  @description:  [provide a brief description of your program]
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieReview {
	public static void main(String args[]) {

		// variables for keeping track of the input file
		String line;
		int score;
		List<String> fileLines;

		// the movie review entered by the user
		String review = " ";
		
		Scanner keyboard = new Scanner(System.in);

		// open input file
		try {
			// Read each line into a list
			fileLines = Files.readAllLines(Paths.get("moviereviews.txt"));
		} catch(IOException e) {
			System.err.println("Unable to read moviereviews.txt file");
			return;
		}
		
		/**
		 * This logic reads through each input line and extracts each separate word.
		 */

		Iterator<String> itr = fileLines.iterator();

		Dictionary<String,WordEntry> dictionary = new HashDictionary<>();

		while (itr.hasNext()) {
			// get the next line in the movie reviews
			line = itr.next();
			
			// obtain the score
			score = Integer.parseInt(line.substring(0, 1));
			
			// remove the score from the review
			line = line.substring(2).trim();

			// now remove all non alphanumeric characters
			line = line.replaceAll("[^a-zA-Z]+", " ");

			// splits the line into each word
			String tokens[] = line.split(" ");
			
			/**
			 * At this point, score is the numeric value of the review
			 * tokens[0] is the first word in the review,
			 * tokens[1] is the second word, and so forth.
			 */

			/**
			 * Apply the algorithm whereby you construct the dictionary that maps
			 * each word to a WordEntry object. At this point, each WordEntry object
			 * contains the total score and number of appearances of each word.
			 */

			// TO-DO

		}

		System.out.println("Just read " + fileLines.size() + " reviews.");
		System.out.println("Dictionary size " + dictionary.size());



		// After movie reviews have been entered in the dictionary, prompt the user for a new movie review

		while (review.length() > 0) {
			System.out.println("Enter a review -- Press return to exit");
			review = keyboard.nextLine();

			// parse review
			review = review.replaceAll("[^a-zA-Z]+", " ");

			// split the tokens
			String tokens[] = review.split(" ");

			/**
			 * Now apply the algorithm that gets the average score for each of the
			 * keywords, and calculates an average score for the review.
			 */

			// TO-DO

			/**
			 * Now report the review based upon the idea that:
			 * 
			 * > 2 positive review
			 * 
			 * == 2 neutral review
			 * 
			 * < 2 negative review
			 */

			// TO-DO

		}
	}
}
