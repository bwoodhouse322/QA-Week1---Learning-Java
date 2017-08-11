
public class Strings2 {

	public static void main(String[] args) {
		String word1 = "cabbages";
		String word2 = "gardens1234";
		String longWord;
		String shortWord;
		if(word1.length()>word2.length()){
			longWord = word1;
			shortWord = word2;
		}else{
			longWord= word2;
			shortWord = word1;
		}
		char[] charArr1 = longWord.toCharArray();
		char[] charArr2 = shortWord.toCharArray();

		for (int i = 0; i < shortWord.length(); i++) {
			if (charArr1[i] != charArr2[i]) {
				charArr1[i]=charArr2[i];
			}
		}

		if(word1.length()>word2.length()){
			String s1 = new String(charArr1);
			String s2 = new String(charArr1);
			System.out.println(s1 + s2);
		}else{
			String s1 = new String(charArr2);
			String s2 = new String(charArr2);
			System.out.println(s1 + s2);
		}
		
		
		
		
		
	}
}
