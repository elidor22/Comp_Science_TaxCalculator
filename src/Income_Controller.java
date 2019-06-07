public class Income_Controller {

    public static float tenthpercentage;
    public static  float fifteeenthpercentage;
    public static  float twentyfifthpercentage;
    public static  float twentyeighthpercentage;
    public static  float thirtythreeperc;
    Main main = new Main();
    int fiscal_status = main.fiscal_Status;




    public Income_Controller(){
    first_Status();
    married_seperatly();
    married_jointly();
    head_Household();

    }

    //Single individual filing status
    void first_Status(){
        if(fiscal_status==1){
            tenthpercentage=8350;
            fifteeenthpercentage = 25599;
            twentyfifthpercentage=48299;
            twentyeighthpercentage = 89299;
            thirtythreeperc = 201399;
        }
    }

void married_jointly(){
    if(fiscal_status==2){
        tenthpercentage=16700;
        fifteeenthpercentage = 51199;
        twentyfifthpercentage=69149;
        twentyeighthpercentage = 71799;
        thirtythreeperc = 164099;
    }

}

void married_seperatly(){
    if(fiscal_status==3){
        tenthpercentage=8350;
        fifteeenthpercentage = 25599;
        twentyfifthpercentage=34574;
        twentyeighthpercentage = 35900;
        thirtythreeperc = 82049;
    }

}

void head_Household(){
    if(fiscal_status==4){
        tenthpercentage=11950;
        fifteeenthpercentage = 33549;
        twentyfifthpercentage=71949;
        twentyeighthpercentage = 72749;
        thirtythreeperc = 182749;
    }

}


}
