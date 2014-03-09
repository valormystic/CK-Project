package com.example.testing;

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

	MediaPlayer mSong;
	Button mPlay;
	Button mStop;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        mSong = new MediaPlayer();
        mPlay = (Button) findViewById(R.id.button1);
        mPlay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Log.d("SecondActivity", "Song is playing");
				try {
					mSong.prepare();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mSong.start();
				
				
			}
		});
        
        mStop = (Button) findViewById(R.id.button2);
        mStop.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("SecondActivity", "Song has stopped");
				Intent o = new Intent (SecondActivity.this, MainActivity.class);
				startActivity(o);
			}
		});
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }
    
}
