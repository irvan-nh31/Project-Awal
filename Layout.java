package akakom.nomhs.kotlin.a185411143firmansyahirvan;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Layout extends AppCompatActivity {

    TextView nama,jabatan,nip,status,jk;
    String getnip, getnama, getjabatan, getjk, getstatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        nip = (TextView) findViewById(R.id.nip);
        nama = (TextView) findViewById(R.id.nama);
        jabatan = (TextView) findViewById(R.id.jabatan);
        status = (TextView) findViewById(R.id.statuss);
        jk = (TextView) findViewById(R.id.jkk);

        Bundle b = getIntent().getExtras();
        getnip = b.getString("parse_nip");
        getnama = b.getString("parse_nama");
        getjabatan = b.getString("parse_jabatan");
        getjk = b.getString("parse_jk");
        getstatus = b.getString("parse_status");

        nip.setText("NIP    :  "+getnip);
        nama.setText("NAMA  :  "+getnama);
        jabatan.setText("JABATAN    :  "+getjabatan);
        jk.setText("JENIS KELAMIN    :  "+getjk);
        status.setText("STATUS    :  "+getstatus);

    }
}