package sg.edu.rp.c346.id18044455.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView moduleCode;
    TextView moduleName;
    TextView acadY;
    TextView sem;
    TextView modCred;
    TextView venue;
    Button gB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleCode = findViewById(R.id.moduleCode);
        moduleName = findViewById(R.id.moduleName);
        acadY = findViewById(R.id.acadY);
        sem = findViewById(R.id.sem);
        modCred = findViewById(R.id.modCred);
        venue = findViewById(R.id.venue);
        gB = findViewById(R.id.buttongB);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");
        if(moduleSelected.equals("B216")){
            moduleCode.setText(R.string.MCCB216);
            moduleName.setText(R.string.MB216);
            acadY.setText(R.string.aY);
            sem.setText(R.string.sE);
            modCred.setText(R.string.mC);
            venue.setText(R.string.vE);
        }
        else if(moduleSelected.equals("C346")){
            moduleCode.setText(R.string.MCCC346);
            moduleName.setText(R.string.MC346);
            acadY.setText(R.string.aY);
            sem.setText(R.string.sE);
            modCred.setText(R.string.mC);
            venue.setText(R.string.vE);
        }
        else if(moduleSelected.equals("C203")){
            moduleCode.setText(R.string.MCCC203);
            moduleName.setText(R.string.MC203);
            acadY.setText(R.string.aY);
            sem.setText(R.string.sE);
            modCred.setText(R.string.mC);
            venue.setText(R.string.vE);
        }
        else if(moduleSelected.equals("C206")){
            moduleCode.setText(R.string.MCCC206);
            moduleName.setText(R.string.MC206);
            acadY.setText(R.string.aY);
            sem.setText(R.string.sE);
            modCred.setText(R.string.mC);
            venue.setText(R.string.vE);
        }
        else if(moduleSelected.equals("C235")){
            moduleCode.setText(R.string.MCCC235);
            moduleName.setText(R.string.MC235);
            acadY.setText(R.string.aY);
            sem.setText(R.string.sE);
            modCred.setText(R.string.mC);
            venue.setText(R.string.vE);
        }

        gB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ModuleDetailActivity.this, MainActivity.class));
            }
        });


    }//end of method
}//end of class
