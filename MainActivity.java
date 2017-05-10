package com.listdemo.z;

import android.app.*;
import android.os.*;
import java.util.*;
import com.listdemo.z.Views;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	private List<Views> listView=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		initview();
		ListAdapter listAdapter=new ListAdapter(MainActivity.this,R.layout.lis_view,listView);
		final ListView list=(ListView) findViewById(R.id.mListView1);
		final CheckBox all_cbx=(CheckBox) findViewById(R.id.mCheckBox);
		list.setAdapter(listAdapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

				@Override
				public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4)
				{
					// TODO: Implement this method
					Views vs=listView.get(p3);
					
				}
			});
		all_cbx.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					if(all_cbx.isChecked()){
						for(int i=0; i<listView.size();i++){
							list.setItemChecked(i,true);
						}
					}else{
						for(int i=0; i<listView.size();i++){
							list.setItemChecked(i,false);
						}
					}
				}
			});
    }

	private void initview()
	{
		// TODO: Implement this method
		for(int i=0;i<50;i++){
			Views vs=new Views("第"+i+"章 :" ) ;
			listView.add(vs);
		}
		
	}
}
