package sample;
public class DupStringInArray{
	
	public static void main(String[]args) {
	String fruits[]= {"mango","apple","banana","mango"};
	int len=fruits.length;
	for(int i =0;i<len;i++) {
		for (int j=i+1;j<len;j++) {
			if (fruits[i]==fruits[j]) {
				System.out.println("dupe "+fruits[j]);
				
			}
		}
	}
	}
}
