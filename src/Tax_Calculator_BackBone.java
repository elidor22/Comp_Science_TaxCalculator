
public class Tax_Calculator_BackBone {
    public double to_Pay;
    Main main = new Main();
    public float income = main.user_Income;
    Income_Controller controller = new Income_Controller();
    float tenthpercentage = controller.tenthpercentage;
    float fifteeenthpercentage=controller.fifteeenthpercentage;
    float twentyfifthpercentage=controller.twentyfifthpercentage;
    float twentyeighthpercentage=controller.twentyeighthpercentage;
    float thirtythreeperc=controller.thirtythreeperc;


    Tax_Calculator_BackBone(){
    Payment_Controller();

    }

    void Payment_Controller(){
        if(income<=8350) {
            to_Pay = income*0.10;
        }
        if(income<=33950&&income>8350){
        to_Pay = tenthpercentage*0.10+(income-tenthpercentage)*0.15;
        }
        if(income>33950&&income<=82250){
            to_Pay = tenthpercentage*0.10+fifteeenthpercentage*0.15
                    +(income-tenthpercentage-fifteeenthpercentage)*0.25;
        }
        if(income>82250&&income<=171550){
            to_Pay = tenthpercentage*0.10+fifteeenthpercentage*0.15+twentyfifthpercentage*0.25
                    +(income-tenthpercentage-fifteeenthpercentage-twentyfifthpercentage)*0.28;
        }
        if(income > 171550&&income<=372950){
            to_Pay = tenthpercentage*0.10+fifteeenthpercentage*0.15+twentyfifthpercentage*0.25+twentyeighthpercentage*0.28
                    +(income-tenthpercentage-fifteeenthpercentage-twentyfifthpercentage-twentyeighthpercentage)*0.33;
        }
        if (income>372950){
            to_Pay = tenthpercentage*0.10+fifteeenthpercentage*0.15+twentyfifthpercentage*0.25+twentyeighthpercentage*0.28+thirtythreeperc*0.33
                    +(income-tenthpercentage-fifteeenthpercentage-twentyfifthpercentage-twentyeighthpercentage-thirtythreeperc)*0.35;
        }
    }


    }

