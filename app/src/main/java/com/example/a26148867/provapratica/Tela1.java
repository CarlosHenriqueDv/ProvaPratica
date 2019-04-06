package com.example.a26148867.provapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tela1 extends AppCompatActivity {
    private TextView salarioAntigo;
    private RadioButton rdb1;
    private RadioButton rdb2;
    private RadioButton rdb3;
    private Button calculo;
    private double acrescimo;
    double aux;
    private double novoSalario;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        editNome (salarioAntigo) = findViewById(R.id.txt_salario);

        rdb1 = findViewById(R.id.rdb_perc1);
        rdb2 = findViewById(R.id.rdb_perc2);
        rdb3 = findViewById(R.id.rdb_perc3);
        calculo = findViewById(R.id.btn_calc);

         calculo.setOnClickListener(new View.OnClickListener());

        Intent e = new Intent(getApplicationContext(),activity_tela2.class);
        SalarioAntigo = Double.parseDouble(salarioAntigo.getText().toString());

        if(rdb1.isChecked()){
            aumento = aux*(40/100);
            e.putExtra("valor","Novo salário: "+(novoSalario+SalarioAntigo));


        }
        else{
            if(rdb2.isChecked()){
                novoSalario = aux*(45/100);
                e.putExtra("valor","Novo salário: "+(novoSalario+SalarioAntigo));

            }
            else{
                if(rdb3.isChecked()){
                    novoSalario = aux*(50/100);
                    inte.putExtra("valor","Novo salário: "+(novoSalario+SalarioAntigo));

                }
                startActivity(e);


    }


}
    private void startActivity() {

        }
    }