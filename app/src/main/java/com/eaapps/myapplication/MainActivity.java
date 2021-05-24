package com.eaapps.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Integer> drawables = Arrays.asList(R.drawable.ic_box_label, R.drawable.ic_hand_package,
            R.drawable.ic_packages_checkmark, R.drawable.ic_delivery_truck);

    private List<Integer> progress = Arrays.asList(9, 21, 35, 41);

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.next);
        ImageView img1 = findViewById(R.id.image1);
        ImageView img2 = findViewById(R.id.image2);
        ImageView img3 = findViewById(R.id.image3);
        ImageView img4 = findViewById(R.id.image4);
        ImageView line = findViewById(R.id.line);


        ProgressBar progressBar = findViewById(R.id.progress);

        img1.setImageResource(drawables.get(position));
        img1.setBackgroundResource(R.drawable.circle_openn);
        progressBar.setProgress(progress.get(position));
        setSize(img1, getSizeToDp(55), getSizeToDp(55));


        btn.setOnClickListener(v -> {
            position++;
            switch (position) {
                case 1:
                    img1.setImageResource(R.drawable.circle_dot);
                    img1.setBackgroundResource(R.drawable.circle_dot);
                    progressBar.setProgress(progress.get(position - 1));
                    setSize(img1, getSizeToDp(35), getSizeToDp(35));

                    img2.setImageResource(drawables.get(position));
                    img2.setBackgroundResource(R.drawable.circle_openn);
                    progressBar.setProgress(progress.get(position));
                    setSize(img2, getSizeToDp(55), getSizeToDp(55));


                    break;
                case 2:
                    img2.setImageResource(R.drawable.circle_dot);
                    img2.setBackgroundResource(R.drawable.circle_dot);
                    progressBar.setProgress(progress.get(position - 1));
                    setSize(img2, getSizeToDp(35), getSizeToDp(35));

                    img3.setImageResource(drawables.get(position));
                    img3.setBackgroundResource(R.drawable.circle_openn);
                    progressBar.setProgress(progress.get(position));
                    setSize(img3, getSizeToDp(55), getSizeToDp(55));

                    break;
                case 3:
                    img3.setImageResource(R.drawable.circle_dot);
                    img3.setBackgroundResource(R.drawable.circle_dot);
                    progressBar.setProgress(progress.get(position - 1));
                    setSize(img3, getSizeToDp(35), getSizeToDp(35));

                    img4.setImageResource(drawables.get(position));
                    img4.setBackgroundResource(R.drawable.circle_openn);
                    progressBar.setProgress(progress.get(position));
                    setSize(img4, getSizeToDp(55), getSizeToDp(55));
                    line.setVisibility(View.GONE);
                    position = 0;
                    break;
                default:
                    img1.setImageResource(drawables.get(position));
                    img1.setBackgroundResource(R.drawable.circle_openn);
                    progressBar.setProgress(progress.get(position));


                    break;
            }
        });


    }


    private void setSize(ImageView imageView, int width, int height) {
        imageView.getLayoutParams().height = height;
        imageView.getLayoutParams().width = width;
        imageView.requestLayout();

//        ConstraintLayout.LayoutParams parms = new ConstraintLayout.LayoutParams(width, height);
//        imageView.setLayoutParams(parms);
    }

    private int getSizeToDp(int size) {
        return size * 3;
    }
}