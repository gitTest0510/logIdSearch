# logIdSearch
## 【練習用】ログ一覧とログメッセージIDを突合し使用状況を調査

<br>
プログラミングスキルが必要なのは言わずもがなですが

ぶっちゃけプログラミングしてる時間より悩んでる時間や色んな調査とかに使ってる時間の方が長かったりします。

ということで適当に自分が作ったファイルなので少々見づらいですがわりと実戦に近いであろう問題を用意したので暇な人は気分転換にでもやってみてください。<br><br>

対象者は初学者の方で目安としては30分～1時間で出来れば十分かと思います。(問題文を読んで問題を理解するのにも時間がかかると思うので)

では早速問題です。

>あなたはある開発現場のSEの一人だとします。
その現場では「ログ一覧」という設計書で使用しているログメッセージを管理しています。
アプリケーションを実際に動かした際に出てきた「log.txt」を見たところログ一覧で管理しているメッセージが全て出てきてるわけではなさそうな気がします。
そこで上司から「使ってないメッセージは「ログ一覧」から削除したいので使ってないログIDを洗い出しておいて！」と頼まれました。
はい！ではお願いしま～す！！！
・
・
・
・
・

<font color="Red">いやいや意味不明すぎるやろ！！</font>って思いました？
<br><br>
でも結構どのタスクもリアルにこんな感じで振られます。むしろこの問題でいえば上司の言葉の冒頭部分である【使ってないメッセージは「ログ一覧」から削除したい】といったタスクの本質、タスクを依頼された背景が分からないことはZARAなので実は優しい方です。

もう少し無駄話をしようと思うので興味がある人はお付き合いください。
<br><br>
<font color="Red">もうええわ！</font>って人は問題解くために必要なファイルはこのリポジトリにありますので、すっ飛ばしてちゃちゃっと片付けちゃってください。
<br><br>
それでは話を戻しますね。これは自分にも言えることですがどんなタスクに着手する時でも何を元に(input)して作業を進めればいいのかを考える癖をつけましょう。そして「inputはこれでいいですか？」って確認するのもどれだけ仕事ができるようになってからもやった方が良いと個人的には思います。お互いの認識に相違がないかの確認にもなりますし、間違ってればちゃんと教えてもらえるので無駄な時間を費やさずに済みますので。
<br><br>
ここまで読んでくれた方はきっと、

先ほどの問題を出された時に、いやいや意味不明すぎやろ！！って思った方が大半なのかなと思いますので

今回の問題を解くためのヒントを授けます。

僕は今の現場で2個目の現場なので絶対とは言い切れませんが観測範囲内では

どの現場でもログメッセージIDやメッセージID、メソッド名やクラス名等々

かなり細かく命名規則というものが定められているのがほとんどだと思います。名称付与基準とか違う名前の時もありますが一緒です。一応説明しておくと「名前を付けるときのルール(パターン)」のことで、まぁそのまんまですね。
<br><br>
この命名規則があることによって膨大なソースコードの中からお目当てのものを検索しやすくなったり管理がしやすくなったりします。

今回のログメッセージIDも命名規則に則ってIDを付与しています。つまりある一定のパターンが存在しているんです。
<br><br>
ということで以下を意識して解いてみてください。
```
・どの資料を基に作業を行えばいいのか。
・ログメッセージIDにはパターンがある。
※あとサクラエディタとExcelを使うとより現場チックになりますよ。
Macの方はサクラエディタをVSCodeとターミナル、Excelをスプレッドシートでも多分代用できると思います。
```
<br><br><br><br>

<details>
<summary> 解き方はいろいろあると思いますが手順書いてるので良かったらクリックして、見てみてね！</summary>
<br>
1 必要なファイルをclone<br>
・「log.txt」<br>
・「命名規則.xlsx」<br>
・「ログ一覧」<br>
<br>
2 サクラエディタで「log.txt」からログメッセージIDの行をgrep検索<br>
・命名規則を基に良い感じの正規表現でログメッセージIDが引っかかるように検索を行う<br>
例)<br>
.*LD\d{4}[IEWD]\d{2}<br>.*
<br>
3 サクラエディタで検索置換を使用しログメッセージIDの行からログメッセージIDのみを抽出
例) <br>
置換前 : (LD\d{4}[IEWD]\d{2})<br>
置換後 : $1<br>
<br>
4 EXCELで新しいBOOKを作成し抽出したログメッセージIDと「ログ一覧.xslx」VLOOKUP関数で突合
</details>
<br><br><br><br><br>

Main.javaをeclipseに貼り付ければ今回のなんちゃってログがログ一覧.xlsxに記載しているログメッセージIDがランダムで出るので慣れるまで何度か違うlog.txtを出力してやってみてもいいかもです。
