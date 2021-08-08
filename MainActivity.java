package akakom.nomhs.kotlin.a185411143firmansyahirvan;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView foto;
    TextView tnip, tnama, ttl, ttgl, tjk, tjabatan, tstatus, thasil, kt;
    EditText enip, enama, etempat, etgl;
    RadioGroup rg1;
    RadioButton jk;
    Button tmbl;
    Spinner s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foto = (ImageView) findViewById(R.id.Image1);
        tnip = (TextView) findViewById(R.id.nip);
        tnama = (TextView) findViewById(R.id.nama);


        tjk = (TextView) findViewById(R.id.jk);
        tjabatan = (TextView) findViewById(R.id.jabatan);
        tstatus = (TextView) findViewById(R.id.status);
        ttl = (TextView) findViewById(R.id.tempat);
        ttgl = (TextView) findViewById(R.id.tgl);
        thasil = (TextView) findViewById(R.id.hasil);
        enip = (EditText) findViewById(R.id.innip);
        enama = (EditText) findViewById(R.id.innama);
        etempat = (EditText) findViewById(R.id.intempat);
        etgl = (EditText) findViewById(R.id.intgl);
        rg1 = (RadioGroup) findViewById(R.id.rg);
        tmbl = (Button) findViewById(R.id.tombol);
        s1 = (Spinner) findViewById(R.id.sjabatan);
        s2 = (Spinner) findViewById(R.id.sstatus);
        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String inputnpm = String.valueOf(enip.getText().toString());
                String inputname = String.valueOf(enama.getText().toString());
                String inputtempat = String.valueOf(etempat.getText().toString());
                String inputtanggal = String.valueOf(etgl.getText().toString());
                String inputjabatan = String.valueOf(s1.getSelectedItem().toString());
                String inputstatus = String.valueOf(s2.getSelectedItem().toString());

                int pilihidjk = rg1.getCheckedRadioButtonId();
                jk = (RadioButton) findViewById(pilihidjk);
                Intent intent = new Intent( MainActivity.this, Layout.class);
                Bundle b = new Bundle();
                b.putString("parse_nip", inputnpm);
                b.putString("parse_nama", inputname);
                b.putString("parse_jabatan", inputjabatan);
                b.putString("parse_status", inputstatus);
                b.putString("parse_jk", jk.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}