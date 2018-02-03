package fr.paul.moment.activities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

import fr.paul.moment.R;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        String title = getIntent().getStringExtra("title");
        byte[] bytes = getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        TextView titleTextView = (TextView) findViewById(R.id.title);
        titleTextView.setText(title);

        PhotoView photoView = (PhotoView) findViewById(R.id.image);
        photoView.setImageBitmap(bitmap);
    }
}
