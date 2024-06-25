package com.example.alertbox;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//Import package for AlertBox
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Shows a dialogue box when the app is Launched:
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        //Set the title and message to display when the dialogue box appears :
        builder.setTitle("ALERT : CAUTION").setMessage("Do you want to continue ?");

        //Set cancelable true : when the user clicks on outside the Dialog Box then it disappears
        //Set cancelable false : when the user clicks on outside the Dialog Box then it will remain visible.
        builder.setCancelable(true);

        //Add Buttons , Display "YES" and "NO"
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //When User taps Ok button dialog box cancels.
                dialog.cancel();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                //When user cancels the dialog box it GO back
                finish();

            }
        });

        //Create
        AlertDialog dialog = builder.create();
        builder.show();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}