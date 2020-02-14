package devloper.game.drumpadtool;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class giris_activity extends AppCompatActivity {
    ImageView ivGelis;
    Button btnSatarted;
    Context context;
    MediaPlayer music;
    Animation from_bottom, from_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_activity);
        music = MediaPlayer.create(this, R.raw.splash);
        music.start();
        final Intent intent = new Intent(giris_activity.this, MainActivity.class);
        ConstraintLayout constraintLayout = findViewById(R.id.List777);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1300);
        animationDrawable.setExitFadeDuration(1100);
        animationDrawable.start();
        ImageView ivGelis = findViewById(R.id.ivGelis);
        from_bottom = AnimationUtils.loadAnimation(this, R.anim.from_bottom);
        from_up = AnimationUtils.loadAnimation(this, R.anim.from_up);
        ivGelis.setAnimation(from_up);
        Button btnSatarted = findViewById(R.id.btnSatarted);
        btnSatarted.setAnimation(from_bottom);
        btnSatarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent giris = new Intent(giris_activity.this, MainActivity.class);
                startActivity(giris);
                music.stop();
            }
        });


    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(giris_activity.this);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                music.stop();
            }
        });
        builder.setMessage("Do you want to leave");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

}
