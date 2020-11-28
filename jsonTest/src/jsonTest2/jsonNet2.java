package jsonTest2;

import org.json.JSONObject;

public class jsonNet2 {
	public static void TestNet2() {
		String  jsonString="{\r\n" + 
				"   \"post1\": {\r\n" + 
				"       \"title\": \"PROTEN_M\",\r\n" + 
				"       \"url\": \"http://m.proten.co.kr/\",\r\n" + 
				"       \"draft\": \"true\"\r\n" + 
				"  },\r\n" + 
				"   \"post2\": {\r\n" + 
				"       \"title\": \"PROTEN_PC\",\r\n" + 
				"       \"url\": \"http://www.proten.co.kr//\",\r\n" + 
				"       \"draft\": \"true\"\r\n" + 
				"   }\r\n" + 
				"}"; 
		
		JSONObject jObject = new JSONObject(jsonString);
		JSONObject post1Object = jObject.getJSONObject("post1");
		
		System.out.println(post1Object.toString());
		
		String title = post1Object.getString("title");
		String url = post1Object.getString("url");
		String draft = post1Object.getString("draft");
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(draft);
		
		//post2Object 
		JSONObject post2Object = jObject.getJSONObject("post2");
		
        System.out.println(post2Object.toString());
		
		String title2 = post2Object.getString("title");
		String url2 = post2Object.getString("url");
		String draft2 = post2Object.getString("draft");
		
		System.out.println(title2);
		System.out.println(url2);
		System.out.println(draft2);		
	}

}
