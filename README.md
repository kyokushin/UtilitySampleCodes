# はじめに

このAndroidアプリはAndroidアプリ作成でよく困る内容をまとめるために作りました。

# 目次

1. アスペクト比を固定したImaveViewが欲しい
2. 角丸のImaveViewが欲しい

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
どのようなViewにも適用できる汎用的で応用範囲の広い方法のひとつです。

# 2. 角丸のImaveViewが欲しい

対象パッケージ名
**com.yutasuz.utilitysamplecodes.roundedrectview**

前回に続きよくある内容ですが、角丸のImageViewが欲しい時がよくあります。
これはSupportLibraryに追加されて久しいCardViewを使うことで実現できます。

[Make ImageView fit width of CardView
](https://stackoverflow.com/questions/27394300/make-imageview-fit-width-of-cardview)

CardViewというように名前にViewがついていますが実態はLayoutです。
ゆえに前回同様、ImageViewに限らずどのようなViewにも適用できる汎用的で
応用範囲の広い方法のひとつです。
たとえばMaps SDK for AndroidのMapViewをCardView内の要素とすることで
角丸の地図を表示することが可能です。
