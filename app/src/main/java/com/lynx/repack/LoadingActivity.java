package com.lynx.repack;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.startup.*;
import androidx.transition.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.github.angads25.toggle.*;
import com.google.android.material.*;
import com.google.firebase.FirebaseApp;
import com.my.kizzyrpc.*;
import com.sketchify.util.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class LoadingActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double peo = 0;
	
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextView textview1;
	private ProgressBar progressbar1;
	private TextView textview2;
	
	private TimerTask hahah;
	private TimerTask t1;
	private TimerTask t2;
	private ObjectAnimator ob1 = new ObjectAnimator();
	private ObjectAnimator ob2 = new ObjectAnimator();
	private ObjectAnimator ob3 = new ObjectAnimator();
	private Intent launch = new Intent();
	private TimerTask launchtime;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.loading);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		textview1 = findViewById(R.id.textview1);
		progressbar1 = findViewById(R.id.progressbar1);
		textview2 = findViewById(R.id.textview2);
	}
	
	private void initializeLogic() {
		t2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lynx.ttf"), 0);
						textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensans_bold.ttf"), 0);
						ob1.setTarget(textview1);
						ob1.setPropertyName("alpha");
						ob1.setFloatValues((float)(0), (float)(01));
						ob1.setDuration((int)(500));
						ob1.start();
						ob2.setTarget(textview2);
						ob2.setPropertyName("translationY");
						ob2.setFloatValues((float)(200), (float)(0));
						ob2.setDuration((int)(600));
						ob2.start();
						t1 = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										ob3.setTarget(progressbar1);
										ob3.setPropertyName("translationY");
										ob3.setFloatValues((float)(200), (float)(0));
										ob3.setDuration((int)(300));
										ob3.start();
										peo = 1;
										hahah = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														peo++;
														progressbar1.setProgress((int)peo);
													}
												});
											}
										};
										_timer.scheduleAtFixedRate(hahah, (int)(10), (int)(50));
									}
								});
							}
						};
						_timer.schedule(t1, (int)(300));
					}
				});
			}
		};
		_timer.schedule(t2, (int)(1000));
		launchtime = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						launch.setAction(Intent.ACTION_VIEW);
						
						startActivity(launch);
					}
				});
			}
		};
		_timer.schedule(launchtime, (int)(7150));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}