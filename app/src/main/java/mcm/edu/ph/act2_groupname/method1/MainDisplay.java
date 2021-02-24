package mcm.edu.ph.act2_groupname.method1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.act2_groupname.R;

public class MainDisplay extends AppCompatActivity implements View.OnClickListener{

    TextView textDisplay;
    Button btn1,btn2;
    int con=0;
    int con1, con1a;
    String conditionsMain = "You are playing a MOBA game and you are in a 1v1 situation with an enemy and when the enemy got to low health the enemy tried to escape. What would you do?" +
            " Will you chase the enemy?";
    String txtdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindisplay);

        btn1 = findViewById(R.id.btnyes);
        btn2 = findViewById(R.id.btnno);
        textDisplay = findViewById(R.id.txtDisplay);

        textDisplay.setText(conditionsMain);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        textDisplay = findViewById(R.id.txtDisplay);

        switch(v.getId()){
            case R.id.btnyes:
                if (con > 0 && con1 > 0) { // a hacky condition to catch the 3rd condition layer,
                    con1a=1; //upon the 3rd condition layer, pushing button 1 sets your outcome to first choice
                    btn1.setEnabled(false); //disabling all the buttons after the final outcome
                    btn2.setEnabled(false);
                    break; //break allows us to catch the condition without actually being caught by other conditions below
                }
                if(con > 0){con1= 1;break;}
                if(con == 0){con=1;}
                break;

            case R.id.btnno:
                if (con > 0 && con1 > 0) {
                    con1a=2;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    break;}
                if(con > 0){con1= 2;break;}
                if(con == 0){con=2;}
                break;
        }

        //The if-then conditions for storybuilding. Modify as you see fit.
        if(con==1){
            txtdialog = "You chased the enemy and the enemy activated a skill that made his character move faster. Will you also activate your skill that makes your character move faster in order to close the gap between you and your enemy?";
            if(con1== 1){
                txtdialog = "You are closing in on your enemy and your enemy enters a blind spot. Will you still chase the enemy?";
                if(con1a == 1){
                    txtdialog = "You followed the enemy and got killed by his 2 other teammates waiting in the blind spot.";
                }
                else if(con1a == 2){
                    txtdialog = "You stopped following your enemy and realized that you saved your life because you saw 2 other enemies waiting for you in the blind spot.";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 1 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "One of your teammates chased and killed the enemy that you were chasing. You noticed that one of your teammates has a low health and is being chased by an enemy. Will you go to your teammate and save him? ";
                if (con1a == 1) {
                    txtdialog = "You saved your teammate in the last second and you killed the enemy that was chasing your teammate.";

                } else if (con1a == 2) {
                    txtdialog = "Your teammate got killed and the enemy that killed your teammate was able to go back to his base and buy an item which made his character a lot stronger which caused your team to lose.";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 2-3 should appear here";

                } else if (con1a == 4) {
                    txtdialog = "Dialog for condition 1 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 1 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 1 branch 3-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 1 branch 3-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 3-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 3-4 should appear here";
                }
            }
            else if(con1 == 4){
                txtdialog = "Dialog for condition 1 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 1 branch 4-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 1 branch 4-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 1 branch 4-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 1 branch 4-4 should appear here";

                }
            }
        }

        else if(con==2){
            txtdialog = "Your enemy escaped and 2 of his teammates are now chasing you. Will you try to escape?";
            if(con1== 1){
                txtdialog = "You are now running and you see a blind spot where 3 of your teammates are hiding and waiting for you to come. Will you go to your teammates?";
                if(con1a == 1){
                    txtdialog = "You were able to go back to your base and your teammates were able to kill the enemies who were chasing you.";

                }
                else if(con1a == 2){
                    txtdialog = "You ran to the opposite side where you don't have any teammates and your enemies were able to find and kill your teammates that were hiding in the blind spot.";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 2 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "You are now in a 1v2 situation where your chances of winning are very low and you received a lot of damage which putted you in a critical situation. You noticed that your teammates are now running to your location in order to save you. Will you run to your teammates?";
                if (con1a == 1) {
                    txtdialog = "Your teammates were able to save you and kill the enemies that were trying to kill you.";

                } else if (con1a == 2) {
                    txtdialog = "You got killed and your teammates were able to kill 1 of the enemies that killed you while the other enemy escaped.";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 2-3 should appear here";

                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 2-4 should appear here";

                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 2 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 2 branch 3-1 should appear here";

                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 2 branch 3-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 3-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 2 branch 3-4 should appear here";

                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 2 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 2 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 2 branch 4-2 should appear here";

                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 2 branch 4-3 should appear here";

                } else if (con1a == 4) {
                    txtdialog = "Dialog for condition 2 branch 4-4 should appear here";
                }
            }
        }

        else if(con==3){
            txtdialog = "Dialog for condition 3 Main Branch should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 3 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 3 branch 1-1 should appear here";
                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 3 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 3 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 3 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 2-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 2-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 2-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 3 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 3-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 3-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 3-3 should appear here";
                } else if (con1a == 3){
                    txtdialog = "Dialog for condition 3 branch 3-4 should appear here";
                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 3 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 3 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 3 branch 4-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 3 branch 4-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 3 branch 4-4 should appear here";
                }
            }
        }
        else if(con == 4){
            txtdialog = "Dialog for condition 4 Main Branch should appear here";
            if(con1== 1){
                txtdialog = "Dialog for condition 4 branch 1 should appear here";
                if(con1a == 1){
                    txtdialog = "Dialog for condition 4 branch 1-1 should appear here";
                }
                else if(con1a == 2){
                    txtdialog = "Dialog for condition 4 branch 1-2 should appear here";
                }
                else if(con1a == 3){
                    txtdialog = "Dialog for condition 4 branch 1-3 should appear here";
                }
                else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 1-4 should appear here";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Dialog for condition 4 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 2-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 2-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 2-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 2-4 should appear here";
                }
            }
            else if(con1 == 3){
                txtdialog = "Dialog for condition 4 branch 2 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 3-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 3-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 3-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 3-4 should appear here";
                }
            }
            else if (con1 == 4){
                txtdialog = "Dialog for condition 4 branch 4 should appear here";
                if (con1a == 1) {
                    txtdialog = "Dialog for condition 4 branch 4-1 should appear here";
                } else if (con1a == 2) {
                    txtdialog = "Dialog for condition 4 branch 4-2 should appear here";
                } else if (con1a == 3) {
                    txtdialog = "Dialog for condition 4 branch 4-3 should appear here";
                } else if (con1a == 4){
                    txtdialog = "Dialog for condition 4 branch 4-4 should appear here";
                }
            }
        }
        textDisplay.setText(txtdialog);
    }
}