package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // ① 辞書クラスのインスタンスを作成する
        Dictionary_Chapter21 dictionaryObj = new Dictionary_Chapter21();

        // ② 調べる英単語を配列にセットする
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

        // ③ 辞書を調べるメソッドを引数指定で呼び出す
        dictionaryObj.search(wordsToSearch);
    }
}