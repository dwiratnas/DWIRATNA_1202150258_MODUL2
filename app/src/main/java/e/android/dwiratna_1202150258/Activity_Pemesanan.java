package e.android.dwiratna_1202150258;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_Pemesanan extends AppCompatActivity {
    RadioGroup l_group; //buat variable radio group
    Button m_pesan; //buat variable button
    RadioButton l_button; //buat variable radio button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__pemesanan);

        l_group = findViewById(R.id.radioGroup);
        m_pesan = findViewById(R.id.btn_order );


        m_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Pemesanan.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void checkButton(View view) {
        int radioId = l_group.getCheckedRadioButtonId(); //cek radio button apa yang dipilih
        l_button = findViewById(radioId); //memilih apapun yang dipilih pada radio button

        Toast.makeText (Activity_Pemesanan.this, "Anda memilih pesanan untuk "+
                l_button.getText(), 1).show();

    }
}
