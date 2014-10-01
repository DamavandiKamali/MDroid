package in.co.praveenkumar.mdroid;

import in.co.praveenkumar.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WebserviesActivity extends Activity {
	private Boolean toCourses = false;
	String html = "";
	int errorCode = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webservices);

		try {
			html = getIntent().getExtras().getString("html");
			toCourses = true;
		} catch (Exception e) {
			toCourses = false;
		}

		try {
			errorCode = getIntent().getExtras().getInt("errCode");
		} catch (Exception e) {

		}
	}

	public void showAPIs(View v) {
		System.out.println("Sure !");
	}

	public void skipToCourse(View v) {
		if (toCourses) {
			Intent i = new Intent(this, CoursesActivity.class);
			i.putExtra("html", html);
			startActivityForResult(i, 1);
		} else {
			Intent i = new Intent(this, ErrorActivity.class);
			i.putExtra("errCode", errorCode);
			startActivityForResult(i, 1);
		}
	}

}
