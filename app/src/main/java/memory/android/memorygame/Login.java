package memory.android.memorygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txtusername=findViewById(R.id.etUsername);
        final EditText txtpassword=findViewById(R.id.etPassword);

        Button btnlogin=findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtusername.getText().length()==0 || txtpassword.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"Enter your usename and password",Toast.LENGTH_SHORT).show();
                }
                else{

                        Toast.makeText(getApplicationContext(),txtusername.getText()+ "Login Accepted",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        finish();

                }
            }
        });
    }
}
