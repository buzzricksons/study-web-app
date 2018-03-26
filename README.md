# 概要
## テスト用の簡単なウェブアプリケーション
利用したフレームワークおよび言語
- Java 8
- Spring Boot
- MyBatis
- Maven
- Flyway(DBマイグレーション)

## DB
- H2(in memory)

## 設定
`src/main/resources/application.yml`ファイルを修正
- port番号(default: 11080)
- db(default: H2 in memory DB)

# 実行手順
## ビルド
```
$ mvn clean install
```

## 実行
ビルドされた成果物を実行する
```
$ java -jar study-web-app-0.1-SNAPSHOT.jar
```

# 仕様
`http://127.0.0.1:11080/`に接続すると`Hello!`という文字列が出力される

---
Created by HyungCheol Kim