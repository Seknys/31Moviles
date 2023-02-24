package com.example.a31new;




import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.graphics.Canvas;
import android.graphics.Bitmap;
public class MainActivity extends AppCompatActivity {
    Context context;
    Resources resources;
    RelativeLayout relativeLayout;
    Button button;
    Button button2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        resources = getResources();
        relativeLayout = findViewById(R.id.relativeLayout);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = Bitmap.createBitmap(10, 700, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.drawColor(Color.RED);
                Paint paint = new Paint();
                paint.setColor(Color.RED);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(8);
                paint.setAntiAlias(true);
                int offset = 50;
                canvas.drawLine(
                        offset, canvas.getHeight() / 2, canvas.getWidth() - offset, canvas.getHeight() / 2, paint);
                imageView.setImageBitmap(bitmap);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color;
                View contenedor = view.getRootView();
                color = Color.parseColor("#922B21");

                contenedor.setBackgroundColor(color);


            }
        });
    }
    class Lienzo extends View {

        public Lienzo(Context context){
            super (context);
        }

        protected void onDraw(Canvas canvas){
            canvas.drawRGB(255,255,0);
            int ancho = canvas.getWidth();
            Paint pincel1 = new Paint();
            pincel1.setARGB(255,255,0,0);
            canvas.drawLine(0,30,ancho,30,pincel1);
            pincel1.setStrokeWidth(4);
            canvas.drawLine(0,60,ancho,60,pincel1);

        }


    }
}