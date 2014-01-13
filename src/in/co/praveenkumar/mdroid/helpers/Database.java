/*
 * Author: 	Praveen Kumar Pendyala
 * Project: MDroid
 * Created:	28-12-2013
 * 
 * � 2013, Praveen Kumar Pendyala. 
 * Licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 
 * 3.0 Unported license, http://creativecommons.org/licenses/by-nc-sa/3.0/ 
 * 
 * This is a part of the MDroid project. You may use the contents of this file
 * or the project only if you comply with license of the project, available at the 
 * Github repo: https://github.com/praveendath92/MDroid/blob/master/README.md
 * 
 */

package in.co.praveenkumar.mdroid.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Database {
	private static final String APP_SHARED_PREFS = "MDROID_PREFERENCES";
	private SharedPreferences appSharedPrefs;
	private Editor prefsEditor;

	// Preferences
	public Database(Context context) {
		this.appSharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS,
				Activity.MODE_PRIVATE);
		this.prefsEditor = appSharedPrefs.edit();
	}

	public String getLDAP() {
		return appSharedPrefs.getString("ldap", "");
	}

	public void setLDAP(String ldap) {
		prefsEditor.putString("ldap", ldap);
		prefsEditor.commit();
	}

	public String getPswd() {
		return appSharedPrefs.getString("pswd", "");
	}

	public void setPswd(String pswd) {
		prefsEditor.putString("pswd", pswd);
		prefsEditor.commit();
	}

	public String getURL() {
		return appSharedPrefs.getString("url", "http://moodle.iitb.ac.in");
	}

	public void setURL(String url) {
		prefsEditor.putString("url", url);
		prefsEditor.commit();
	}

	public int getAutoSaveState() {
		// 0 - only uname; 1 - both; 2 - none
		return appSharedPrefs.getInt("autosave", 1);
	}

	public void setAutoSaveState(int state) {
		// 0 - only uname; 1 - both; 2 - none
		prefsEditor.putInt("autosave", state);
		prefsEditor.commit();
	}

	public Boolean getAutoLoginState() {
		// 0 - false; 1 - true;
		return appSharedPrefs.getBoolean("autologin", false);
	}

	public void setAutoLoginState(Boolean state) {
		// 0 - false; 1 - true;
		prefsEditor.putBoolean("autologin", state);
		prefsEditor.commit();
	}
}