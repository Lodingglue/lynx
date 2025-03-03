package com.lynx.repack;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
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
import com.google.android.material.*;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.card.*;
import com.google.firebase.FirebaseApp;
import com.my.kizzyrpc.*;
import com.sketchify.util.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class McinstallActivity extends AppCompatActivity {
	
	public final int REQ_CD_APKINSTALL = 101;
	
	private LinearLayout parent;
	private LinearLayout linear9;
	private BottomNavigationView bottomnavigation1;
	private RelativeLayout linear10;
	private TextView textview1;
	private LinearLayout linear16;
	private ImageView imageview5;
	private MaterialCardView linear17;
	private LinearLayout linear20;
	private ImageView imageview3;
	private TextView textview2;
	
	private Intent v = new Intent();
	private Intent s = new Intent();
	private Intent apkinstall = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_apkinstall;
	private Intent dv = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mcinstall);
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
		parent = findViewById(R.id.parent);
		linear9 = findViewById(R.id.linear9);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		linear16 = findViewById(R.id.linear16);
		imageview5 = findViewById(R.id.imageview5);
		linear17 = findViewById(R.id.linear17);
		linear20 = findViewById(R.id.linear20);
		imageview3 = findViewById(R.id.imageview3);
		textview2 = findViewById(R.id.textview2);
		_file_apkinstall = FileUtil.createNewPictureFile(getApplicationContext());
		Uri _uri_apkinstall;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_apkinstall = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", _file_apkinstall);
		} else {
			_uri_apkinstall = Uri.fromFile(_file_apkinstall);
		}
		apkinstall.putExtra(MediaStore.EXTRA_OUTPUT, _uri_apkinstall);
		apkinstall.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				if (_itemId == 0) {
					v.setClass(getApplicationContext(), MainActivity.class);
					startActivity(v);
					Animatoo.animateFade(McinstallActivity.this);
				}
				if (_itemId == 1) {
					
				}
				if (_itemId == 2) {
					s.setClass(getApplicationContext(), SettingsActivity.class);
					startActivity(s);
					Animatoo.animateFade(McinstallActivity.this);
				}
				return true;
			}
		});
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dv.setAction(Intent.ACTION_VIEW);
				dv.setData(Uri.parse("https://discord.com/invite/C4bHCfNFgy"));
				startActivity(dv);
			}
		});
	}
	
	private void initializeLogic() {
		if (FileUtil.isExistFile("/storage/emulated/0/Android/data/com.zenith.trollinc/".concat("/README.json"))) {
			SketchwareUtil.showMessage(getApplicationContext(), "readme already exists");
		}
		else {
			FileUtil.writeFile("".concat("/README.json"), FileUtil.getPackageDataDir(getApplicationContext()));
		}
		bottomnavigation1.getMenu().add(0, 0, 0, "Menu").setIcon(R.drawable.home_icon_8);
		bottomnavigation1.getMenu().add(0, 1, 0, "Home").setIcon(R.drawable.home_icon_1);
		bottomnavigation1.getMenu().add(0, 2, 0, "Settings").setIcon(R.drawable.homs_icon_5);
		imageview3.setColorFilter(0xFF50DBCF, PorterDuff.Mode.MULTIPLY);
		imageview5.setColorFilter(0xFF50DBCF, PorterDuff.Mode.MULTIPLY);
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