package com.allimaye.dealornodeal; /**
 * Created by limayea2 on 06/08/2015.
 */
import android.graphics.*;
import android.graphics.Bitmap;
import android.content.Context;

import com.allimaye.dealornodeal.R;
import com.allimaye.dealornodeal.MainActivity;

public class Case {

    private static int caseNumber;
    private static double caseValue;
    private Bitmap caseImg;
    private boolean chosen;

    public Case(int caseNum, double cashVal, Context con)
    {
        this.caseNumber = caseNum;
        this.caseValue = cashVal;
        int imgID = con.getResources().getIdentifier("com.allimaye.dealornodeal.Case"+caseNum+".jpg", "drawable", con.getPackageName());
        this.caseImg = BitmapFactory.decodeResource(con.getResources(), imgID);
    }

    public int getCaseNumber()
    {
        return caseNumber;
    }

    public double getCaseValue()
    {
        return caseValue;
    }

    public void setCaseChosen(boolean chosen)
    {
        this.chosen = chosen;
    }

    public boolean getCaseChosen()
    {
        return this.chosen;
    }




}
