package alvianosi.kasirrestoran;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class BayarActivity extends AppCompatActivity {
    int tot1,tot2,tot3,tot4,tot5,tot6,tot7,totTot;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_APPEND);

        ed1= (EditText) findViewById(R.id.jml1);
        ed2= (EditText) findViewById(R.id.jml2);
        ed3= (EditText) findViewById(R.id.jml3);
        ed4= (EditText) findViewById(R.id.jml4);
        ed5= (EditText) findViewById(R.id.jml5);
        ed6= (EditText) findViewById(R.id.jml6);
        ed7= (EditText) findViewById(R.id.jml7);

        tot1= Integer.parseInt(ed1.getText().toString()) * sharedpreferences.getString();
        totTot=tot1+tot2+tot3+tot4+tot5+tot6+tot7;
    }
}
