package diplomado.ccm.itesm.practicaservicio;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {


    private Button btnTocar;
    private Button btnDetener;
    private Button btnMensaje;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        this.btnTocar       = (Button) findViewById(R.id.buttonTocar);
        this.btnDetener     = (Button) findViewById(R.id.buttonDetener);
        this.btnMensaje     = (Button) findViewById(R.id.buttonMensaje);

        this.btnTocar.setOnClickListener(this.listenerTocar);
        this.btnDetener.setOnClickListener(this.listenerDetener);
        this.btnMensaje.setOnClickListener(this.listenerMensaje);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private View.OnClickListener listenerTocar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentTocar = new Intent(getBaseContext(),TocaCancionService.class);
            startService(intentTocar);
        }
    };


    private View.OnClickListener listenerDetener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentDetener = new Intent(getBaseContext(),TocaCancionService.class);
            stopService(intentDetener);
        }
    };


    private View.OnClickListener listenerMensaje = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getBaseContext(), "Hola :D", Toast.LENGTH_LONG).show();
        }
    };





    /**Funcionalidad para tocar cancion **/

    public void tocatButton(View view) {

    }

    public void detenerButton(View view) {

    }

    public void mensajeButton(View view) {

    }
}
