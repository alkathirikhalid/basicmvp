package com.alkathirikhalid.basicmvp;

/**
 * <p>The Presenter in MVP: Is where the initialization, logic, clean up and communication between
 * View and Model takes place.</p>
 * Created by alkathirikhalid on 3/13/2018.
 */

public class BasicPresenterImp implements BasicPresenter {
    /**
     * The View
     */
    private BasicView view;
    /**
     * The Model
     */
    private BasicModel model;

    @Override
    public void doShowSalutation() {
        // Show initial salutation
        view.showSalutation(model.getSalutation());
    }

    @Override
    public void doShowUpdatedSalutation() {
        // Show updated salutation
        view.showUpdatedSalutation("Update: " + model.getSalutation());
    }

    @Override
    public void onCreate(BasicView view) {
        // onCreate Life Cycle Event
        model = new BasicModel();
        this.view = view;
    }

    @Override
    public void onPause() {
        // onPause Life Cycle Event
        model = null;
        view = null;
    }

    @Override
    public void onResume(BasicView view) {
        // onResume Life Cycle Event
        model = new BasicModel();
        this.view = view;
    }

    @Override
    public void onDestroy() {
        // onDestroy Life Cycle Event
        model = null;
        view = null;
    }
}
