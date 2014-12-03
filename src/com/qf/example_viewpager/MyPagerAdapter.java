package com.qf.example_viewpager;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyPagerAdapter extends PagerAdapter{
	private List<ImageView> data;
	public MyPagerAdapter(List<ImageView> data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		container.addView(data.get(position));
		return data.get(position);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data==null?0:data.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0==arg1;
	}
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		//super.destroyItem(container, position, object);不能要,不然报错.
		container.removeView(data.get(position));
	}
}
