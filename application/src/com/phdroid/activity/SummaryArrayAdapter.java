package com.phdroid.activity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.phdroid.dao.DaoObject;

import java.util.List;

/**
 * Array Adapter for Events and Tasks.
 */
public class SummaryArrayAdapter extends ArrayAdapter<DaoObject>{
	protected Activity ctx;
	protected int mViewId;
	protected LayoutInflater mInflater;

	public SummaryArrayAdapter(Activity context, int textViewResourceId) {
		super(context, textViewResourceId);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	public SummaryArrayAdapter(Activity context, int resource, int textViewResourceId) {
		super(context, resource, textViewResourceId);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	public SummaryArrayAdapter(Activity context, int textViewResourceId, DaoObject[] objects) {
		super(context, textViewResourceId, objects);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	public SummaryArrayAdapter(Activity context, int resource, int textViewResourceId, DaoObject[] objects) {
		super(context, resource, textViewResourceId, objects);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	public SummaryArrayAdapter(Activity context, int textViewResourceId, List<DaoObject> objects) {
		super(context, textViewResourceId, objects);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	public SummaryArrayAdapter(Activity context, int resource, int textViewResourceId, List<DaoObject> objects) {
		super(context, resource, textViewResourceId, objects);
		ctx = context;
		mViewId = textViewResourceId;
		mInflater = ctx.getLayoutInflater();
	}

	@Override
	public long getItemId(int i) {
		return getItem(i).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
//		SmsViewHolder holder;
//		if (convertView == null) {
//			convertView = mInflater.inflate(mViewId, null);
//			holder = new SmsViewHolder();
//			holder.sender = (TextView) convertView.findViewById(R.id.senderTextView);
//			holder.received = (TextView) convertView.findViewById(R.id.receivedTimeTextView);
//			holder.message = (TextView) convertView.findViewById(R.id.messageTextView);
//			holder.arrow = (ReadableImageView) convertView.findViewById(R.id.arrow);
//
//			convertView.setTag(holder);
//		} else {
//			holder = (SmsViewHolder) convertView.getTag();
//		}
//
//		SmsPojo sms = this.getItem(position);
//		holder.sender.setText(sms.getSender());
//		if (holder.arrow != null) {
//			holder.arrow.setRead(sms.isRead());
//		}
//		holder.received.setText(DateUtilities.getRelativeDateString(sms, ctx));
//		holder.message.setText(sms.getMessage());
//
//		int style = sms.isRead() ? R.style.read_message : R.style.title_text_non_read_message;
//		holder.sender.setTextAppearance(ctx, style);
//
//		return (convertView);
		return null;
	}
}
