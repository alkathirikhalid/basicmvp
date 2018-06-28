package com.alkathirikhalid.basicmvp;

/**
 * <p>The Model in MVP: Is a whole Model Layer, that consists of Entities and DAO.</p>
 * <p>It takes requests from the Presentation layer, and request it from the Model Layer,
 * then pass it back to the presentation layer.</p>
 * Created by alkathirikhalid on 3/13/2018.
 */

public class BasicModel {
    /**
     * An Array consisting of salutations
     */
    private String[] salutation = {"Good Morning!", "Good Afternoon!", "Good Evening!", "Good Night!"};

    /**
     * A public getter method
     *
     * @return salutation
     */
    public String getSalutation() {
        return salutation[(int) (Math.random() * salutation.length)];
    }
}
