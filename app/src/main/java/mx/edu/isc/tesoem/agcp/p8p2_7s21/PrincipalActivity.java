package mx.edu.isc.tesoem.agcp.p8p2_7s21;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.os.Bundle;

public class PrincipalActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        progressBar = findViewById(R.id.progressBar);

        MyAsyncTask myAsyncTask = new MyAsyncTask(progressBar, this);
        myAsyncTask.execute();
    }
}