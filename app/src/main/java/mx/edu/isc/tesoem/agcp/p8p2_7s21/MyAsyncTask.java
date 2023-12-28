package mx.edu.isc.tesoem.agcp.p8p2_7s21;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MyAsyncTask extends AsyncTask<Void, Integer, Void> {

    private ProgressBar progressBar;
    private Context context;

    public MyAsyncTask(ProgressBar progressBar, Context context) {
        this.progressBar = progressBar;
        this.context = context;
    }

    @Override
    protected Void doInBackground(Void... params) {
        int totalProgress = 100;
        for (int i = 0; i <= totalProgress; i++) {
            publishProgress(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int progress = values[0];
        progressBar.setProgress(progress);
    }

    @Override
    protected void onPostExecute(Void result) {
        // Tarea en segundo plano completada
        Toast.makeText(context, "Completada", Toast.LENGTH_SHORT).show();
    }
}

