package jsonTest2;

import org.json.JSONObject;

public class jsonNet {

	public static void TestNet() {
		String jsonString = "{  \r\n" + 
				"  'title': 'PROTEN',  \r\n" + 
				"  'url': 'http://m.proten.co.kr/',  \r\n" + 
				"  'draft': true,  \r\n" + 
				"  'star': 10  \r\n" + 
				"}";
		
		JSONObject jObject = new JSONObject(jsonString);
		String title =jObject.getString("title");
		String url =jObject.getString("url");
		Boolean draft =jObject.getBoolean("draft");
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(draft);
		
	}

}
