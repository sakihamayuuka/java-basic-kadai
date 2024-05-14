package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;

    
    public Kato_Chapter18(String givenName) {
        this.familyName = "加藤";
        this.address = "東京都中野区〇×";
        this.givenName = givenName;
    }

    public void commonIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    
    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
