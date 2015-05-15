package com.leisure.basesample.view.activity;

import com.leisure.base.view.LoadingDialog;
import com.leisure.basesample.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LoadDialogActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		findViewById(R.id.bt).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				LoadingDialog.createDialog(LoadDialogActivity.this).show();
			}
		});
	}
}
