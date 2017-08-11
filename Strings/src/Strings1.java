import java.util.ArrayList;

public class Strings1 {

	public static void main(String[] args) {
		String word1 = "hello2143";
		String word2 = "hiasdffhelloasdfworld!";
		ArrayList<String> words = new ArrayList<>();

		for (int j = 0; j < word1.length() + 1; j++) {
			String sub1 = word1.substring(0, j);
			int length = sub1.length();

			for (int i = 0; i < word2.length(); i++) {
				try {
					String sub2 = word2.substring(i, i + length);

					if (sub1.equalsIgnoreCase(sub2)) {
						words.add(word1.substring(0, j));

					}
				} catch (Exception ex) {

				} finally {

				}

			}
		}
		
			int max=0;
			for(int i= 0; i< words.size(); i++){
				if(words.get(i).length() > max){
					max = words.get(i).length();
				}
			}
			for(int i=0; i<words.size();i++){
				if(max == words.get(i).length()){
					System.out.println("Longest substring is "+ words.get(i));
				}
			}
		
	}

}
