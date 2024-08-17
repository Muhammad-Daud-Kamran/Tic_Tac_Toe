package com.example.splashactivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class TicTacToe extends AppCompatActivity {
 MaterialButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
 Button btnrestart;
 String b1,b2,b3,b4,b5,b6,b7,b8,b9;
 TextView tvtictac;
 int flag=0;
 int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tic_tac_toe);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code to execute when button is clicked
                newgame();
            }
        });
    }
    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnrestart=findViewById(R.id.btnrestart);
        tvtictac=findViewById(R.id.tvtictac);
    }
    public void click(View view){
        MaterialButton btncurrent=(MaterialButton) view;
        //typcasting because we need button
        if (btncurrent.getText().toString().equals("")){
        counter++;
        Toast toastcustom=new Toast(this);
      View v  =getLayoutInflater().inflate(R.layout.customtoast_layout,(ViewGroup) findViewById(R.id.viewcontainer));
        toastcustom.setView(v);
        TextView tvtoast=v.findViewById(R.id.tvtoast);

     if (flag==0){
       btncurrent.setText("X");
       flag=1;
     }
        else {
            btncurrent.setText("O");
            flag=0;
     }
        if (counter > 4) {
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();
            // conditions to check which row match

            if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                // first condition
                tvtoast.setText("Winner is: "+b1);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();


            } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                // second condition for 2nd row
                tvtoast.setText("Winner is: "+b4);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                // third condition for 3rd row
                tvtoast.setText("Winner is: "+b7);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();
            } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                // fourth condition
                tvtoast.setText("Winner is: "+b1);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                // fifth  condition
                tvtoast.setText("Winner is: "+b2);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                // sixth  condition
                tvtoast.setText("Winner is: "+b3);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                // seventh  condition
                tvtoast.setText("Winner is: "+b1);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();


            } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                // eight condition
                tvtoast.setText("Winner is: "+b3);
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            } else if (!b1.equals("")&&!b2.equals("")&&!b3.equals("")&&!b4.equals("")&&!b5.equals("")&&!b6.equals("")&&!b7.equals("")&&!b8.equals("")&&!b9.equals("")) {

                tvtoast.setText("Match is drawn! try again");
                toastcustom.setDuration(toastcustom.LENGTH_LONG);
                toastcustom.show();

            }


        }

        }
    }

public void newgame(){
    btn1.setText("");
    btn2.setText("");
    btn3.setText("");
    btn4.setText("");
    btn5.setText("");
    btn6.setText("");
    btn7.setText("");
    btn8.setText("");
    btn9.setText("");
    flag=0;
    counter=0;
}

}