package kadai_018;

public abstract class Kato_Chapter18 {

	 String familyName = "加藤";
     String givenName;
     String address = "東京都中野区〇×";

	
    // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    // 抽象メソッド（子クラスで実装）
    public abstract void eachIntroduce();
    
    public abstract void setGivenName();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
