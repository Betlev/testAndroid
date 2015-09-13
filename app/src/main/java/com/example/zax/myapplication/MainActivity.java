package com.example.zax.myapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {
    private EditText txtNombre,txtPwd;
    private Button btnAceptar;
    protected Intent intent;
    protected Bundle b;
    /*private class bdconn extends AsyncTask<String, Integer, String> {
        private String result="";
        @Override
        protected void onPreExecute(){
            //setContentView(R.layout.activity_saludo);

        }
        @Override
        protected String doInBackground(String... Params){
            try{
                HttpClient httpcli = new DefaultHttpClient();
                HttpPost post = new HttpPost("http://84.123.2.192/tareas/androidusers/login");
                String usr = Params[0];
                String pwd = Params[1];
                JSONObject json = new JSONObject();
                json.put("usuario",usr.toString());
                json.put("passwd", pwd.toString());
                StringEntity entidad =new StringEntity(json.toString());
                post.setEntity(entidad);
                HttpResponse respuesta = httpcli.execute(post);
                result = EntityUtils.toString(respuesta.getEntity());
                //falta por programar la recepcion de la respuesta que se le enviara al intent para la siguiente ventana
            }
            catch(Exception e) {
                result = e.getMessage();
            }
            return result;
        }
        @Override
        protected void onPostExecute(String result){
            b.putString("NOMBRE", result.toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    }*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TareaDB dbHelper = new TareaDB(this,"DBtarea",null,1);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        //se crean las cajas de texto editable nombre y pwd
        txtNombre = (EditText)findViewById(R.id.TxtNombre);
        txtPwd = (EditText)findViewById(R.id.TxtPwd);
        //se crea boton de aceptar ->REFERENCIAS EN res/layout/activity_main y res/AndroidManifest
        btnAceptar = (Button)findViewById(R.id.BtnAceptar);
        //listener del evento onClick
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //preparamos el intent -> la nueva "ventana" de la app
                intent = new Intent(MainActivity.this, saludo.class);
                //preparamos bundle ->conjunto de datos a enviar a la nueva ventana
                b = new Bundle();
                //se instancia la tarea asincrona
               // bdconn bd = new bdconn();
               // bd.execute(txtNombre.getText().toString(),txtPwd.getText().toString());




            }
        });
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
}
