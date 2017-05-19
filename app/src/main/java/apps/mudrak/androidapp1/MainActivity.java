package apps.mudrak.androidapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //required variables
    Button clickMeButton;
    TextView helloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clickMeButton click event listener code
        clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Starting another activity...",Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);*/
            }
        });
        //helloWorldTextview click event listener code
        helloWorldTextView = (TextView) findViewById(R.id.helloWorldtextView);
        helloWorldTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"You clicked the TextView!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
