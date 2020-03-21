package com.example.myapplication.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    @BindView(R.id.textView)
    TextView movienametv;
    @BindView(R.id.button)
    Button getmoviename;
    MoviePresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getmoviename.setOnClickListener(this);
        presenter = new MoviePresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button){
            presenter.getmoviename();
        }
    }

    @Override
    public void onGetMovieName(String moviename) {
        movienametv.setText(moviename);
    }
}
