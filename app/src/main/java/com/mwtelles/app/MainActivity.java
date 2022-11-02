package com.mwtelles.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
                }
            }
        });

        pocoesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        feiticosLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bruxosLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}