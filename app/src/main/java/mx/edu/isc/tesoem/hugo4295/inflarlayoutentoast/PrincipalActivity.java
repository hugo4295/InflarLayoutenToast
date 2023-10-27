package mx.edu.isc.tesoem.hugo4295.inflarlayoutentoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PrincipalActivity extends AppCompatActivity {
    //private TextView n1, n2, n3, m;

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn1 = findViewById(R.id.btnM);





        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrincipalActivity.this.PersonalizaToast();
            }
        });
    }

    private void PersonalizaToast(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla,(ViewGroup) this.findViewById(R.id.grupo_temp) );
        //para leer elementos dentro del layaout debemos invocar la variable de view y despues los elementos
        //n1 = vi.findViewById(R.id.n1);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL,10,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(vi);
        toast.show();
    }
}