package memory.android.memorygame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {
Button btnstart,btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        final Animation intro,slide;
        ImageView logo=findViewById(R.id.ivLogo);

       intro= AnimationUtils.loadAnimation(this,R.anim.bounce);
       slide=AnimationUtils.loadAnimation(this,R.anim.slidein);
       logo.startAnimation(intro);

       btnstart=findViewById(R.id.btnstartgame);
       btnabout=findViewById(R.id.btnabout);
       btnstart.setVisibility(View.INVISIBLE);
       btnabout.setVisibility(View.INVISIBLE);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            btnstart.setVisibility(View.VISIBLE);
            btnabout.setVisibility(View.VISIBLE);
            btnstart.startAnimation(slide);
            btnabout.startAnimation(slide);
            }
        }, 2000);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });

        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),About.class));
                finish();
            }
        });
    }
}
