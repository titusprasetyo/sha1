package xyz.titus.sha1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sha1Controller {
	
	@RequestMapping(method=RequestMethod.POST, value="/sha1/{text}")
	public String getSha1(@PathVariable(value="text") String text) {
		String sha1 = "";
		try {
			sha1 = sha1(text);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			sha1 = e.getMessage();
		}
		return sha1;
	}
	
	private String sha1(String input) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA1");
		byte[] result = mDigest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}

		return sb.toString();
	}
}
