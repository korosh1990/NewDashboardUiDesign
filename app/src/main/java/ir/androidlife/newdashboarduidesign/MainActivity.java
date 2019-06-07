package ir.androidlife.newdashboarduidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll1, ll2, ll3, ll4, ll5, ll6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/irsans.ttf");

        ll1 = findViewById(R.id.linearLayout1);
        ll2 = findViewById(R.id.linearLayout2);
        ll3 = findViewById(R.id.linearLayout3);
        ll4 = findViewById(R.id.linearLayout4);
        ll5 = findViewById(R.id.linearLayout5);
        ll6 = findViewById(R.id.linearLayout6);

        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "حساب کاربری فعلا وجود ندارد", Toast.LENGTH_SHORT).show();
            }
        });

        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "لینک های دانلود غیرفعال است", Toast.LENGTH_SHORT).show();
            }
        });

        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "شما در صفحه اصلی هستید!", Toast.LENGTH_SHORT).show();
            }
        });

        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "برای تماشای فیلم باید عضو ویژه باشید", Toast.LENGTH_SHORT).show();
            }
        });

        ll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "شما هیچ دوستی ندارید!", Toast.LENGTH_SHORT).show();
            }
        });

        ll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "مدیریت دانلود ها غیرفعال است", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
