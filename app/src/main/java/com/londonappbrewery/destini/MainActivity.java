package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView textView;
    private Button truebutton ;
    private Button falsebutton ;
    private  int index=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        textView = (TextView) findViewById(R.id.storyTextView);
        truebutton = (Button) findViewById(R.id.buttonTop);
        falsebutton = (Button) findViewById(R.id.buttonBottom);


        truebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index==1){
                    textView.setText(R.string.T3_Story);
                    truebutton.setText(R.string.T3_Ans1);
                    falsebutton.setText(R.string.T3_Ans2);
                    index=3;
                }
                else if(index ==2){
                    textView.setText(R.string.T3_Story);
                    truebutton.setText(R.string.T3_Ans1);
                    falsebutton.setText(R.string.T3_Ans2);
                    index=3;
                }
                else if (index ==3){
                    textView.setText(R.string.T6_End);
                    truebutton.setVisibility(View.GONE);
                    falsebutton.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        falsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index==1){
                    textView.setText(R.string.T2_Story);
                    truebutton.setText(R.string.T2_Ans1);
                    falsebutton.setText(R.string.T2_Ans2);
                    index=2;
                }
                else if (index ==2){
                    textView.setText(R.string.T4_End);
                    truebutton.setVisibility(View.GONE);
                    falsebutton.setVisibility(View.GONE);
                }
                else if(index==3){
                    textView.setText(R.string.T5_End);
                    truebutton.setVisibility(View.GONE);
                    falsebutton.setVisibility(View.GONE);

                }
            }
        });

    }
}
