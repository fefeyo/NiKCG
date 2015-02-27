package com.fefeyo.nikcg;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class BattleDetailActivity extends ActionBarActivity {

    private ScrollView mainContainer;

    private LinearLayout turnOne, turnTwe, turnThree;

    private FrameLayout f1, f2, f3, f4, f5, f6;

    private TextView t1, t2, t3, t4, t5, t6;

    private BootstrapButton t1R, t1L, t2R, t2L, t3R, t3L;

    private ImageView yato1, yato2, yato3, yoto1, yoto2, yoto3;

    private ProgressBar siki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);

        ActionBar ac = getSupportActionBar();
        ac.setDisplayShowTitleEnabled(false);
        ac.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ac.setCustomView(R.layout.sikibar);

        mainContainer = (ScrollView) findViewById(R.id.mainContainer);
        turnOne = (LinearLayout) mainContainer.findViewById(R.id.oneTurn);
        t1R = (BootstrapButton) turnOne.findViewById(R.id.rightApprove);
        t1L = (BootstrapButton) turnOne.findViewById(R.id.leftApprove);
        yato1 = (ImageView) turnOne.findViewById(R.id.yato);
        yoto1 = (ImageView) turnOne.findViewById(R.id.yoto);
        f1 = (FrameLayout) turnOne.findViewById(R.id.speakRight);
        t1 = (TextView) f1.findViewById(R.id.talkRight);
        f2 = (FrameLayout) turnOne.findViewById(R.id.speakLeft);
        t2 = (TextView) f2.findViewById(R.id.talkLeft);
        turnTwe = (LinearLayout) mainContainer.findViewById(R.id.tweTurn);
        t2R = (BootstrapButton) turnTwe.findViewById(R.id.rightApprove);
        t2L = (BootstrapButton) turnTwe.findViewById(R.id.leftApprove);
        yato2 = (ImageView) turnTwe.findViewById(R.id.yato);
        yoto2 = (ImageView) turnTwe.findViewById(R.id.yoto);
        f3 = (FrameLayout) turnTwe.findViewById(R.id.speakRight);
        t3 = (TextView) f3.findViewById(R.id.talkRight);
        f4 = (FrameLayout) turnTwe.findViewById(R.id.speakLeft);
        t4 = (TextView) f4.findViewById(R.id.talkLeft);
        turnThree = (LinearLayout) mainContainer.findViewById(R.id.threeTurn);
        t3R = (BootstrapButton) turnThree.findViewById(R.id.rightApprove);
        t3L = (BootstrapButton) turnThree.findViewById(R.id.leftApprove);
        yato3 = (ImageView) turnThree.findViewById(R.id.yato);
        yoto3 = (ImageView) turnThree.findViewById(R.id.yoto);
        f5 = (FrameLayout) turnThree.findViewById(R.id.speakRight);
        t5 = (TextView) f5.findViewById(R.id.talkRight);
        f6 = (FrameLayout) turnThree.findViewById(R.id.speakLeft);
        t6 = (TextView) f6.findViewById(R.id.talkLeft);

        t1.setText("この問題は首相の任命責任である。西川氏の説明責任にけじめをつけるのが大事だ");
        yato1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kouda));
        t2.setText("様々な要求があれば、議員として資料を出すなりの対応をとっていくことは当然だ");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.abe));
        t3.setText("会員制のパーティーする場合、規約に下村大臣の活動支援と届け出るべきではないか");
        yato1.setImageBitmap(
                BitmapFactory.decodeResource(getResources(), R.drawable.kashiwagi));
        t4.setText("地方博友会は、各地域の有志の皆さんで運営をして頂いており、私の事務所は関与しておりません。");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.simo));
        t5.setText("安倍首相自ら政治とカネに対処する姿勢を示せなければ、首相を辞職する覚悟と決意を持つべきだ");
        yato1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mabuti));
        t6.setText("このような結果を招いた事について、国民の皆様に大変申し訳ない。この問題については要望があれば果たしていくつもりだ");
        yoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.abe));

        siki = (ProgressBar) findViewById(R.id.siki);
        siki.setMax(100);
        siki.setProgress(50);

        t1R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() - 15);
                t1R.setEnabled(false);
                t1L.setEnabled(false);
            }
        });
        t1L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() + 15);
                t1R.setEnabled(false);
                t1L.setEnabled(false);
            }
        });
        t2R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() - 20);
                t2R.setEnabled(false);
                t2L.setEnabled(false);
            }
        });
        t2L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() + 20);
                t2R.setEnabled(false);
                t2L.setEnabled(false);
            }
        });
        t3R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() - 25);
                t3R.setEnabled(false);
                t3L.setEnabled(false);
            }
        });
        t3L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siki.setProgress(siki.getProgress() + 25);
                t3R.setEnabled(false);
                t3L.setEnabled(false);
            }
        });

    }
}