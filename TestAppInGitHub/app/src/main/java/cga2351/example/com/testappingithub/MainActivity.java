package cga2351.example.com.testappingithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_test_button1)
    Button btnTestButton1;
    @BindView(R.id.btn_test_button2)
    Button btnTestButton2;
    @BindView(R.id.btn_test_button3)
    Button btnTestButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_test_button1, R.id.btn_test_button2, R.id.btn_test_button3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_test_button1:
                break;
            case R.id.btn_test_button2:
                break;
            case R.id.btn_test_button3:
                break;
        }
    }
}
