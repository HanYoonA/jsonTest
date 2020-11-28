package jsonTest2;

public class jsonMain {

	public static void main(String[] args) {
		//JSON ÆÄ½Ì¿¹Á¦!
		String arg = args[0];
		
		if(arg.equals("jsonNet")) {
			jsonNet.TestNet();
		}else if(arg.equals("jsonNet2")){
			jsonNet2.TestNet2();
		}else if(arg.equals("jsonNetArray")){
			jsonNetArray.TestNetArray();
		}else if(arg.equals("jsonNet3")){
			jsonNet3.TestNet3();
		}else if(arg.equals("jsonNetElastic")){
			jsonNetElastic.TestNetArray1();
		}

	}

}
