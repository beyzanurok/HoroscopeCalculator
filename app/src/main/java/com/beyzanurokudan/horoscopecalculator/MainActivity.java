package com.beyzanurokudan.horoscopecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //describing
    TextView result;
    EditText birthday;
    EditText birthday4;
    EditText birthday5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enter id
        result = findViewById(R.id.result);
        birthday = findViewById(R.id.birthday);
        birthday4 = findViewById(R.id.birthTime4);
        birthday5 = findViewById(R.id.birthTime5);

    }
    //onclick methods
    public void buttonHoroscope(View view){

        if (birthday.getText().toString().matches("") || birthday4.getText().toString().matches("") || birthday5.getText().toString().matches("")){
            result.setText("Please Enter Correct Value!");
        }else {
            //getting numbers
            int day = Integer.parseInt(birthday4.getText().toString());
            int month = Integer.parseInt(birthday5.getText().toString());
            int year = Integer.parseInt(birthday.getText().toString());

            //result

            String res ;
            String Aries = "Aries";
            String Taurus = "Taurus";
            String Gemini = "Gemini";
            String Cancer = "Cancer";
            String Leo = "Leo";
            String Virgo = "Virgo";
            String Libra = "Libra";
            String Scorpio = "Scorpio";
            String Sagittarius = "Sagittarius";
            String Capricorn ="Capricorn";
            String Aquarius = "Aquarius";
            String Pisces = "Pisces";
            if(month==1){
                if(day<=21){
                    res = Capricorn;
                    result.setText("Result: " + res);
                }else if (day>21){
                    res = Aquarius;
                    result.setText("Result: " + res);
                }
            }else if(month==2){
                if(day<=19){
                    res = Aquarius;
                    result.setText("Result: " + res);
                }else if(day>19){
                    res = Pisces;
                    result.setText("Result: " + res);
                }
            }else if(month==3){
                if(day<=19){
                    res = Pisces;
                    result.setText("Result: " + res);
                }else if(day>19){
                    res = Aries;
                    result.setText("Result: " + res);
                }
            }else if(month==4){
                if(day<=19){
                    res = Aries;
                    result.setText("Result: " + res);
                }else if(day>19){
                    res = Taurus;
                    result.setText("Result: " + res);
                }
            }else if(month==5){
                if(day<=20){
                    res = Taurus;
                    result.setText("Result: " + res);
                }else if(day>20){
                    res = Gemini;
                    result.setText("Result: " + res);
                }
            }else if(month==6){
                if(day<=21){
                    res = Gemini;
                    result.setText("Result: " + res);
                }else if(day>21){
                    res = Cancer;
                    result.setText("Result: " + res);
                }
            }else if(month==7){
                if(day<=22){
                    res = Cancer;
                    result.setText("Result: " + res);
                }else if(day>22){
                    res = Leo;
                    result.setText("Result: " + res);
                }
            }else if(month==8){
                if(day<=22){
                    res = Leo;
                    result.setText("Result: " + res);
                }else if(day>22){
                    res = Virgo;
                    result.setText("Result: " + res);
                }
            }else if(month==9){
                if(day<=22){
                    res = Virgo;
                    result.setText("Result: " + res);
                }else if(day>22){
                    res = Libra;
                    result.setText("Result: " + res);
                }
            }else if(month==10){
                if(day<=22){
                    res =Libra;
                    result.setText("Result: " + res);
                }else if(day>22){
                    res = Scorpio;
                    result.setText("Result: " + res);
                }
            }else if(month==11){
                if(day<=21){
                    res = Scorpio;
                    result.setText("Result: " + res);
                }else if(day>21){
                    res = Sagittarius;
                    result.setText("Result: " + res);
                }
            }else if(month==12){
                if(day<=21){
                    res = Sagittarius;
                    result.setText("Result: " + res);
                }else if(day>21){
                    res = Capricorn;
                    result.setText("Result: " + res);
                }

            }
        }
    }
}