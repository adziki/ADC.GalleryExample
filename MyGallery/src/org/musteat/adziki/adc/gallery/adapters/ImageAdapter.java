package org.musteat.adziki.adc.gallery.adapters;

import android.widget.*;
import android.view.*;
import android.database.*;
import java.util.*;
import android.graphics.drawable.*;
import android.content.*;
import org.musteat.adziki.adc.gallery.*;

public class ImageAdapter implements ListAdapter
{

	private ArrayList<Drawable> mImages;
	private Context mContext;
	
	public ImageAdapter(Context c, ArrayList<Drawable> images){
		mContext=c;
		mImages = new ArrayList<Drawable>(images);
	}
	@Override
	public void registerDataSetObserver(DataSetObserver p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver p1)
	{
		// TODO: Implement this method
	}

	@Override
	public int getCount()
	{
		// TODO: Implement this method
		return mImages.size();
	}

	@Override
	public Object getItem(int p1)
	{
		// TODO: Implement this method
		return mImages.get(p1);
	}

	@Override
	public long getItemId(int p1)
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public boolean hasStableIds()
	{
		// TODO: Implement this method
		return false;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO: Implement this method
		return mImages==null || mImages.size()==0;
	}

	@Override
	public boolean areAllItemsEnabled()
	{
		// TODO: Implement this method
		return true;
	}

	@Override
	public boolean isEnabled(int p1)
	{
		// TODO: Implement this method
		return true;
	}
	

	@Override
	public View getView(int p1, View p2, ViewGroup p3)
	{
		if(p2 == null){
		    p2 = LayoutInflater.from(mContext).inflate(R.layout.item_image, p3, false);
			//view holder
			ViewHolder vh = new ViewHolder((ImageView)p2.findViewById(R.id.image),(Drawable)getItem(p1), p1); 
			
		}
		// TODO: Implement this method
		return null;
	}

	@Override
	public int getViewTypeCount()
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public int getItemViewType(int p1)
	{
		// TODO: Implement this method
		return 0;
	}

private class ViewHolder{
	
	public ImageView mImageView;
	public Drawable mDrawable;
	public int mIndex=-1;
	
	public ViewHolder(ImageView iView,
	                  Drawable drawable, int index){
		mImageView=iView;
		mDrawable=drawable;
		mIndex=index;
    }
}

	
}
