package security.configuration;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.AttributeConverter;

@Configuration
public class UtenteSecretConverter implements AttributeConverter<String, String> {
	
	Character[] arr = {'!', '"', '£', '$', '%', '&', '?', '(', ')', '='};

	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		String result = "";
		if(attribute == null) {
			return result;
		}
		for (char c : attribute.toCharArray()) {
			String sc = c + "";
			int num = Integer.parseInt(sc);
			result += arr[num];
		}
		
		return result;

	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		
		String result = "";
		if(dbData == null) {
			return result;
		}
		for (char c : dbData.toCharArray()) {
			for (int i=0; i<arr.length; i++) {
				if(arr[i].equals(c)) {
					result += i;
				}
			}
		}
		
		return result;

	}

}
