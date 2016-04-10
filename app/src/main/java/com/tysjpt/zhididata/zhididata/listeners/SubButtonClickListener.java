package com.tysjpt.zhididata.zhididata.listeners;

import android.content.Context;
import android.widget.Toast;

import com.nightonke.boommenu.BoomMenuButton;

/**
 * Created by luo on 16-4-9.
 */
public class SubButtonClickListener implements BoomMenuButton.OnSubButtonClickListener {
    private Context context;

    public SubButtonClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(int buttonIndex) {
        Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();
    }
}
