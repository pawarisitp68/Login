package cake.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin")&&pass.getText().toString().equals("1234")){
                    Intent B1=new Intent(MainActivity.this,page2.class);
                    startActivity(B1);
                }else {
                    Toast.makeText(getApplicationContext(),"รหัสผ่านไม่ถูกต้อง",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
