package com.lbsim.shreya.student;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Divanshu Rohatgi on 12-03-2017.
 */

public class DbHelper  extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "CIQuiz";


    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option d
    private SQLiteDatabase dbase;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT , "+KEY_OPTD+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    private void addQuestions()
    {
        Question q1=new Question("Q1. If 7(x - y) = 343 and 7(x + y) = 16807, what is the value of x?","4","3","2","1","4");
        this.addQuestion(q1);
        Question q2=new Question("Q2. A hat vendor bought hats at Rs 5 per 3 hats. He sold them at Rs 10 per 4 hats. What was his profit percentage?",
                "25","30","45","50","50");
        this.addQuestion(q2);
        Question q3=new Question("Q3. The  sum  of  n  terms  of  a  series  in  A.P  is  6n2 + 6n.  What  is  the  4 th  term  of  the  series?",
                "38","49","60","48","48");
        this.addQuestion(q3);
        Question q4=new Question("Q4. At 15:15 pm railway time, what will be the angle between minute and hour hand?",
                "0 deg","180 deg","360 deg","None","360 deg");
        this.addQuestion(q4);
        Question q5=new Question("Q5. Some numbers of bags were bought at Rs.4992 per dozen and sold at 18 bags for Rs.8208. What is the approximate gain or loss percent?",
                "9.6% gain","9.6% loss","10.9% gain","10.9% loss","9.6% gain");
        this.addQuestion(q5);
        Question q6=new Question("Q6. The  5 th  term   and  21 st  term  of  a  series  in  A.P  are  10  and  42  respectively.   Find  the  31 st  term",
                "50","55","62","65","62");
        this.addQuestion(q6);
        Question q7=new Question("Q7. The  sum  of  the  first  eight  terms  of  a  geometric  series  is  10,001  times   the  sum  of  its  four  terms .  Find  the  common  ratio  of  these  series",
                "1000","10","100","1","10");
        this.addQuestion(q7);
        Question q8=new Question("Q8. A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?",
                "45%","45.5%","55%","54.8%","45.5%");
        this.addQuestion(q8);
        Question q9=new Question("Q9. If (p:q) = 3:2 then 5(p2 + q2):(p2 - q2) is:",
                "13:1","5:1","13:5","5:13","13:1");
        this.addQuestion(q9);
        Question q10=new Question("Q10. How many 3-digit numbers satisfy the following property: Last digit of cube of the 3-digit number is 6 ?",
                "90","10","100","None","10");
        this.addQuestion(q10);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));

                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }
    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}

