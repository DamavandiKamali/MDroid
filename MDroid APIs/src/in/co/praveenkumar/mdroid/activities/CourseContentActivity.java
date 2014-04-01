package in.co.praveenkumar.mdroid.activities;

import in.co.praveeenkumar.mdroid.extenders.DrawerActivity;
import in.co.praveeenkumar.mdroid.extenders.StickyListViewAdapter;
import in.co.praveenkumar.mdroid.apis.R;

import java.util.ArrayList;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class CourseContentActivity extends DrawerActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_course_content);
		super.onCreate(savedInstanceState);
	}

	private void listCoursesInListView() {
		StickyListHeadersListView listview;
		listview = (StickyListHeadersListView) findViewById(R.id.course_content_list);
		listview.setAreHeadersSticky(true);

	}

	private class asyncCourseFetch extends AsyncTask<String, Integer, Long> {

		protected Long doInBackground(String... credentials) {

			return null;

		}

		protected void onPostExecute(Long result) {

		}
	}

	private class courseListViewAdapter extends StickyListViewAdapter {

		public courseListViewAdapter(Context context, ArrayList<String> dataSet) {
			super(context, dataSet);
			// TODO Auto-generated constructor stub
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View rowView = mInflater.inflate(R.layout.course_content_list_item,
					parent, false);

			return rowView;
		}
	}

}