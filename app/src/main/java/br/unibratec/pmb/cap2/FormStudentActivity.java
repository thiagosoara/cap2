package br.unibratec.pmb.cap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.unibratec.pmb.cap2.helpers.FormStudentHelper;
import br.unibratec.pmb.cap2.model.Student;

public class FormStudentActivity extends AppCompatActivity {

    private FormStudentHelper formStudentHelper;
    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);
        formStudentHelper = new FormStudentHelper(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_form_student_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_formulario_ok:
                student = formStudentHelper.getStudent();
                Toast.makeText(FormStudentActivity.this, "Salvo "+student.getName()+"!", Toast.LENGTH_SHORT).show();
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
