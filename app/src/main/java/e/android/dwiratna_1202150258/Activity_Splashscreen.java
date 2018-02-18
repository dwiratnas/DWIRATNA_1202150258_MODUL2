package e.android.dwiratna_1202150258;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity_Splashscreen extends AppCompatActivity {
    private static int SPLASH = 3000; //deklarasi waktu splash 3 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__splashscreen);

        new Handler().postDelayed(new Runnable() { //Handler Splash Screen
            @Override
            public void run() {
                Intent intent = new Intent(Activity_Splashscreen.this, Activity_Pemesanan.class); //splash
                startActivity(intent); //start splash screen
                finish(); //close splash activity
            }
        }, SPLASH); //waktu splash screen

        Toast.makeText(this, "DWI RATNA SARI_12O2150258", 1).show(); //munculkan toast
    }
}
