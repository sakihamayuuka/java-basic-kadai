package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    public KatoTaro_Chapter18() {
        super("太郎");  // 親クラスのコンストラクタを呼び出してgivenNameをセット
    }

    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}