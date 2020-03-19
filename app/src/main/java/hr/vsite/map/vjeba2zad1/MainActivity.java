package hr.vsite.map.vjeba2zad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean brojac = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dugmeKlik(View v){
        // S get string metodom možemo dohvatiti resurs
        // Toast.makeText(this, getString(R.string.toast_ime), Toast.LENGTH_LONG).show();
        // Prikaz teksta unesen u EditText, u posebnom TextView
        // Prvo čitamo iz kućice za unos
        EditText et = findViewById(R.id.editText); //Uzmi referencu na View
        String txt = et.getText().toString(); // Pročitaj tekst

        TextView tv = findViewById(R.id.textView);
        et.setText(tv.getText());
        tv.setText(txt);
        // Upiši u TextView

        //Upit
        int aktivniTekst = brojac ? R.string.toast2 : R.string.toast1;
        //drugi klik na gumb
        brojac = !brojac;
        //prikaz Toast poruke
        Toast.makeText(this, getString(aktivniTekst), Toast.LENGTH_LONG).show();

    }
}
