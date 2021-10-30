package Homework_1.problem1;

public class File {

	private String plainText;
	private int encryption_key;

	public File() {
		super();
	}

	public File(String plainText, int encryption_key) {
		super();
		this.plainText = plainText;
		this.encryption_key = encryption_key;
	}

	public void generateEncryptedText() {
		
		System.out.println(reversetext(getPlainText()));
		
		
		
		
		
		
		//System.out.println("Plain text        : " + mainString);
		//System.out.println("Encrypted text    : " + newString);
		System.out.println();

	}

	String reversetext(String plaintext) {
		
		char main_string[] = plainText.toCharArray();
		
		int len = plainText.length();
		
		char reverse[] = new char[len + 1];

		int j = 0;
		for (int i = plainText.length() - 1; i >= 0; i--) {
			reverse[j]=main_string[i];
			j++;

		}
		String reversetxt = new String(reverse);
		
		
		return reversetxt;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public int getEncryption_key() {
		return encryption_key;
	}

	public void setEncryption_key(int encryption_key) {
		this.encryption_key = encryption_key;
	}

	@Override
	public String toString() {
		return "File [plainText=" + plainText + ", encryption_key=" + encryption_key + "]";
	}

}
