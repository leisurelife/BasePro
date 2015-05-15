package com.leisure.loaddialog.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;

import com.leisure.loaddialog.R;

public class LoadingDialog extends Dialog{
	public LoadingDialog(Context context, int theme) {
		super(context, theme);
		// TODO Auto-generated constructor stub
	}

	private static LoadingDialog mLoadingDialog=null;
	public LoadingDialog(Context context) {
		super(context);
	}
	
	public static LoadingDialog createDialog(Context context){
		mLoadingDialog=new LoadingDialog(context,R.style.CustomDialog);
		mLoadingDialog.setContentView(R.layout.loadingdialog);
		mLoadingDialog.getWindow().getAttributes().gravity = Gravity.CENTER;
		return mLoadingDialog;
	}

	public void onWindowFocusChanged(boolean hasFocus){
    	
    	if (mLoadingDialog == null){
    		return;
    	}
    	
        ImageView imageView = (ImageView) mLoadingDialog.findViewById(R.id.loadingImageView);
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
    }
	
	public LoadingDialog setTitile(String strTitle){
    	return mLoadingDialog;
    }
	public LoadingDialog setMessage(String strMessage){
    	TextView tvMsg = (TextView)mLoadingDialog.findViewById(R.id.id_tv_loadingmsg);
    	
    	if (tvMsg != null){
    		tvMsg.setText(strMessage);
    	}
    	
    	return mLoadingDialog;
    }
}
