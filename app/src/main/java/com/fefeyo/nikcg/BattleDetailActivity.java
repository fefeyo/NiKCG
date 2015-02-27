package com.fefeyo.nikcg;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;


public class BattleDetailActivity extends ActionBarActivity{
    private ScrollView mainContainer;
    private LinearLayout turnOne, turnTwe, turnThree;
    private FrameLayout f1, f2, f3, f4, f5, f6;
    private TextView t1, t2, t3, t4, t5, t6;
    private BootstrapButton t1R, t1L, t2R, t2L, t3R, t3L;
    private ImageView yato1,yato2,yato3,yoto1,yoto2,yoto3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);



        mainContainer = (ScrollView) findViewById(R.id.mainContainer);
        turnOne = (LinearLayout) mainContainer.findViewById(R.id.oneTurn);
        t1R = (BootstrapButton) turnOne.findViewById(R.id.rightApprove);
        t1L = (BootstrapButton) turnOne.findViewById(R.id.leftApprove);
        yato1 = (ImageView)turnOne.findViewById(R.id.yato);
        yoto1 = (ImageView)turnOne.findViewById(R.id.yoto);
        f1 = (FrameLayout) turnOne.findViewById(R.id.speakRight);
        t1 = (TextView) f1.findViewById(R.id.talkRight);
        f2 = (FrameLayout) turnOne.findViewById(R.id.speakLeft);
        t2 = (TextView) f2.findViewById(R.id.talkLeft);
        turnTwe = (LinearLayout)mainContainer.findViewById(R.id.tweTurn);
        t2R = (BootstrapButton)turnTwe.findViewById(R.id.rightApprove);
        t2L = (BootstrapButton)turnTwe.findViewById(R.id.leftApprove);
        yato2 = (ImageView)turnTwe.findViewById(R.id.yato);
        yoto2 = (ImageView)turnTwe.findViewById(R.id.yoto);
        f3 = (FrameLayout)turnTwe.findViewById(R.id.speakRight);
        t3 = (TextView)f3.findViewById(R.id.talkRight);
        f4 = (FrameLayout)turnTwe.findViewById(R.id.speakLeft);
        t4 = (TextView)f4.findViewById(R.id.talkLeft);
        turnThree = (LinearLayout)mainContainer.findViewById(R.id.threeTurn);
        t3R = (BootstrapButton)turnThree.findViewById(R.id.rightApprove);
        t3L = (BootstrapButton)turnThree.findViewById(R.id.leftApprove);
        yato3 = (ImageView)turnThree.findViewById(R.id.yato);
        yoto3 = (ImageView)turnThree.findViewById(R.id.yoto);
        f5 = (FrameLayout)turnThree.findViewById(R.id.speakRight);
        t5 = (TextView)f5.findViewById(R.id.talkRight);
        f6 = (FrameLayout)turnThree.findViewById(R.id.speakLeft);
        t6 = (TextView)f6.findViewById(R.id.talkLeft);

        t1.setText("西川氏は全く反省がみられない。引き続き説明責任を求める。またこれ等の問題は首相の任命責任である。西川氏の説明責任にけじめをつけるのが大事だ");
        yato1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.yato));
        t2.setText("様々な要求があれば、議員として資料を出すなりの対応をとっていくことは当然だ");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.abe));
        t3.setText("人を集めて、会員制のパーティーする場合、政治団体として本来、規約に下村大臣の活動を支援すると届け出るべきではありませんか");
        yato1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.yato));
        t4.setText("地方の博友会から寄付を受けたり、パーティー券を購入してもらうことはありません。地方博友会は、各地域の有志の皆さんで運営をして頂いておりまして、私の事務所は一切タッチしておりません。");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.yato));
        t5.setText("憲政史上最悪の金まみれの内閣という汚名を残すことになる。また、安倍首相自ら政治とカネに対処する姿勢を示せなければ、首相を辞職する覚悟と決意を持つべきだ");
        yato1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.yato));
        t6.setText("私が任命した閣僚が交代する結果を招いたことについて、国民の皆様に大変申し訳ない。政治とカネの問題については要望があれば果たしていくのは当然だ");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.abe));




    }
}