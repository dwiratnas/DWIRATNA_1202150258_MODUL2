package e.android.dwiratna_1202150258;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner_k; //varible spinner
    ArrayAdapter adapter; //array adapter dari string array
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_k = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_k.setAdapter(adapter);

        spinner_k.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int b, long a) {
        String text = adapterView.getItemAtPosition(b).toString();
        Toast.makeText(adapterView.getContext(), "You selected " + text,1).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void pesan(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_menu.class );
        startActivity(intent);
    }
}
