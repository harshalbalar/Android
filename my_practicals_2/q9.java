package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Random;

public class q9 extends AppCompatActivity {
    private Button downloadButton;
    private ProgressBar progressBar;
    private DownloadTask downloadTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);

        downloadButton = findViewById(R.id.download_button);
        progressBar = findViewById(R.id.progress_bar);

        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadTask = new DownloadTask();
                downloadTask.execute();
            }
        });
    }


    private class DownloadTask extends AsyncTask<Void, Integer, Void> {

        private int totalProgress;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
            totalProgress = 0;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int progress = random.nextInt(10);
                totalProgress += progress;
                publishProgress(totalProgress);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressBar.setVisibility(View.INVISIBLE);
        }
    }
}