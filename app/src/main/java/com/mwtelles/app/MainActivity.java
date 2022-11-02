package com.mwtelles.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout casasLayout = findViewById(R.id.casasLayout);
        final LinearLayout pocoesLayout = findViewById(R.id.pocoesLayout);
        final LinearLayout feiticosLayout = findViewById(R.id.feiticosLayout);
        final LinearLayout bruxosLayout = findViewById(R.id.bruxosLayout);

        final ImageView casasImage = findViewById(R.id.casasImage);
        final ImageView pocoesImage = findViewById(R.id.pocoesImage);
        final ImageView feiticosImage = findViewById(R.id.feiticosImage);
        final ImageView bruxosImage = findViewById(R.id.bruxosImage);

        final TextView casasText = findViewById(R.id.casasText);
        final TextView pocoesText = findViewById(R.id.pocoesText);
        final TextView feiticosText = findViewById(R.id.feiticosText);
        final TextView bruxosText = findViewById(R.id.bruxosText);

        casasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTab != 1) {
                    pocoesText.setVisibility(View.GONE);
                    feiticosText.setVisibility(View.GONE);
                    bruxosText.setVisibility(View.GONE);

                    pocoesImage.setImageResource(R.drawable.pocoes_icon);
                    feiticosImage.setImageResource(R.drawable.feiticos_icon);
                    bruxosImage.setImageResource(R.drawable.bruxos_icon);

                    pocoesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    feiticosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    bruxosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    casasText.setVisibility(View.VISIBLE);
                    casasImage.setImageResource(R.drawable.casas_selected_icon);
                    casasLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    casasLayout.startAnimation(scaleAnimation);
                    selectedTab = 1;
                }
            }
        });

        pocoesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTab != 2) {
                    casasText.setVisibility(View.GONE);
                    feiticosText.setVisibility(View.GONE);
                    bruxosText.setVisibility(View.GONE);

                    casasImage.setImageResource(R.drawable.casas_icon);
                    feiticosImage.setImageResource(R.drawable.feiticos_icon);
                    bruxosImage.setImageResource(R.drawable.bruxos_icon);

                    casasLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    feiticosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    bruxosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    pocoesText.setVisibility(View.VISIBLE);
                    pocoesImage.setImageResource(R.drawable.pocoes_selected_icon);
                    pocoesLayout.setBackgroundResource(R.drawable.round_back_pocoes_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    pocoesLayout.startAnimation(scaleAnimation);
                    selectedTab = 2;
                }
            }
        });

        feiticosLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTab != 3) {
                    casasText.setVisibility(View.GONE);
                    pocoesText.setVisibility(View.GONE);
                    bruxosText.setVisibility(View.GONE);

                    casasImage.setImageResource(R.drawable.casas_icon);
                    pocoesImage.setImageResource(R.drawable.pocoes_icon);
                    bruxosImage.setImageResource(R.drawable.bruxos_icon);

                    casasLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    pocoesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    bruxosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    feiticosText.setVisibility(View.VISIBLE);
                    feiticosImage.setImageResource(R.drawable.feiticos_selected_icon);
                    feiticosLayout.setBackgroundResource(R.drawable.round_back_feiticos_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    feiticosLayout.startAnimation(scaleAnimation);
                    selectedTab = 3;
                }

            }
        });

        bruxosLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTab != 4) {
                    casasText.setVisibility(View.GONE);
                    pocoesText.setVisibility(View.GONE);
                    feiticosText.setVisibility(View.GONE);

                    casasImage.setImageResource(R.drawable.casas_icon);
                    pocoesImage.setImageResource(R.drawable.pocoes_icon);
                    feiticosImage.setImageResource(R.drawable.feiticos_icon);

                    casasLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    pocoesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    feiticosLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    bruxosText.setVisibility(View.VISIBLE);
                    bruxosImage.setImageResource(R.drawable.bruxos_selected_icon);
                    bruxosLayout.setBackgroundResource(R.drawable.round_back_bruxos_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f)
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    bruxosLayout.startAnimation(scaleAnimation);
                    selectedTab = 4;
                }

            }
        });
    }
}