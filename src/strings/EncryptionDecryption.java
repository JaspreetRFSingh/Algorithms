package strings;

import java.util.ArrayList;
import java.util.Iterator;

public class EncryptionDecryption {

	static String encrypt(String str){
        String temp = "";
        char[] strArray = str.toCharArray();
        ArrayList<Character> data = new ArrayList<>();
        for(int i=0; i<strArray.length; i++) {
        	char tempChar = strArray[i];
        	int count = 1;
        	data.add(strArray[i]);
        	if(tempChar != ' ') {
        		while(i<strArray.length-1 && strArray[i+1] == tempChar) {
        			count++;
        			i++;
        		}
        		data.add(Character.forDigit(count, 10));
        	}
        }
        Iterator<Character> iterator = data.iterator();
        while(iterator.hasNext()) {
        	temp += iterator.next();
        }
        return temp;
    }
    
	static String decrypt(String str){
        String temp = "";
        int strLen = str.length();
        if(Character.isAlphabetic(str.charAt(strLen-1))) {
        	return "Invalid String";
        }
        for(int i=0; i<str.length(); i++) {
        	char tempChar = str.charAt(i);
        	
        	if(tempChar!= ' ') {
        		if(Character.isDigit(tempChar)) {
        			int count = Character.getNumericValue(tempChar);
        			while(count-->1) {
        				temp += str.charAt(i-1);
        			}
        		}
        		else if(Character.isAlphabetic(tempChar)){
        			if(!Character.isDigit(str.charAt(i+1))) {
        				return "Invalid String";
        			}
        			temp+= tempChar;
        		}
        	}
        	else {
        		temp += tempChar;
        	}
        }
        return temp;
    }
	
	public static void main(String[] args) {

		String str = "5an appppppple laaaaaptooooooop";
		System.out.println(encrypt(str));
		String encryptedString = "a1n1 1a1p2l1e1 1l1a2p1t1o1p2";
		System.out.println(decrypt(encryptedString));

	}

}
