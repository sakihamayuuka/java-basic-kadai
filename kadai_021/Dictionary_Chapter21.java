package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21{
	private HashMap<String,String> dictionary;
	public Dictionary_Chapter21() {
		dictionary = new HashMap<String,String>();
		// key , value
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	public String findMeaning(String word) {
		// 検索する
		if(dictionary.containsKey(word)) {
			return word + "の意味は" + dictionary.get(word);
		} else {
			return word + "は辞書に存在しません";
		}
	}
	
		public void findMeaning(String[] wordsTofind) {
		for(String word : wordsTofind) {
			String meaning = findMeaning(word);
			System.out.println(meaning);
	}
		}
}
