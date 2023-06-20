package com.mycompany.Bmi;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
public class MainActivity extends Activity 
{
	private TextView textViewHeight, textViewWeight, textViewResult;
    private SeekBar seekBarHeight, seekBarWeight;
    private Button buttonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		textViewHeight = findViewById(R.id.textViewHeight);
        textViewWeight = findViewById(R.id.textViewWeight);
        textViewResult = findViewById(R.id.textViewResult);
        seekBarHeight = findViewById(R.id.seekBarHeight);
        seekBarWeight = findViewById(R.id.seekBarWeight);
        buttonCalculate = findViewById(R.id.buttonCalculate);
		seekBarHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

				@Override
				public void onStartTrackingTouch(SeekBar p1)
				{
					// TODO: Implement this method
				}

				@Override
				public void onStopTrackingTouch(SeekBar p1)
				{
					// TODO: Implement this method
				}
				
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
				textViewHeight.setText(progress + " cm");
				}
			});
		seekBarWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

				@Override
				public void onProgressChanged(SeekBar seekBar , int progress, boolean fromUser)
				{
					// TODO: Implement this method
					textViewWeight.setText(progress + " kg");
				}

				@Override
				public void onStartTrackingTouch(SeekBar p1)
				{
					// TODO: Implement this method
				}

				@Override
				public void onStopTrackingTouch(SeekBar p1)
				{
					// TODO: Implement this method
				}
				
			});
	}
	public void Calculate(View v){
		int height = seekBarHeight.getProgress();
		int weight = seekBarWeight.getProgress();

		// Calculate BMI
		double heightInMeters = height / 100.0;
		double bmi = weight / (heightInMeters * heightInMeters);

		// Display the result
		String result = String.format("Your BMI: %.1f", bmi);
		textViewResult.setText(result);
	}
}
