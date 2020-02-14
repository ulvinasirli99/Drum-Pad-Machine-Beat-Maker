package devloper.game.drumpadtool;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;
    private ImageView imageView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.ivYan);
        context = this;
        sp = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 3);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 3);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 3);
        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 3);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 3);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 3);
        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 3);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 3);
        sound9 = sp.load(getApplicationContext(), R.raw.sound9, 3);
        sound10 = sp.load(getApplicationContext(), R.raw.sound10, 3);
        sound11 = sp.load(getApplicationContext(), R.raw.sound11, 3);
        sound12 = sp.load(getApplicationContext(), R.raw.sound12, 3);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YanGiris.class);
                startActivity(intent);
            }
        });

    }


    public void playSound_1(View view) {
        sp.play(sound1, 1.0f, 1.0f, 0, 1, 0f);
    }

    public void playSound_2(View view) {
        sp.play(sound2, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_3(View view) {
        sp.play(sound3, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_4(View view) {
        sp.play(sound4, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_5(View view) {
        sp.play(sound5, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_6(View view) {
        sp.play(sound6, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_7(View view) {
        sp.play(sound7, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_8(View view) {
        sp.play(sound8, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_9(View view) {
        sp.play(sound9, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_10(View view) {
        sp.play(sound10, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_11(View view) {
        sp.play(sound11, 1.0f, 1.0f, 0, 1, 0f);

    }

    public void playSound_12(View view) {
        sp.play(sound12, 1.0f, 1.0f, 0, 1, 0f);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
