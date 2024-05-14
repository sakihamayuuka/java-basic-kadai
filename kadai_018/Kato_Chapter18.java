package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;

    // コンストラクタで姓と住所を初期化
    public Kato_Chapter18(String givenName) {
        this.familyName = "加藤";
        this.address = "東京都中野区〇×";
        this.givenName = givenName;
    }

    // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    // 抽象メソッド（子クラスで実装）
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
