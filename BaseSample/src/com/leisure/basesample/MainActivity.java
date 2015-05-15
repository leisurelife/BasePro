package com.leisure.basesample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leisure.basesample.view.activity.LoadDialogActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity {
	private ListView mListView;
	private String[] data={"utils","view"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mListView=(ListView)findViewById(R.id.lv);
       List<Map<String, String>> list=new ArrayList<Map<String,String>>();
       if(data!=null&&data.length>0){
    	   for(int i=0;i<data.length;i++){
    		   Map<String, String> map=new HashMap<String, String>();
    		   map.put("title", data[i]);
    		   list.add(map);
    	   }
    	  
       }
       mListView.setAdapter(new SimpleAdapter(this, list, android.R.layout.simple_list_item_1, 
    		   new String[]{"title"}, new int[]{android.R.id.text1}));
       mListView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			if(arg2==1){
				startActivity(new Intent(MainActivity.this, LoadDialogActivity.class));
			}
			
		}
	});
    }


 
}
