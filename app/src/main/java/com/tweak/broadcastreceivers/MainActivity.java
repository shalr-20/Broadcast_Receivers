package com.tweak.broadcastreceivers;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView bg;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bg=findViewById(R.id.imageView);
        tv=findViewById(R.id.textView);

        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();

        if(Intent.ACTION_SEND.equals(action) && type !=null){
            // bg.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM)); //URI brings the image from the storage (to receive image data-> EXTRA_STREAM, and textual data-> EXTRA_TEXT)

            Uri img=intent.getParcelableExtra(Intent.EXTRA_STREAM);
            if(img!=null){
                displayImage(img);
            }
        }

    }

    private void displayImage(Uri img){
        tv.setVisibility(TextView.GONE);
        bg.setVisibility(ImageView.VISIBLE);
        bg.setImageURI(img);
    }
}