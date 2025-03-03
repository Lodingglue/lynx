package com.lunaris.trollinc;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.content.pm.PackageManager;

public class LaunchApp {

    public static void launchApp(Context context) {
        // Check if the app is installed
        if (isAppInstalled(context, "io.mrarm.mctoolbox")) {
            // If installed, launch the app
            Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage("io.mrarm.mctoolbox");
            if (launchIntent != null) {
                context.startActivity(launchIntent);
            }
        } else {
            // If not installed, show a toast
            Toast.makeText(context, "Install Lumina before launching", Toast.LENGTH_SHORT).show();
        }
    }

    private static boolean isAppInstalled(Context context, String packageName) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}