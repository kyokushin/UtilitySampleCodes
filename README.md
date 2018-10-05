# はじめに

このAndroidアプリはAndroidアプリ作成でよく困る内容をまとめるために作りました。

# 目次

1. アスペクト比を固定したImaveViewが欲しい
2. **[予告]** 角丸のImaveViewが欲しい

# 1. アスペクト比を固定したImaveViewが欲しい

対象パッケージ名
**com.yutasuz.utilitysamplecodes.fixaspectratio**

よくある内容ですが、ImageViewだけでは実現できなく、
Androidの初期からかかわっている人でも
毎回嫌な思いをしている内容だと思います。
ふと思い立ってLayoutでアスペクト比を固定できないのかと思って
検索したのがきっかけでした。

[How to set fixed aspect ratio for a layout in Android](
https://stackoverflow.com/questions/12311346/how-to-set-fixed-aspect-ratio-for-a-layout-in-android)

SupportLibraryに追加されて久しいConstraintLayoutを使うことで実現できます。
またConstraintLayoutを使うことからもわかるように、ImageViewに限らず
どのようなViewにも適用できる汎用的で応用範囲の広い方法です。

# 2. **[予告]** 角丸のImaveViewが欲しい
次回は角丸のImageViewをImageViewを継承せずに作る方法を紹介します。
***注意:未実装のため変更する可能があります。***
