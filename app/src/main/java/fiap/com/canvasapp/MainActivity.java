package fiap.com.canvasapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img_face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_face = (ImageView) findViewById(R.id.img_face);
    }

    public void drawSimple() {
        Bitmap bmp = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        // Bitmap.Config.ARGB_8888 16 colors by pixel

        Canvas c = new Canvas(bmp);
        Paint p = new Paint();
        p.setColor(Color.YELLOW);

        Paint p2 = new Paint();
        p2.setColor(Color.BLUE);

        c.drawCircle(100, 100, 60, p);
        c.drawLine(80, 140, 120, 140, p2);

        c.drawCircle(80,80,10, p);
        c.drawCircle(120,80,10, p2);

        img_face.setImageBitmap(bmp);
    }
}
