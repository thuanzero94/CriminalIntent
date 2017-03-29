package com.example.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by alan on 28/03/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String dateFormat;

    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH).format(mDate);
    }
//Only Getter mId
    public UUID getId() {
        return mId;
    }
//Getter, Setter mTitle
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
//Getter, Setter mDate


    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    //Getter , setter mSolved
    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
