package com.lynx.repack;

import com.lynx.repack.AuthActivity;
import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Build;
import android.provider.MediaStore;
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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.startup.*;
import androidx.transition.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.github.angads25.toggle.*;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.*;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.card.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.my.kizzyrpc.*;
import com.sketchify.util.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import com.github.angads25.toggle.widget.LabeledSwitch;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import android.content.pm.PackageManager;
import android.content.Context;
import com.google.android.material.radiobutton.MaterialRadioButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.net.URISyntaxException;
import java.net.URI;
import java.io.File;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.view.LayoutInflater;
import android.widget.AutoCompleteTextView;
import com.google.android.material.color.DynamicColors;
import com.google.android.material.navigation.NavigationView;
import java.lang.reflect.*;

public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_LAUNCHAPP = 101;
	public final int REQ_CD_T = 102;
	
	private FloatingActionButton _fab;
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout parent;
	private LinearLayout linear9;
	private BottomNavigationView bottomnavigation1;
	private LinearLayout linear10;
	private TextView textview1;
	private LinearLayout linear16;
	private ImageView imageview5;
	private LinearLayout linear21;
	private TextView textview4;
	private MaterialCardView linear17;
	private LinearLayout linear20;
	private ImageView imageview3;
	private LinearLayout linear22;
	private TextView textview5;
	private TextView textview2;
	private TextView textview6;
	
	private Intent video = new Intent();
	private Intent d = new Intent();
	private Intent v = new Intent();
	private Intent s = new Intent();
	private Intent hola = new Intent();
	private AlertDialog.Builder hwhhs;
	private Intent launchIntent = new Intent();
	private Intent launchapp = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_launchapp;
	private Intent dv = new Intent();
	private SharedPreferences network;
	private RequestNetwork preference;
	private RequestNetwork.RequestListener _preference_request_listener;
	private Intent hwjw = new Intent();
	private Intent jaiahagwhqj = new Intent();
	private Intent imtent = new Intent();
	private Intent loading = new Intent();
	private GoogleSignInClient t;
	private FirebaseAuth tt;
	private OnCompleteListener<AuthResult> _tt_create_user_listener;
	private OnCompleteListener<AuthResult> _tt_sign_in_listener;
	private OnCompleteListener<Void> _tt_reset_password_listener;
	private OnCompleteListener<Void> tt_updateEmailListener;
	private OnCompleteListener<Void> tt_updatePasswordListener;
	private OnCompleteListener<Void> tt_emailVerificationSentListener;
	private OnCompleteListener<Void> tt_deleteUserListener;
	private OnCompleteListener<Void> tt_updateProfileListener;
	private OnCompleteListener<AuthResult> tt_phoneAuthListener;
	private OnCompleteListener<AuthResult> tt_googleSignInListener;
	
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		
		parent = findViewById(R.id.parent);
		linear9 = findViewById(R.id.linear9);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		linear16 = findViewById(R.id.linear16);
		imageview5 = findViewById(R.id.imageview5);
		linear21 = findViewById(R.id.linear21);
		textview4 = findViewById(R.id.textview4);
		linear17 = findViewById(R.id.linear17);
		linear20 = findViewById(R.id.linear20);
		imageview3 = findViewById(R.id.imageview3);
		linear22 = findViewById(R.id.linear22);
		textview5 = findViewById(R.id.textview5);
		textview2 = findViewById(R.id.textview2);
		textview6 = findViewById(R.id.textview6);
		hwhhs = new AlertDialog.Builder(this);
		_file_launchapp = FileUtil.createNewPictureFile(getApplicationContext());
		Uri _uri_launchapp;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_launchapp = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", _file_launchapp);
		} else {
			_uri_launchapp = Uri.fromFile(_file_launchapp);
		}
		launchapp.putExtra(MediaStore.EXTRA_OUTPUT, _uri_launchapp);
		launchapp.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		network = getSharedPreferences("idk", Activity.MODE_PRIVATE);
		preference = new RequestNetwork(this);
		tt = FirebaseAuth.getInstance();
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					
				}
				if (_itemId == 1) {
					s.setClass(getApplicationContext(), SettingsActivity.class);
					startActivity(s);
					Animatoo.animateFade(MainActivity.this);
				}
				return true;
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				jaiahagwhqj.setAction(Intent.ACTION_VIEW);
				
				startActivity(jaiahagwhqj);
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
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				loading.setAction(Intent.ACTION_VIEW);
				loading.setClass(getApplicationContext(), LoadingActivity.class);
				startActivity(loading);
			}
		});
		
		_preference_request_listener = new RequestNetwork.RequestListener() {
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
		
		tt_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		tt_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		tt_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		tt_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		tt_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		tt_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		tt_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_tt_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_tt_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_tt_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.zenith.trollinc/".concat("/README.json"))) {
			SketchwareUtil.showMessage(getApplicationContext(), "readme already exists");
		}
		else {
			FileUtil.writeFile("".concat("/README.json"), FileUtil.getPackageDataDir(getApplicationContext()));
		}
		imageview3.setColorFilter(0xFFBDBDBD, PorterDuff.Mode.MULTIPLY);
		imageview5.setColorFilter(0xFF424242, PorterDuff.Mode.MULTIPLY);
		bottomnavigation1.getMenu().add(0, 0, 0, "").setIcon(R.drawable.home_icon_1);
		bottomnavigation1.getMenu().add(0, 1, 0, "").setIcon(R.drawable.homs_icon_5);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lynx.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensans_bold.ttf"), 0);
		_fab.setImageResource(R.drawable.launch);
	}
	
	public void _ARGMaterialEditText(final View _linear, final TextView _edittext, final String _hint, final String _name) {
		((LinearLayout)_linear).removeView(_edittext); 
		final com.google.android.material.textfield.TextInputLayout _nme = new com.google.android.material.textfield.TextInputLayout (this);
		 _nme.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)); 
		
		 _nme.setPadding((int)getDip(2), (int)getDip(2) , (int)getDip(2) , (int)getDip(2) );
		_nme.setGravity(Gravity.CENTER);
		_nme.setHintEnabled(true);
		_nme.setHint(_hint);
		_nme.setBoxBackgroundMode(_nme.BOX_BACKGROUND_OUTLINE); 
		_nme.setBoxStrokeColor(0xFF212121);
		_nme.setBoxCornerRadii(5, 5, 5, 5);
		_nme.setErrorEnabled(true);
		_nme.setHintAnimationEnabled(true);
		
		_nme.addView(_edittext);
		 ((LinearLayout)_linear).addView(_nme);
	}
	
	
	public void _DownloadFile(final String _url, final String _path) {
		FileUtil.makeDir(FileUtil.getPackageDataDir(getApplicationContext()));
		android.net.ConnectivityManager connMgr = (android.net.ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		android.net.NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (networkInfo != null && networkInfo.isConnected()) {
			    final String urlDownload = _url;
			    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlDownload));
			    final String fileName = URLUtil.guessFileName(urlDownload, null, null);
			    request.setDescription("Downloading... DO NOT CANCEL");
			    request.setTitle("Version Switcher");
			    request.allowScanningByMediaScanner();
			    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
			    request.setDestinationInExternalPublicDir(_path, fileName);
			    final DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
			    final long downloadId = manager.enqueue(request);
			    new Thread(new Runnable() {
				        @Override
				        public void run() {
					            boolean downloading = true;
					            while (downloading) {
						                DownloadManager.Query q = new DownloadManager.Query();
						                q.setFilterById(downloadId);
						                android.database.Cursor cursor = manager.query(q);
						                cursor.moveToFirst();
						                int bytes_downloaded = cursor.getInt(cursor .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
						                int bytes_total = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
						                if (cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)) == DownloadManager.STATUS_SUCCESSFUL) {
							                    downloading = false;
							                }
						                final int dl_progress = (int) ((bytes_downloaded * 100l) / bytes_total);
						                if (dl_progress == 100) {
							                    //Nothing to put here //Dont skid!
							                }
						            }
					        }
				    }).start();
		} else {
			    //Nothing to put here too //Dont skid!
		}
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