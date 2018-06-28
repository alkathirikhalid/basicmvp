package com.alkathirikhalid.basicmvp;

/**
 * <p>The View in MVP: Is an interface that holds the methods which changes the UI.</p>
 * Created by alkathirikhalid on 3/13/2018.
 */

public interface BasicView {
    /**
     * Show Salutation
     *
     * @param salutation greeting
     */
    void showSalutation(String salutation);

    /**
     * Show Update Salutation
     *
     * @param salutation updated greeting
     */
    void showUpdatedSalutation(String salutation);
}
