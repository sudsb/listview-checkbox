package com.listdemo.z;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.view.*;

public class ListLinearLayout extends LinearLayout implements Checkable
{
	private boolean isCheck=false;
public ListLinearLayout(Context context, AttributeSet attrs){
	super(context,attrs);
} 
	@Override
	public void setChecked(boolean p1)
	{
		// TODO: Implement this method
		if(isCheck!=p1){
			isCheck=p1;
			refreshDrawableState();
			for(int i=0,len=getChildCount();i<len;i++){
				View child=getChildAt(i);
				if(child instanceof Checkable){
					((Checkable) child) .setChecked(p1);
				}
			}
		} 
		
	}

	@Override
	public boolean isChecked()
	{
		// TODO: Implement this method
		return isCheck;
	}

	@Override
	public void toggle()
	{
		// TODO: Implement this method
		setChecked(isCheck);
	}
	
	
}
