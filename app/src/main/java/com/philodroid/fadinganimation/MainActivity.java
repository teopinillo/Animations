package com.philodroid.fadinganimation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    boolean bartIsVisible = true;
    int rot = 1;
    int movHorizontal = 1;
    int movVertical = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view) {
        ImageView ivBart = findViewById(R.id.ivBart);
        if (bartIsVisible) {
            ivBart.setImageResource(R.drawable.homer_simpson_2006);
        } else {
            ivBart.setImageResource(R.drawable.bart_simpson_200px);
        }
        bartIsVisible = !bartIsVisible;
    }

     public void moveVertical(View view) {
        ImageView imageView = findViewById(R.id.ivBart);
        switch (movVertical){
            case 1:
                Toast.makeText(this, "translationY(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationY(200).setDuration(2000);
                break;
            case 2:
                Toast.makeText(this, "translationY(-200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationY(-200).setDuration(2000);
                break;
            case 3:
                Toast.makeText(this, "translationXBy(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationXBy(200).setDuration(2000);
                break;
            case 4:
                Toast.makeText(this, "translationXBy(-200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationXBy(-200).setDuration(2000);
                break;
            case 5:
                Toast.makeText(this, "translationZ(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationZ(200).setDuration(2000);
                break;
            case 6:
                Toast.makeText(this, "translationZ(-200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationZ(-200).setDuration(2000);
                break;
            case 7:
                Toast.makeText(this, "translationZBy(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationZBy(200).setDuration(2000);
                break;
            case 8:
                Toast.makeText(this, "translationZBy(-200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationZBy(-200).setDuration(2000);
                break;
            case 9:
                Toast.makeText(this, "translationX(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationX(200).setDuration(2000);
                break;
            case 10:
                Toast.makeText(this, "translationXBy(200)", Toast.LENGTH_SHORT).show();
                imageView.animate().translationX(-200).setDuration(2000);
                movVertical=0;
                break;
        }
        movVertical++;
    }

    public void rotate(View view) {
        ImageView imageView = findViewById(R.id.ivBart);
        switch (rot) {
            case 1:
                imageView.animate().rotation(180).setDuration(3000);
                Toast.makeText(this, "rotation(180)", Toast.LENGTH_LONG).show();
                break;
            case 2:
                imageView.animate().rotationBy(180).setDuration(3000);
                Toast.makeText(this, "rotationBy(180)", Toast.LENGTH_LONG).show();
                break;
            case 3:
                imageView.animate().rotationX(180).setDuration(3000);
                Toast.makeText(this, "rotationX(180)", Toast.LENGTH_LONG).show();
                break;
            case 4:
                imageView.animate().rotationXBy(180).setDuration(3000);
                Toast.makeText(this, "rotationXBy(180)", Toast.LENGTH_LONG).show();
                break;
            case 5:
                imageView.animate().rotationY(180).setDuration(3000);
                Toast.makeText(this, "rotationY(180)", Toast.LENGTH_LONG).show();
                break;
            case 6:
                imageView.animate().rotationYBy(180).setDuration(3000);
                Toast.makeText(this, "rotationYBy(180)", Toast.LENGTH_LONG).show();
                rot = 0;
                break;
            default:
                rot = 0;
        }
        rot++;
    }

    public void fade(View view) {
        ImageView ivBart = findViewById(R.id.ivBart);
        if (ivBart.getAlpha() == 0) {
            ivBart.animate().alpha(1).setDuration(2000);
        } else {
            ivBart.animate().alpha(0).setDuration(2000);
        }
    }

    public void mix(View view){
        ImageView ivBart = findViewById(R.id.ivBart);
         ivBart.animate().rotation(720).alpha(0);
    }
}
