package com.leisure.basesample.view.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leisure.basesample.BaseActivity;
import com.leisure.basesample.MainActivity;
import com.leisure.basesample.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ViewListActivity extends BaseActivity{
	ListView mLV;
	List<Map<String, String>> list=new ArrayList<Map<String,String>>();
	private static final String TITLE="title";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_viewlist);
		mLV=(ListView)findViewById(R.id.lv);
		initData(list);
		mLV.setAdapter(new SimpleAdapter(this, list, android.R.layout.simple_list_item_1, 
	    		   new String[]{TITLE}, new int[]{android.R.id.text1}));
		mLV.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				switch (arg2) {
				case 0:
					startActivity(new Intent(mContext, LoadDialogActivity.class));
					break;

				default:
					break;
				}
			}
		});
	}
	
	private void initData(List<Map<String, String>> list){
		Map<String, String> map;
		map=new HashMap<String, String>();
		map.put(TITLE, "loadingView");
		list.add(map);
	}
}
