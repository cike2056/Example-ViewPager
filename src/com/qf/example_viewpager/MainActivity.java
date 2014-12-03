package com.qf.example_viewpager;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity {
	private ViewPager vp ;
	int images []={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
	List<ImageView> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}
	/**
	 * ≥ı ºªØ ”Õº.
	 */
	private void init() {
		// TODO Auto-generated method stub
		vp = (ViewPager) findViewById(R.id.vp);
		list= new ArrayList<ImageView>();
		for(int i=0;i<images.length;i++){
			ImageView imgv = new ImageView(getApplicationContext());
			LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
			imgv.setLayoutParams(params);
			imgv.setScaleType(ScaleType.CENTER_CROP);
			imgv.setImageResource(images[i]);
			list.add(imgv);
		}
		MyPagerAdapter adapter = new MyPagerAdapter(list);
		vp.setAdapter(adapter);
	}
}
