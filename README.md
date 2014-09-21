関西Scalaビギナーズ#4 Workshop with Kuchitama
----

このリポジトリは、[第４回 関西Scalaビギナーズ](http://connpass.com/event/8127/)で行った、初心者向けワークショップの補填資料です。

# 目的

* sbtプロジェクトを作成してScalaプログラムを体験してみる
* sbtの最低限の使い方を覚える

# お題

Scala関西ビギナーズ参加者のリストからランダムに1人を選んで出力する抽選プログラムを作成する

## Step0

とりあえずプロジェクトを作りましょう

* activatorで新規プロジェクトを作成する

[解説](https://github.com/Kuchitama/scalakb4_workshop/wiki/Step0)

## Step1

とりあえず、出力してみる

* 変数に名前のリストを持ち、ランダムに1件出力する　[コミット](https://github.com/Kuchitama/scalakb4_workshop/commit/d2a27892e58ea6267bae15f8325d4163a4aea9b8)

[サンプルコード](https://github.com/Kuchitama/scalakb4_workshop/releases/tag/step1)


## Step2

ライブラリを使ってみる

* Scala IO をsbtのlibraryDependencies に追加する　[コミット](https://github.com/Kuchitama/scalakb4_workshop/commit/5858ce23dcbdf67e5ede5ea55d9794263b59d347)
* Scala IO を使ってファイルから名前を読み込む　[コミット](https://github.com/Kuchitama/scalakb4_workshop/commit/173a1cfe291913b0d1e32f4d4b48e5d75b0f1cbe)

[サンプルコード](https://github.com/Kuchitama/scalakb4_workshop/releases/tag/step2)

## Step3

* 実行時オプションでファイルを指定するように変更
* ファイルが指定されなければ、コマンドラインから名前を入力

[サンプルコード](https://github.com/Kuchitama/scalakb4_workshop/releases/tag/step3)



