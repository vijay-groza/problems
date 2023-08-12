package sample;

public class DuplicateNumbersArray {

	public static void main (String[]args) {
		int a []= {1,2,3,4,3,2,5,5,5,5};
		int len = a.length;
		System.out.println(len);
		
		for(int i = 0 ;i<len;i++) {
			for (int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
