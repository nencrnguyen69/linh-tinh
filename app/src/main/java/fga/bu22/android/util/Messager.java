package fga.bu22.android.util;

import android.os.Message;

import fga.bu22.android.home.controller.EditTimeTableController;

/**
 * Created by VuDuc on 4/23/2018.
 */

public class Messager {

    public Messager(){

    }

    public void editTimeTableMessager(EditTimeTableController controller, int what, Object obj){
        Message message = new Message();
        message.what = what;
        message.obj = obj;
        controller.sendMessage(message);
    }
}