package palletech.com.r_university;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CourseDetailActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    Button b1,b2;
    RadioButton rb1,rb2;
    RadioGroup rg;
    String str,str1="CREDIT CARD",str2="PAYPAL",str3,str4,s,s1,mob;

    int a=18000,c=20000;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);


        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rg= (RadioGroup) findViewById(R.id.rg);
        tv1=(TextView)findViewById(R.id.text1);
        tv2=(TextView)findViewById(R.id.text2);
        tv3= (TextView) findViewById(R.id.tview1);
        tv4= (TextView) findViewById(R.id.tview2);
        tv5= (TextView) findViewById(R.id.tview3);
        tv6= (TextView) findViewById(R.id.tview4);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        ll= (LinearLayout) findViewById(R.id.ll);

        Intent i=getIntent();
        final Bundle b=i.getExtras();
        str=b.getString("a");
        tv1.setText("Circular:" +str);

        s=b.getString("s");
        if (s!=null && s.equals("success")){
            ll.setVisibility(View.INVISIBLE);

        }
        s1=b.getString("f");
        if (s1!=null && s1.equals("failure")){
            ll.setVisibility(View.VISIBLE);
            tv3.setText("Summary: "+str);

            tv4.setText("Status: Success");

            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();

            mob=bundle.getString("c");
            tv5.setText("Mobile number: "+mob);


            str3=bundle.getString("d");
            tv6.setText("Address: "+str3); //address

        }




        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
               if (rb1.isChecked()){
                   tv2.setText("Total Fee is:"+a);
               }
               else if (rb2.isChecked()){
                   tv2.setText("Total Fee is:"+c);
               }
           }
       });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CourseDetailActivity.this,PaymentActivity.class);
                intent.putExtra("a",str1);
                intent.putExtra("b",str);
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CourseDetailActivity.this,PaymentActivity.class);
                intent.putExtra("a",str2);
                intent.putExtra("b",str);
                startActivity(intent);

            }
        });




    }



   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==ReqCode){
            if (resultCode==RESULT_OK){
                ll.setVisibility(View.VISIBLE);
                tv3.setText("Summary: "+str);
                tv4.setText("Status: Success");

                Intent intent=getIntent();
                Bundle bundle=intent.getExtras();
                str3=bundle.getString("d");
                tv5.setText("Mobile number: "+str3);

                str4=bundle.getString("e");
                tv6.setText("Address: "+str4);

            }
            else {
                ll.setVisibility(View.VISIBLE);
                tv3.setText("Summary: "+str);
                tv4.setText("Status: Success");

                Intent intent=getIntent();
                Bundle bundle=intent.getExtras();
                str3=bundle.getString("d");
                tv5.setText("Mobile number: "+str3);

                str4=bundle.getString("e");
                tv6.setText("Address: "+str4);
            }
        }
    }*/
}
