package com.example.reversestring;
/*
 * 4190010
 * Muhammad Syaman
 * Sistem Informasi		(jurusan)
 * Pemrograman Mobile	(konsentrasi)
 * for UTS Pemrograman Mobile II (BONTA ZIRVIERA CIRGON, S.KOM., M.Kom.)
 */

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    
    public void actionProcess (View v){
    	EditText textNama = (EditText) this.findViewById(R.id.txtNama);
    	TextView viewNama = (TextView) this.findViewById(R.id.viewNama);
    	
    	StringBuffer c = new StringBuffer(textNama.getText().toString());
    	
    	viewNama.setText("Result : " + c.reverse());
    	
    }
    
    public void actionClear (View v){
    	EditText clearNama = (EditText) this.findViewById(R.id.txtNama);
    	TextView clearView = (TextView) this.findViewById(R.id.viewNama);
    	
    	clearNama.getText().clear();
    	clearView.setText("Result di sini");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
}
