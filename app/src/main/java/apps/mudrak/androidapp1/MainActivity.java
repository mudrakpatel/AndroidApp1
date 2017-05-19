package apps.mudrak.androidapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clickMeButton click event listener code
        Button clickMeButton = (Button) findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked the button!",Toast.LENGTH_SHORT).show();
            }
        });
        TextView helloWorldTextView = (TextView) findViewById(R.id.helloWorldtextView);
        helloWorldTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"You clicked the TextView!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
