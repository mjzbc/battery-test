package com.example.hmcompanyname.batteryasync;

import android.graphics.Color;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        btn = (Button) findViewById(R.id.btn);

        //listener
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //call the async task with execute method
                new MyTask().execute();

            }
        });

    }


    public class MyTask extends AsyncTask<String, String, String>{

        @Override
        protected void onPreExecute(){
            //super.onPreExecute();

            //get time to start task
            tv.setText("Starting computations, then will update this label...");
            tv.setTextColor(Color.BLUE);
            Toast.makeText(MainActivity.this,"In PreExecute",Toast.LENGTH_SHORT).show();

        }

        protected void onPostExecute(String s){
            //super.onPostExecute(s);

            Toast.makeText(MainActivity.this, "Finished task in: " + s, Toast.LENGTH_SHORT).show();
        }

        @Override
        protected String doInBackground(String... strings) {
            //DO BACKGROUND COMPUTATIONS IN HERE

            double startTime = Calendar.getInstance().getTimeInMillis();
            double endTime;
            double secondsElapsed;

            double counter = 0;
            double endValue = 5;



            try {

                for(int i = 0; i < 20; i++){
                        //tv.append(" *Testing* ");
                    publishProgress(String.valueOf(i));

                    }

                }
            catch (Exception e){
                e.printStackTrace();

            }

            return result;
        }

        public void onProgressUpdate(){

        }
    }





}
