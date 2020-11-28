package jsonTest2;

import org.json.JSONObject;

public class jsonNet3 {
	public static void TestNet3() {
		
		String jsonString ="{\r\n" + 
				"  \"age\": \"20\",\r\n" + 
				"  \"name\": \"jjy\",\r\n" + 
				"  \"student2\": {\r\n" + 
				"    \"age\": 21,\r\n" + 
				"    \"name\": \"galid\"\r\n" + 
				"  }\r\n" + 
				"}";
		
		JSONObject joObject = new JSONObject(jsonString);
		System.out.println(joObject.getString("age"));
		System.out.println(joObject.getString("name"));	
		
		JSONObject jObject2= joObject.getJSONObject("student2");
		System.out.println(jObject2.getInt("age"));
		System.out.println(jObject2.getString("name"));
		
	}
}
