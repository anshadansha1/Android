package com.example.dataandtime;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Initializing textview instances :
        TextView tv1=(TextView) findViewById(R.id.tv1);
        TextView tv2=(TextView) findViewById(R.id.tv2);
        TextView tv3=(TextView) findViewById(R.id.tv3);
        TextView tv4=(TextView) findViewById(R.id.tv4);
        TextView tv5=(TextView) findViewById(R.id.tv5);
        TextView tv6=(TextView) findViewById(R.id.tv6);
        TextView tv7=(TextView) findViewById(R.id.tv7);
        TextView tv8=(TextView) findViewById(R.id.tv8);
        TextView tv9=(TextView) findViewById(R.id.tv9);
        TextView tv10=(TextView) findViewById(R.id.tv10);

        //Get the Long type value of current system date
        Long dtlong = System.currentTimeMillis();
        tv2.setText(dtlong.toString());

        String dateTime;
        Calendar calender;
        SimpleDateFormat simpleDateFormat;

        //format type 1:
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv4.setText(dateTime);

        //format type 2 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv5.setText(dateTime);

        //format type 3 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv6.setText(dateTime);

        //format type 4 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.LLL.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv7.setText(dateTime);

        //format type 5 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.LLLL.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv8.setText(dateTime);

        //format type 6 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("E.LLLL.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv9.setText(dateTime);

        //format type 7 :
        calender = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("EEEE.LLLL.yyyy HH:mm:ss aaa z");
        dateTime = simpleDateFormat.format(calender.getTime()).toString();
        tv10.setText(dateTime);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}