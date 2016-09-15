package id.sch.smktelkom_mlg.xirpl3012learn.formisiantiketka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNP,etSA,etST,etTK,etnoid;
    CheckBox cbB1, cbB2, cbB3;
    RadioButton rbSJ,rbPP;
    Spinner sP1, sP2, sBB;

    TextView tvHasil,tvNP,tvnoid,tvSA,tvST,tvTK,tvKelas,tvBB,tvPD,tvPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNP = (EditText) findViewById(R.id.editTextNP);
        etSA = (EditText) findViewById(R.id.editTextSA);
        etST = (EditText) findViewById(R.id.editTextST);
        etTK = (EditText) findViewById(R.id.editTextTK);
        etnoid = (EditText) findViewById(R.id.editTextnoid);

        cbB1 = (CheckBox) findViewById(R.id.checkBoxB1);
        cbB2 = (CheckBox) findViewById(R.id.checkBoxB2);
        cbB3 = (CheckBox) findViewById(R.id.checkBoxB3);

        rbSJ = (RadioButton) findViewById(R.id.radioButtonSJ);
        rbPP = (RadioButton) findViewById(R.id.radioButtonPP);

        sP1 = (Spinner) findViewById(R.id.spinnerP1);
        sP2 = (Spinner) findViewById(R.id.spinnerP2);
        sBB = (Spinner) findViewById(R.id.spinnerBB);

        tvHasil =(TextView) findViewById(R.id.textViewHasil);
        tvBB = (TextView) findViewById(R.id.textViewBB);
        tvKelas = (TextView) findViewById(R.id.textViewKelas);
        tvnoid = (TextView) findViewById(R.id.textViewnoid);
        tvNP =(TextView) findViewById(R.id.textViewNP);
        tvPB = (TextView) findViewById(R.id.textViewPB);
        tvSA = (TextView) findViewById(R.id.textViewSA);
        tvST = (TextView) findViewById(R.id.textViewST);
        tvPD = (TextView) findViewById(R.id.textViewPD);
        tvTK = (TextView) findViewById(R.id.textViewTK);

        findViewById(R.id.buttonkirim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                doClick();





            }
        });
    }

    private void doClick()
    {   String np = etNP.getText().toString();
        tvNP.setText("Nama Pemesan : "+np+ "\n");


        String sa = etSA.getText().toString();
        tvSA.setText("Stasiun Awal : "+sa + "\n");


        String st = etST.getText().toString();
        tvST.setText("Stasiun Tujuan : " +st+"\n");


        String noid = etnoid.getText().toString();
        tvnoid.setText("Nomor ID :" +noid+"\n");


        String tk = etTK.getText().toString();
        tvTK.setText("Tanggal Keberangkatan :" +tk);


        tvBB.setText("Kelas Kereta Api:" + sBB.getSelectedItem().toString()+"\n");

        String hasilcb = "Berat Bagasi: ";
        int starlen = hasilcb.length();
        if (cbB1.isChecked()) hasilcb+=cbB1.getText()+"\n";
        if (cbB2.isChecked()) hasilcb+=cbB2.getText()+"\n";
        if (cbB3.isChecked()) hasilcb+=cbB3.getText()+"\n";

        tvBB.setText(hasilcb);


        if (hasilcb.length() == starlen) hasilcb += "Anda Belum Memilih Berat Bagasi";


        tvPD.setText("Banyak Penumpang Dewasa :" +sP1.getSelectedItem().toString()+"\n");

        tvPB.setText("Banyak Penumpang Bayi:" +sP2.getSelectedItem().toString()+ "\n");


        String hasil = null;

        if (rbSJ.isChecked())
        {
            hasil = rbSJ.getText().toString();
        }
        else if (rbPP.isChecked())
        {
            hasil = rbPP.getText().toString();
        }

        if (hasil == null)
        {
            tvHasil.setText("Belum Memilih Mode Booking Tiket");
        }
        else
        {
            tvHasil.setText("Boking Tiket : " +hasil);
        }
    }
}
