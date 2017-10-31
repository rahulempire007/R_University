package palletech.com.r_university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


        String s1="java",s2="Android",s3=".NET",s4="SQL",s="success";
        Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i =new Intent(MainActivity.this,CourseDetailActivity.class);
                i.putExtra("a",s1);
                i.putExtra("s",s);
              //  i.putExtra("f",f);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i =new Intent(MainActivity.this,CourseDetailActivity.class);
                i.putExtra("a",s2);
                i.putExtra("s",s);
             //   i.putExtra("f",f);

                startActivity(i);



            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i =new Intent(MainActivity.this,CourseDetailActivity.class);
                i.putExtra("a",s3);
                i.putExtra("s",s);
              // i.putExtra("f",f);
                startActivity(i);

                //start the DisplayActivity

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i =new Intent(MainActivity.this,CourseDetailActivity.class);
                i.putExtra("a",s4);
                i.putExtra("s",s);
            //    i.putExtra("f",f);
                startActivity(i);


            }
        });


    }
}
