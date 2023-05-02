import java.util.Arrays;

public class Exercise2 {
	
	static int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	static String concat(String phrase, int num) {
		return phrase + num;
	}
	
	static String[] newArray(String[] sentence, String phrase) {
		String[] modArray = new String[6];
		for(int i=0;i<=sentence.length/2;i++) {
			if (i==2) {
				modArray[i] = phrase;
				
			}else {
				modArray[i] = sentence[i];
		
			}
			modArray[modArray.length-1-i] = sentence[sentence.length-1-i];
		}
		return modArray;
	}

	public static void main(String[] args) {
		
		int prod = multiply(3,5);
		System.out.println(prod);
		
		String words = "Di, a, Da, ";
		String wordsConcat = concat(words, 4);
		System.out.println(wordsConcat);
		
		String[] words2 = {"DI", "A", "DA", "IN", "CON"};
		System.out.println(Arrays.toString(newArray(words2, "SU")));

	}

}
