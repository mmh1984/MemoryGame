package memory.android.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView p1, p2;
    ImageView iv11, iv12, iv13, iv14, iv15, iv16, iv17, iv18,iv19;
    Integer[] cardsArray = {101, 102, 103, 104, 201, 202, 203, 204};
    int image11, image12, image13, image14, image15, image16, image17,image18,imageblank;
    int firstcard, secondcard, clickedfirst, clickedsecond;
    int cardnumber = 1;
    int turn = 1;
    int playerpoint = 0;
    int cpupoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.tvp1);
        p2 = findViewById(R.id.tvp2);
        iv11 = findViewById(R.id.iv11);
        iv12 = findViewById(R.id.iv12);
        iv13 = findViewById(R.id.iv13);
        iv14 = findViewById(R.id.iv14);
        iv15 = findViewById(R.id.iv15);
        iv16 = findViewById(R.id.iv16);
        iv17 = findViewById(R.id.iv17);
        iv18 = findViewById(R.id.iv18);
        iv19=findViewById(R.id.iv19);
        iv19.setVisibility(View.INVISIBLE);


        iv11.setTag("0");
        iv12.setTag("1");
        iv13.setTag("2");
        iv14.setTag("3");
        iv15.setTag("4");
        iv16.setTag("5");
        iv17.setTag("6");
        iv18.setTag("7");


        frontOfCardResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        p2.setTextColor(Color.GRAY);


        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv11, theCard);



            }
        });

        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv12, theCard);


            }
        });

        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv13, theCard);

            }
        });

        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv14, theCard);

            }
        });

        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv15, theCard);

            }
        });

        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv16, theCard);

            }
        });

        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv17, theCard);

            }
        });

        iv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv18, theCard);

            }
        });


    }

    private void doStuff(ImageView iv, int card) {
        if (cardsArray[card] == 101) {
            iv.setImageResource(image11);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(image12);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(image13);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(image14);

        } else if (cardsArray[card] == 201) {
            iv.setImageResource(image11);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(image12);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(image13);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(image14);
        }

        if (cardnumber == 1) {
            firstcard = cardsArray[card];
            if (firstcard > 200) {
                firstcard = firstcard - 100;

            }
            cardnumber = 2;
            clickedfirst = card;
            iv.setEnabled(false);

        } else if (cardnumber == 2) {
            secondcard = cardsArray[card];
            if (secondcard > 200) {
                secondcard = secondcard - 100;

            }
            cardnumber = 1;
            clickedsecond = card;
            iv11.setEnabled(false);
            iv12.setEnabled(false);
            iv13.setEnabled(false);
            iv14.setEnabled(false);
            iv15.setEnabled(false);
            iv16.setEnabled(false);
            iv17.setEnabled(false);
            iv18.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        if (firstcard == secondcard) {
            if (clickedfirst == 0) {
                iv11.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 1) {
                iv12.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 2) {
                iv13.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 3) {
                iv14.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 4) {
                iv15.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 5) {
                iv16.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 6) {
                iv17.setVisibility(View.INVISIBLE);
            } else if (clickedfirst == 7) {
                iv18.setVisibility(View.INVISIBLE);
            }

            //
            if (clickedsecond == 0) {
                iv11.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 1) {
                iv12.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 2) {
                iv13.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 3) {
                iv14.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 4) {
                iv15.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 5) {
                iv16.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 6) {
                iv17.setVisibility(View.INVISIBLE);
            } else if (clickedsecond == 7) {
                iv18.setVisibility(View.INVISIBLE);
            }

            if (turn == 1) {
                playerpoint++;
                p1.setText("P1:" + playerpoint);
            } else if (turn == 2) {
                cpupoints++;
                p2.setText("P2:" + cpupoints);
            }
        } else {
            iv11.setImageResource(R.drawable.image);
            iv12.setImageResource(R.drawable.image);
            iv13.setImageResource(R.drawable.image);
            iv14.setImageResource(R.drawable.image);
            iv15.setImageResource(R.drawable.image);
            iv16.setImageResource(R.drawable.image);
            iv17.setImageResource(R.drawable.image);
            iv18.setImageResource(R.drawable.image);


            if (turn == 1) {
                turn = 2;
                p1.setTextColor(Color.GRAY);
                p2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                p1.setTextColor(Color.BLACK);
                p2.setTextColor(Color.GRAY);
            }

        }

        iv11.setEnabled(true);
        iv12.setEnabled(true);
        iv13.setEnabled(true);
        iv14.setEnabled(true);
        iv15.setEnabled(true);
        iv16.setEnabled(true);
        iv17.setEnabled(true);
        iv18.setEnabled(true);


        checkend();

    }

    private void checkend(){
        if(iv11.getVisibility()== View.INVISIBLE &&
                iv12.getVisibility()== View.INVISIBLE &&
                iv13.getVisibility()== View.INVISIBLE &&
                iv14.getVisibility()== View.INVISIBLE &&
                iv15.getVisibility()== View.INVISIBLE &&
                iv16.getVisibility()== View.INVISIBLE &&
                iv17.getVisibility()== View.INVISIBLE &&
                iv18.getVisibility()== View.INVISIBLE
             ){
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Game Over: \n P1:" + playerpoint + "\nP2:" + cpupoints);
            builder.setCancelable(false);
            builder.setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
            });
            builder.setNegativeButton("Exit Game", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getApplicationContext(),Welcome.class));
                    finish();
                }
            });

            AlertDialog alertDialog=builder.create();
            alertDialog.show();

        }

    }

    private void frontOfCardResources() {
        image11 = R.drawable.cap01;
        image12 = R.drawable.thor01;
        image13 = R.drawable.widow01;
        image14 = R.drawable.hulk01;
        image15 = R.drawable.hawk01;
        image16 = R.drawable.iron01;
        image17 = R.drawable.cap01;
        image18 = R.drawable.thor02;



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(),Welcome.class));
        finish();

    }
}
