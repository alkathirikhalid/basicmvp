package com.alkathirikhalid.basicmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * <p>The Activity or Fragment in MVP: Is the View Implementer.</p>
 * Created by alkathirikhalid on 3/13/2018.
 */
public class BasicActivity extends AppCompatActivity implements BasicView {
    /**
     * Salutation TextView
     */
    private TextView tvSalutation;
    /**
     * The Presenter
     */
    private BasicPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view
        setContentView(R.layout.activity_basic);
        // Find the text view in the layout
        tvSalutation = findViewById(R.id.tvSalutation);

        // Presenter Instance with the implemented View
        presenter = new BasicPresenterImp();
        // Presenter notified onCreate Life cycle
        presenter.onCreate(this);
        // Presenter notified to construct salutation
        presenter.doShowSalutation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Presenter notified onPause Life cycle
        presenter.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Presenter notified onResume Life cycle
        presenter.onResume(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Presenter notified onDestroy Life cycle
        presenter.onDestroy();
    }

    @Override
    public void showSalutation(String salutation) {
        // Show the salutation
        tvSalutation.setText(salutation);
    }

    @Override
    public void showUpdatedSalutation(String salutation) {
        // Show the updated salutation
        tvSalutation.setText(salutation);
    }

    public void onClick(View view) {
        // Presenter notified to construct updated salutation
        presenter.doShowUpdatedSalutation();
    }
}
