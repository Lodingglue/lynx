package com.lynx.repack;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
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
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.firebase.FirebaseApp;
import com.my.kizzyrpc.*;
import com.sketchify.util.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;


public class VideoActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear3;
	private BottomNavigationView bottomnavigation1;
	
	private Intent home = new Intent();
	private Intent d = new Intent();
	private Intent v = new Intent();
	private Intent s = new Intent();
	private Intent hola = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.video);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear5 = findViewById(R.id.linear5);
		linear3 = findViewById(R.id.linear3);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					home.setClass(getApplicationContext(), MainActivity.class);
					startActivity(home);
					Animatoo.animateFade(VideoActivity.this);
				}
				if (_itemId == 1) {
					
					startActivity(v);
					Animatoo.animateFade(VideoActivity.this);
				}
				if (_itemId == 2) {
					s.setClass(getApplicationContext(), SettingsActivity.class);
					startActivity(s);
					Animatoo.animateFade(VideoActivity.this);
				}
				if (_itemId == 3) {
					
				}
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		bottomnavigation1.getMenu().add(0, 0, 0, "Home").setIcon(R.drawable.home_icon_1);
		bottomnavigation1.getMenu().add(0, 1, 0, "Mcbe").setIcon(R.drawable.home_icon_8);
		bottomnavigation1.getMenu().add(0, 2, 0, "Extensions").setIcon(R.drawable.home_icon_7);
		bottomnavigation1.getMenu().add(0, 3, 0, "Settings").setIcon(R.drawable.homs_icon_5);
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