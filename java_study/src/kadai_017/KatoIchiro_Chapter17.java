package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	KatoIchiro_Chapter17(){
		setGivenName();
		commonIntroduce();
		eachIntroduce();
	}
	
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	public void eachIntroduce(){
		System.out.println("好きな食べ物はリンゴです");
	}
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
