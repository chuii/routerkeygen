package org.exobel.routerkeygen;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "dDhYOTFNQlJnLTBJR200Ylhua0wyUkE6MQ")
public class RouterKeygenApplication extends Application {
	@Override
	public void onCreate() {
		try {
			ACRA.init(this);
		} catch (Exception e) {

		}
		super.onCreate();
	}
}