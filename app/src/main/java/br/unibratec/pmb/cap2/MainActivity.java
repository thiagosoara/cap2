package br.unibratec.pmb.cap2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] alunos = {"Thiago", "Amanda", "Nelson", "Joao", "Fernando", "Davi"};
        ListView lvAlunos = (ListView) findViewById(R.id.lv_students);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);

        lvAlunos.setAdapter(adapter);

        Button btNewStudent = (Button)findViewById(R.id.bt_new_student);
        btNewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, FormStudentActivity.class );
                startActivity(it);
            }
        });
    }
}
