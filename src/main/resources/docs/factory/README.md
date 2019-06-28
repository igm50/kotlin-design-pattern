# Factoryパターン / Factory Methodパターン

## 概要

実行時の条件により異なるオブジェクトを利用したいとする。  
利用者はオブジェクト生成や前処理等の知識は持ちたくない。  
そこで、上記の知識を担当するクラスに押し込め、利用者はオブジェクトについて意識せず簡単に利用できるようにする手法。  

ここではFactory Methodパターンについて実装する。

## クラス図

![Factory Methodパターンのクラス図](images/Factory_Methodパターン.png)

## 実装例

`RedPencil`クラスと`BluePencil`クラスがあり、状況に応じてどちらを利用するか決定したい。  
鉛筆は黒鉛と粘土を混ぜ、木材で覆うことで作られるが、この工程は`Factory`インターフェースで行うこととする。  

## 実装したクラス図

![実装したクラス図](images/Pencil_Factory.png)

## 参考資料

[Java言語で学ぶデザインパターン入門](https://www.amazon.co.jp/%E5%A2%97%E8%A3%9C%E6%94%B9%E8%A8%82%E7%89%88Java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%87%E3%82%B6%E3%82%A4%E3%83%B3%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3%E5%85%A5%E9%96%80-%E7%B5%90%E5%9F%8E-%E6%B5%A9/dp/4797327030/ref=sr_1_1?ie=UTF8&qid=1448935369&sr=8-1&keywords=java%E8%A8%80%E8%AA%9E%E3%81%A7%E5%AD%A6%E3%81%B6%E3%83%87%E3%82%B6%E3%82%A4%E3%83%B3%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3)  
[サルでもわかる 逆引きデザインパターン](http://www.nulab.co.jp/designPatterns/designPatterns2/designPatterns2-2.html)
