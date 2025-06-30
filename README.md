# シフト自動割り当てプログラム

## 概要
このプログラムは、複数のスタッフ（例: 田中、秋山など）に対してランダムに勤務時間帯（例: 8時～16時半、8時半～17時など）を割り当てるJavaアプリケーションです。  
シンプルなロジックで手軽にシフト案を自動生成できます。
勉強の一環で作りました。

## 使用技術
- Java

## サンプルコード
```java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] sift = {"田中", "秋山", "三浦", "坂口", "山田", "原口", "木村", "古口", "大田" };
        String[] taime = {"8時～16時半", "8時半～17時", "8時半～12時半" };

        Random rand = new Random();
        for (int i = 0; i < sift.length; i++) {
            int t = rand.nextInt(taime.length);
            System.out.println(sift[i] + taime[t]);
        }
    }
}
```

## 実行例
```
田中8時半～12時半
秋山8時～16時半
三浦8時半～17時
...
```

## 今後の実装機能
- 出勤曜日や日付に対応させる
- シフトの公平性を考慮した機能への発展

## ポートフォリオとしてのポイント
- ランダム割り当ての基礎的な機能をJavaで実装
- 配列操作や乱数生成、標準出力が可能

---

