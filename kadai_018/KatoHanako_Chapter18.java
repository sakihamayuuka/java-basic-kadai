package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public KatoHanako_Chapter18() {
        super("花子");  // 親クラスのコンストラクタを呼び出してgivenNameをセット
    }

    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
