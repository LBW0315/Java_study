package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	KatoTaro_Chapter17(){
		
	}
	
	public void setGivenName() {
		this.givenName = "太郎";
	}

	
	public void eachIntroduce(){
		System.out.println("私はJavaが得意です");
		
	}
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
