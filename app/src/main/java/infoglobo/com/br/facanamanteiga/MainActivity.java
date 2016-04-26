package infoglobo.com.br.facanamanteiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        myTextView.setText("Alo mundo, butter knife");
    }

    @OnClick(R.id.tryMeButton)
    public void tryMe(View view){
        Timber.d("Ouch button clicked");
        Toast.makeText(this, "Ouch !!!", Toast.LENGTH_LONG).show();

    }
}
