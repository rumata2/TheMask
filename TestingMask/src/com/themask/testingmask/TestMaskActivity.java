package com.themask.testingmask;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TestMaskActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mask);
        
        final Button button = (Button) findViewById(R.id.change_themask_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	try {
	            	//find the input and output text fields
	            	TextView titleView = (TextView)findViewById(R.id.TheMaskTitle);
	            	EditText editView = (EditText) findViewById(R.id.theMaskEdit);
	            	titleView.setText(editView.getText());
	            } catch (Exception e) {
	            	System.err.println("Caught " + e.getMessage());
	            }
            } 
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test_mask, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
