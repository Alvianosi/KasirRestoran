package alvianosi.kasirrestoran;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static alvianosi.kasirrestoran.SettingActivity.food1;
import static alvianosi.kasirrestoran.SettingActivity.food2;
import static alvianosi.kasirrestoran.SettingActivity.food3;
import static alvianosi.kasirrestoran.SettingActivity.food4;
import static alvianosi.kasirrestoran.SettingActivity.food5;
import static alvianosi.kasirrestoran.SettingActivity.food6;
import static alvianosi.kasirrestoran.SettingActivity.food7;

public class BayarActivity extends AppCompatActivity {
    int tot1,tot2,tot3,tot4,tot5,tot6,tot7,totTot;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    TextView total1,total2,total3,total4,total5,total6,total7,totalTot;
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        ed1= (EditText) findViewById(R.id.jml1);
        ed2= (EditText) findViewById(R.id.jml2);
        ed3= (EditText) findViewById(R.id.jml3);
        ed4= (EditText) findViewById(R.id.jml4);
        ed5= (EditText) findViewById(R.id.jml5);
        ed6= (EditText) findViewById(R.id.jml6);
        ed7= (EditText) findViewById(R.id.jml7);

        total1= (TextView) findViewById(R.id.total1);
        total2= (TextView) findViewById(R.id.total2);
        total3= (TextView) findViewById(R.id.total3);
        total4= (TextView) findViewById(R.id.total4);
        total5= (TextView) findViewById(R.id.total5);
        total6= (TextView) findViewById(R.id.total6);
        total7= (TextView) findViewById(R.id.total7);
        totalTot= (TextView) findViewById(R.id.totalTotal);

        tot1= Integer.parseInt(ed1.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food1,null));
        tot2= Integer.parseInt(ed2.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food2,null));
        tot3= Integer.parseInt(ed3.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food3,null));
        tot4= Integer.parseInt(ed4.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food4,null));
        tot5= Integer.parseInt(ed5.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food5,null));
        tot6= Integer.parseInt(ed6.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food6,null));
        tot7= Integer.parseInt(ed7.getText().toString()) * Integer.parseInt(sharedpreferences.getString(food7,null));
        totTot=tot1+tot2+tot3+tot4+tot5+tot6+tot7;

        total1.setText(tot1);
        total2.setText(tot2);
        total3.setText(tot3);
        total4.setText(tot4);
        total5.setText(tot5);
        total6.setText(tot6);
        total7.setText(tot7);
        totalTot.setText(totTot);
    }
}
