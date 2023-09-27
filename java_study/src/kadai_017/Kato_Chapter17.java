package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName;
	public String givenName;
	public String address;
	
	public void commonIntroduce() {
		System.out.println("名前は加藤"+ this.givenName + "です");
		System.out.println("住所は東京都中野区〇×です");
		
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		
	}

}
