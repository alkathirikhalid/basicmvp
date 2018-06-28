package com.alkathirikhalid.basicmvp;

/**
 * <p>The Presenter Interface in MVP: Is an interface that Presenter implements.</p>
 * <p>It is used by the View implementer inorder to communicate to the Presenter on updates needed
 * for the Presenter to function properly such as Life-Cycle events.</p>
 * Created by alkathirikhalid on 3/13/2018.
 */

public interface BasicPresenter {
    /**
     * Constructs Salutation
     */
    void doShowSalutation();

    /**
     * Constructs updated Salutation
     */
    void doShowUpdatedSalutation();

    /**
     * On Create Lif-Cycle Event
     */
    void onCreate(BasicView view);

    /**
     * On Pause Lif-Cycle Event
     */
    void onPause();

    /**
     * On Resume Lif-Cycle Event
     */
    void onResume(BasicView view);

    /**
     * On Destroy Lif-Cycle Event
     */
    void onDestroy();
}
