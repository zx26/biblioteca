package com.chucho.biblioastro;
import android.content.*;
import java.util.*;
import android.widget.*;
import android.view.*;
import android.graphics.*;

public class ExpandableListAdapter extends BaseExpandableListAdapter
{
	private Context context;
	private List<String> expandableTitleList;
	private HashMap<String,List<String>> expandableDetailList;
	
	public ExpandableListAdapter(Context context,List<String> expandableListTitle,
	                             HashMap<String,List<String>> expandableListDetail){
		this.context=context;
		this.expandableTitleList=expandableListTitle;
		this.expandableDetailList=expandableListDetail;
	}

	@Override
	public Object getChild(int lstPosn, int expanded_ListPosition)
	{
		// TODO: Implement this method
		return this.expandableDetailList.get(this.expandableTitleList.get(lstPosn)).get(expanded_ListPosition);
	}

	@Override
	public long getChildId(int listPosition, int expanded_ListPosition)
	{
		
		return expanded_ListPosition;
	}

	@Override
	public View getChildView(int lstPosition, int expanded_ListPosition, 
	                         boolean isLastChild, View convertView, ViewGroup parent)					 
	{ 
	    final String expanded_ListText=(String)getChild(lstPosition,expanded_ListPosition);
		if(convertView==null){
			LayoutInflater layoutInflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView=layoutInflater.inflate(R.layout.list_item,null);
		}
		TextView expandedListView=(TextView)convertView.findViewById(R.id.expandedListItem);
	    expandedListView.setText(expanded_ListText);
		return convertView;
	}

	@Override
	public int getChildrenCount(int listPosition)
	{
	    
		return this.expandableDetailList.get(this.expandableTitleList.get(listPosition)).size();
	}

	@Override
	public Object getGroup(int listPosition)
	{
		
		return this.expandableTitleList.get(listPosition);
	}

	@Override
	public int getGroupCount()
	{
		
		return this.expandableTitleList.size();
	}

	@Override
	public long getGroupId(int listPosition)
	{
		
		return listPosition;
	}

	@Override
	public View getGroupView(int listPosition, boolean isExpanded, View convertView, ViewGroup parent)
	{
	    String listTitle=(String)getGroup(listPosition);
		if(convertView==null){
			LayoutInflater layoutInflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView=layoutInflater.inflate(R.layout.list_group,null);
			
		}
		
		TextView listTextView=(TextView)convertView.findViewById(R.id.listTitle);
		listTextView.setTypeface(null,Typeface.BOLD);
		listTextView.setText(listTitle);
		return convertView;
	}

	@Override
	public boolean hasStableIds()
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean isChildSelectable(int listPosition, int expandedListPosition)
	{
		// TODO: Implement this method
		return true;
	}
	
}
