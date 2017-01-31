package br.unibratec.pmb.cap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);

        Button btSave = (Button)findViewById(R.id.bt_save_form_student);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormStudentActivity.this, "Salvo!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
