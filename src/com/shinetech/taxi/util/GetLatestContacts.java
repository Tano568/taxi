package com.shinetech.taxi.util;

import java.util.ArrayList;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.map.test.R;

public class GetLatestContacts {

	private String[] nameList;
	private String[] msgList;
	private int[] photoList;
	
	public String[] simulateName()
	{
		nameList = new String[]{"Jerremy", "����", "����"};
		return nameList;
	}
	
	public String[] simulateMsg()
	{
		msgList = new String[]{"��ã�", "Ҫ�ȶ�ã�", ""};
		return msgList;
	}
	
	public int[] simulatePhoto()
	{
		photoList = new int[]{R.drawable.hujintao, R.drawable.self, R.drawable.photo};
		return photoList;
	}
}
