package encryptionDecryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionDecryption {

	//AES ---Advanced Encryption  Standered
		private static SecretKeySpec secretkey;
		private static byte [] key;
		
		//set key
		public static void setkey(String mykey) {
			try {
			key = mykey.getBytes("UTF-8");
			//SHA Stands for Secure Hashing Algorithm 
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key,16);
			secretkey = new SecretKeySpec(key,"AES"); 
			}
			catch (NoSuchAlgorithmException e) {}
			catch(UnsupportedEncodingException e) {}
		
		}

		//ENCRIPTON
		
		public static String encrypt(String strToEnc,String sec) {
			try {
				setkey(sec);
				Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
				cipher.init(Cipher.ENCRYPT_MODE,secretkey);
				return Base64.getEncoder().encodeToString(cipher.doFinal(strToEnc.getBytes("UTF-8")));
			}
			catch (Exception e) {
			
			}
		return null ;	
		}
			
		
		//DECRIPTION
		
		public static String decrypt(String strToDec,String sec) {
			try {
				setkey(sec);
				Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
				cipher.init(Cipher.DECRYPT_MODE,secretkey);
				return new String(cipher.doFinal(Base64.getDecoder().decode(strToDec)));
			}
			catch (Exception e) {
			
			}
		return null ;	
	}	
}
