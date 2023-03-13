package security.configuration;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.AttributeConverter;

@Configuration
public class EdificioSecretConverter implements AttributeConverter<String, String> {
	
	Character[] arrOutput = {'*', '+', '£', '$', '%', '&', '?', '='};
	char[] arrInput = new char[8];

	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		String result = "";
		if(attribute == null) {
			return result;
		}
		for (int i=0; i<attribute.length(); i++) {
			arrInput[i] = attribute.toCharArray()[i];
			result += arrOutput[arrOutput.length - 1 - i];
		}
		
		return result;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		
		String result = "";
		if(dbData == null) {
			return result;
		}
		
		for (int i=0; i<dbData.length(); i++) {
//			arrInput[i] = attribute.toCharArray()[i];
			result += arrInput[i];
		}
		
//		for (char c : dbData.toCharArray()) {
//			for (int i=0; i<arr.length; i++) {
//				if(arr[i].equals(c)) {
//					result += i;
//				}
//			}
//		}
		
		return result;
	}

}
