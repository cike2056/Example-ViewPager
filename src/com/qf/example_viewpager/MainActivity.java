package com.qf.example_viewpager;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
//v4包.
public class MainActivity extends Activity {
	private ViewPager vp ;
	int images []={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
	List<ImageView> list;
	private RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}
	/**
	 * 初始化视图.
	 */
	private void init() {
		// TODO Auto-generated method stub
		vp = (ViewPager) findViewById(R.id.vp);
		rg = (RadioGroup) findViewById(R.id.rg);
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
		vp.setOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				RadioButton rb = (RadioButton) rg.getChildAt(arg0);
				rb.setChecked(true);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.rb1:
					vp.setCurrentItem(0);
					break;
				case R.id.rb2:
					vp.setCurrentItem(1);
					break;
				case R.id.rb3:
					vp.setCurrentItem(2);
					break;
				case R.id.rb4:
					vp.setCurrentItem(3);
					break;
				default:
					break;
				}
			}
		});
	}
}
