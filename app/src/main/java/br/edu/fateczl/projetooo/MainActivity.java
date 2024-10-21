package br.edu.fateczl.projetooo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.edu.fateczl.projetooo.model.Professor;
import br.edu.fateczl.projetooo.model.ProfessorHorista;
import br.edu.fateczl.projetooo.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbTitular;

    private RadioButton rbHorista;

    private EditText etHoras;

    private EditText etAnos;

    private Button btnCalc;

    private TextView tvSalario;

    private Professor prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbTitular = findViewById(R.id.rbTitular);
        rbTitular.setChecked(true);
        rbHorista = findViewById(R.id.rbHorista);
        etHoras = findViewById(R.id.etHoras);
        etAnos = findViewById(R.id.etAnos);
        btnCalc = findViewById(R.id.btnCalc);
        tvSalario = findViewById(R.id.tvSalario);

        btnCalc.setOnClickListener(op -> calc());
    }

    private void calc() {

        //int horas = Integer.parseInt(etHoras.getText().toString());
        if(rbTitular.isChecked()) {
            prof = new ProfessorTitular();

        }

        if(rbHorista.isChecked()) {
            prof = new ProfessorHorista();
            int horas = Integer.parseInt(etHoras.getText().toString());

        }

        double sal = prof.calcSalario();


    }
}