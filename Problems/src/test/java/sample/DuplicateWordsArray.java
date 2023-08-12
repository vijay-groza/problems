package sample;

public class DuplicateWordsArray {

	public static void main(String[] args) {
			String words []= {"sam","tom","jim","sam","tim","tom"};
			int len = words.length;
		
			
			for(int i=0; i<len;i++ ) {
				for (int j=i+1;j<len;j++) {
					if (words[i]==words[j]) {
						System.out.println("the duplicate words are: "+ words[j]);
				}
			}
		}
	}
}