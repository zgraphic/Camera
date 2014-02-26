package ykkim.camera;

import org.apache.cordova.*;

import android.os.Bundle;


public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.clearCache(); 
		super.loadUrl("file:///android_asset/www/main.html"); //웹보기에 URL을로드합니다.
	}

}
