package com.dfl9.appgallery;

import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alertNotify(View view){
        Snackbar sna = Snackbar.make(view,R.string.alert,Snackbar.LENGTH_LONG).
                setAction("RECUPERAR", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(v.getContext(),R.string.alert_send_email,Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
        View vi = sna.getView();
        vi.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        sna.show();
    }
}
