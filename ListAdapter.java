package com.listdemo.z;
import android.widget.*;
import android.content.*;
import java.util.*;
import android.view.*;
import com.listdemo.z.Views;
public class ListAdapter extends ArrayAdapter<Views>
{
	private int itemId;
	public ListAdapter(Context context,int itemId,List<Views> Object){
	super(context,itemId,Object);
	this.itemId=itemId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		// TODO: Implement this method
		Views views=getItem(position);
		View view;
		ViewHolder viewHolder;
		if(convertView==null){
			view=LayoutInflater.from(getContext()).inflate(itemId,parent,false);
			viewHolder=new ViewHolder();
			viewHolder.listText=(TextView) view.findViewById(R.id.listTView);
			viewHolder.listBox=(CheckBox) view.findViewById(R.id.lisBox);
			view.setTag(viewHolder);
		}else{
			view=convertView;
			viewHolder=(ViewHolder) view.getTag();
		}
		viewHolder.listText.setText(views.getListText());
		return view;
	}
	
}
class ViewHolder{
	TextView listText;
	CheckBox listBox;
}
