package palletech.com.r_university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    TextView tv1,tv2;
    String a,b,c,d,e,str;
    String f="failure";
    Button btn1,btn2;
    EditText et1,et2,et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        tv1= (TextView) findViewById(R.id.tv1);
        tv2= (TextView) findViewById(R.id.tv2);
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);


        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        a=bundle.getString("b");
        b=bundle.getString("a");

        tv1.setText("You are purchasing :"+a);
        tv2.setText("Payment Mode :"+b);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                c = et1.getText().toString();
                d = et2.getText().toString();
                e = et3.getText().toString();



                Intent intent1 = new Intent(PaymentActivity.this, CourseDetailActivity.class);
                intent1.putExtra("c",d);
                intent1.putExtra("d",e);
                intent1.putExtra("f",f);
                intent1.putExtra("a",a);
                startActivity(intent1);
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = et1.getText().toString();
                d = et2.getText().toString();
                e = et3.getText().toString();

                Toast.makeText(PaymentActivity.this,"YOU HAVE CANCELLED YOUR ORDER,TRY AGAIN",Toast.LENGTH_SHORT).show();



            }
        });



    }
}
