package com.dfl9.appgallery;

import android.content.Intent;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private   EditText user;
    private   EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.editUser);
        pass = findViewById(R.id.editPass);

    }
    public void alertNotify(View view){
        Snackbar sna = Snackbar.make(view,R.string.alert,Snackbar.LENGTH_LONG).
                setAction(R.string.act_snack, new View.OnClickListener() {
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
    public  void  validateLog(View view){
        String usr = user.getText().toString();
        String pss = pass.getText().toString();

        if (pss.equals("") ||  usr.equals("")) {
            Toast toast = Toast.makeText(view.getContext(),R.string.alert_log,Toast.LENGTH_LONG);
            toast.show();
        }else {
            Intent paso = new Intent(this,GalleryActivity.class);
            startActivity(paso);
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Metodos","Este es el metodo Actividad LogIn onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Metodos","Este es el metodo Actividad LogIn onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Metodos","Este es el metodo Actividad LogIn onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Metodos","Este es el metodo Actividad LogIn onDestroy");
    }
}
