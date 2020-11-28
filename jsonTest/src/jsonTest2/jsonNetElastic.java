package jsonTest2;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonNetElastic {
	public static void TestNetArray1() {
		String jsonString= "{\r\n" + 
				"  \"took\" : 4,\r\n" + 
				"  \"timed_out\" : false,\r\n" + 
				"  \"_shards\" : {\r\n" + 
				"    \"total\" : 1,\r\n" + 
				"    \"successful\" : 1,\r\n" + 
				"    \"skipped\" : 0,\r\n" + 
				"    \"failed\" : 0\r\n" + 
				"  },\r\n" + 
				"  \"hits\" : {\r\n" + 
				"    \"total\" : 1177,\r\n" + 
				"    \"max_score\" : null,\r\n" + 
				"    \"hits\" : [\r\n" + 
				"      {\r\n" + 
				"        \"_index\" : \"@prosearch_dic\",\r\n" + 
				"        \"_type\" : \"doc\",\r\n" + 
				"        \"_id\" : \"1178\",\r\n" + 
				"        \"_score\" : null,\r\n" + 
				"        \"_source\" : {\r\n" + 
				"          \"wordSep\" : \"0\",\r\n" + 
				"          \"modifyUser\" : \"promanager\",\r\n" + 
				"          \"modifyDate\" : 20200113000000000,\r\n" + 
				"          \"synonyms\" : \"ÀÌºÏ,e ºÏ\",\r\n" + 
				"          \"noindexYn\" : \"N\",\r\n" + 
				"          \"wordUnq\" : \"ebook\",\r\n" + 
				"          \"createUser\" : \"promanager\",\r\n" + 
				"          \"nosearchYn\" : \"N\",\r\n" + 
				"          \"lang\" : \"kr\",\r\n" + 
				"          \"dicNo\" : 1178,\r\n" + 
				"          \"word\" : \"ebook\",\r\n" + 
				"          \"createDate\" : 20200113000000000\r\n" + 
				"        },\r\n" + 
				"        \"sort\" : [\r\n" + 
				"          1178\r\n" + 
				"        ]\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"_index\" : \"@prosearch_dic\",\r\n" + 
				"        \"_type\" : \"doc\",\r\n" + 
				"        \"_id\" : \"1177\",\r\n" + 
				"        \"_score\" : null,\r\n" + 
				"        \"_source\" : {\r\n" + 
				"          \"wordSep\" : \"0\",\r\n" + 
				"          \"modifyUser\" : \"promanager\",\r\n" + 
				"          \"modifyDate\" : 20200113000000000,\r\n" + 
				"          \"synonyms\" : \"Å×ºí¸´,Å¸ºí¸´,Å¸ºí·¿,Å¸ºí·§,ÅÂºí¸´\",\r\n" + 
				"          \"noindexYn\" : \"N\",\r\n" + 
				"          \"wordUnq\" : \"tablet\",\r\n" + 
				"          \"createUser\" : \"promanager\",\r\n" + 
				"          \"nosearchYn\" : \"N\",\r\n" + 
				"          \"lang\" : \"kr\",\r\n" + 
				"          \"dicNo\" : 1177,\r\n" + 
				"          \"word\" : \"tablet\",\r\n" + 
				"          \"createDate\" : 20200113000000000\r\n" + 
				"        },\r\n" + 
				"        \"sort\" : [\r\n" + 
				"          1177\r\n" + 
				"        ]\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"_index\" : \"@prosearch_dic\",\r\n" + 
				"        \"_type\" : \"doc\",\r\n" + 
				"        \"_id\" : \"1176\",\r\n" + 
				"        \"_score\" : null,\r\n" + 
				"        \"_source\" : {\r\n" + 
				"          \"wordSep\" : \"0\",\r\n" + 
				"          \"modifyUser\" : \"promanager\",\r\n" + 
				"          \"modifyDate\" : 20200113000000000,\r\n" + 
				"          \"synonyms\" : \"ÄÁº£¾î,ÄÜº£ÀÌ¾î,ÄÜº£¾î,ÄÜº£¾Æ,ÄÁº£ÀÌ¾î\",\r\n" + 
				"          \"noindexYn\" : \"N\",\r\n" + 
				"          \"wordUnq\" : \"conveyor\",\r\n" + 
				"          \"createUser\" : \"promanager\",\r\n" + 
				"          \"nosearchYn\" : \"N\",\r\n" + 
				"          \"lang\" : \"kr\",\r\n" + 
				"          \"dicNo\" : 1176,\r\n" + 
				"          \"word\" : \"conveyor\",\r\n" + 
				"          \"createDate\" : 20200113000000000\r\n" + 
				"        },\r\n" + 
				"        \"sort\" : [\r\n" + 
				"          1176\r\n" + 
				"        ]\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"}";
		
		try {	
			JSONObject json = new JSONObject(jsonString); 
			System.out.println("jsonµð¹ö±ë==="+json);
			
			JSONObject jsonObject= json.getJSONObject("hits");
			System.out.println("hitsµð¹ö±ë==="+jsonObject);
			
			JSONArray jsonArray = jsonObject.getJSONArray("hits"); 
			System.out.println("hits_Arrayµð¹ö±ë==="+jsonArray);
		
			for(int i =0; i<jsonArray.length(); i++){
				JSONObject obj = jsonArray.getJSONObject(i);
				System.out.println("objµð¹ö±ë==="+ obj);				
				JSONObject obj2 =obj.getJSONObject("_source");
				System.out.println("obj2µð¹ö±ë==="+ obj2);
				
				
				String word = obj2.getString("word");
				String synonyms = obj2.getString("synonyms");
				String modifyUser = obj2.getString("modifyUser");
				int modifyDate = obj2.getInt("modifyDate");
				String noindexYn = obj2.getString("noindexYn");
			    
				System.out.println("wordµð¹ö±ë=="+word);
				System.out.println(modifyUser);
				System.out.println(synonyms);
				System.out.println(modifyDate);
				System.out.println(noindexYn);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
