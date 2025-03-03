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
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.card.*;
import com.google.firebase.FirebaseApp;
import com.my.kizzyrpc.*;
import com.sketchify.util.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class SettingsActivity extends AppCompatActivity {
	
	private LinearLayout parent;
	private LinearLayout linear9;
	private BottomNavigationView bottomnavigation1;
	private LinearLayout linear10;
	private LinearLayout linear31;
	private LinearLayout linear22;
	private LinearLayout linear16;
	private LinearLayout linear30;
	private ImageView imageview5;
	private LinearLayout linear21;
	private TextView textview4;
	private TextView textview1;
	private LinearLayout linear29;
	private ImageView imageview10;
	private TextView textview8;
	private MaterialCardView linear17;
	private MaterialCardView linear23;
	private MaterialCardView linear25;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private ImageView imageview11;
	private ImageView imageview12;
	private ImageView imageview13;
	
	private Intent d = new Intent();
	private Intent home = new Intent();
	private Intent v = new Intent();
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private Intent hola = new Intent();
	private Intent s = new Intent();
	private Intent dv = new Intent();
	private Intent tooldroid = new Intent();
	private Intent lot = new Intent();
	private Intent hans = new Intent();
	private Intent lumi = new Intent();
	private Intent GitHub = new Intent();
	private Intent web = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		parent = findViewById(R.id.parent);
		linear9 = findViewById(R.id.linear9);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		linear10 = findViewById(R.id.linear10);
		linear31 = findViewById(R.id.linear31);
		linear22 = findViewById(R.id.linear22);
		linear16 = findViewById(R.id.linear16);
		linear30 = findViewById(R.id.linear30);
		imageview5 = findViewById(R.id.imageview5);
		linear21 = findViewById(R.id.linear21);
		textview4 = findViewById(R.id.textview4);
		textview1 = findViewById(R.id.textview1);
		linear29 = findViewById(R.id.linear29);
		imageview10 = findViewById(R.id.imageview10);
		textview8 = findViewById(R.id.textview8);
		linear17 = findViewById(R.id.linear17);
		linear23 = findViewById(R.id.linear23);
		linear25 = findViewById(R.id.linear25);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		imageview11 = findViewById(R.id.imageview11);
		imageview12 = findViewById(R.id.imageview12);
		imageview13 = findViewById(R.id.imageview13);
		net = new RequestNetwork(this);
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					
				}
				if (_itemId == 1) {
					v.setClass(getApplicationContext(), MainActivity.class);
					startActivity(v);
					Animatoo.animateFade(SettingsActivity.this);
				}
				return true;
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setAction(Intent.ACTION_VIEW);
				d.setData(Uri.parse("https://discord.gg/VeXSSQDgrk"));
				startActivity(d);
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tooldroid.setAction(Intent.ACTION_VIEW);
				tooldroid.setData(Uri.parse("https://t.me/zeff_cheats"));
				startActivity(tooldroid);
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hans.setAction(Intent.ACTION_VIEW);
				hans.setData(Uri.parse("https://discord.gg/7Dj8s4Gbnw"));
				startActivity(hans);
			}
		});
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setAction(Intent.ACTION_VIEW);
				d.setData(Uri.parse("https://discord.gg/AmFQPmy6d5"));
				startActivity(d);
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setAction(Intent.ACTION_VIEW);
				d.setData(Uri.parse("https://discord.gg/VeXSSQDgrk"));
				startActivity(d);
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				GitHub.setAction(Intent.ACTION_VIEW);
				GitHub.setData(Uri.parse("https://github.com/Lodingglue/lynx"));
				startActivity(GitHub);
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				web.setAction(Intent.ACTION_VIEW);
				web.setData(Uri.parse("https://prlynx.netlify.app"));
				startActivity(web);
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		bottomnavigation1.getMenu().add(0, 0, 0, "").setIcon(R.drawable.homs_icon_5);
		bottomnavigation1.getMenu().add(0, 1, 0, "").setIcon(R.drawable.home_icon_1);
		imageview10.setColorFilter(0xFF546E7A, PorterDuff.Mode.MULTIPLY);
		imageview11.setColorFilter(0xFF546E7A, PorterDuff.Mode.MULTIPLY);
		imageview12.setColorFilter(0xFF546E7A, PorterDuff.Mode.MULTIPLY);
		imageview13.setColorFilter(0xFF546E7A, PorterDuff.Mode.MULTIPLY);
		imageview5.setColorFilter(0xFF546E7A, PorterDuff.Mode.MULTIPLY);
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