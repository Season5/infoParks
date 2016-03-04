package com.infoparks.wapi.infoparks;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        addListenerOnButton6();
        addListenerOnButton7();
        addListenerOnButton8();
    }

    public void addListenerOnButton1() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Nairobi.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton2() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Central.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton3() {

        final Context context = this;

        button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Eastern.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton4() {

        final Context context = this;

        button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NorthEastern.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton5() {

        final Context context = this;

        button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Coast.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton6() {

        final Context context = this;

        button = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, RiftValley.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton7() {

        final Context context = this;

        button = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Nyanza.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton8() {

        final Context context = this;

        button = (Button) findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Western.class);
                startActivity(intent);

            }

        });

    }
}
