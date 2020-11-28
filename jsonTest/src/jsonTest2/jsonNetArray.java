package jsonTest2;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonNetArray {
	public static void TestNetArray() {
		//배열 3개가 들어가잇는거임 
		String  jsonString= "{\r\n" + 
				"   \"posts\": [\r\n" + 
				"       {\r\n" + 
				"            \"title\": \"PROTEN_M\",\r\n" + 
				"            \"url\": \"http://m.proten.co.kr/\",\r\n" + 
				"            \"draft\": \"true\"\r\n" + 
				"       },\r\n" + 
				"       {\r\n" + 
				"            \"title\": \"PROTEN_PC\",\r\n" + 
				"            \"url\": \"http://www.proten.co.kr//\",\r\n" + 
				"            \"draft\": \"true\"\r\n" + 
				"       },\r\n" + 
				"       {\r\n" + 
				"           \"title\": \"롯데\",\r\n" + 
				"           \"url\": \"https://www.ldcc.co.kr/\",\r\n" + 
				"           \"draft\": \"true\"\r\n" + 
				"       }\r\n" + 
				"   ]\r\n" + 
				"}";
		
		JSONObject jObject = new JSONObject(jsonString);
		JSONArray jArray = jObject.getJSONArray("posts");
		
		System.out.println(jArray.toString());
		
		for(int i=0; i<jArray.length(); i++ ) {
			//System.out.println(jArray);
			
			JSONObject obj = jArray.getJSONObject(i);
			String title = obj.getString("title");
			String url = obj.getString("url");
			String draft = obj.getString("draft");	
			
			System.out.println(title);
			System.out.println(url);
			System.out.println(draft);
			System.out.println();
		}
		
	}

}
