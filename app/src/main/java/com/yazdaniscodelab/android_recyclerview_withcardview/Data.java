package com.yazdaniscodelab.android_recyclerview_withcardview;

/**
 * Created by Yazdani on 5/4/2017.
 */

public class Data {


    public Data(int image_re,String f_name,String l_name){

        this.setImage_re(image_re);
        this.setF_name(f_name);
        this.setL_name(l_name);

    }



    public int image_re;
    public String f_name;
    public String l_name;


    public int getImage_re(){
        return image_re;
    }

    public void setImage_re(int image_re){
        this.image_re=image_re;
    }

    public String getF_name(){
        return f_name;
    }

    public void setF_name(String f_name){
        this.f_name=f_name;
    }

    public String getL_name(){
        return l_name;
    }

    public void setL_name(String l_name){
        this.l_name=l_name;
    }


}
