package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
            btnDecimalPoint, btnPlus, btnSub, btndiv, btnMulti, btnEquals,
             btnAllClear, btnPercentage, btnBack, btnPlusOrMinus;

    private EditText editText1;
    private float input1, input2;
    boolean add, sub, div, multi, percentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        //calling listeners
        btnOne.setOnClickListener(new btnOneCLickListener());
        btnTwo.setOnClickListener(new btnTwoCLickListener());
        btnThree.setOnClickListener(new btnThreeCLickListener());
        btnFour.setOnClickListener(new btnFourCLickListener());
        btnFive.setOnClickListener(new btnFiveClickListener());
        btnSix.setOnClickListener(new btnSixCLickListener());
        btnSeven.setOnClickListener(new btnSevenCLickListener());
        btnEight.setOnClickListener(new btnEightCLickListener());
        btnNine.setOnClickListener(new btnNineCLickListener());
        btnZero.setOnClickListener(new btnZeroCLickListener());
        btnPlus.setOnClickListener(new btnPlusClickListener());
        btnSub.setOnClickListener(new btnSUbClickListener());
        btnMulti.setOnClickListener(new btnMultiClickListener());
        btndiv.setOnClickListener(new btnDivClickListener());
        btnEquals.setOnClickListener(new btnEqualsOnClickListener());
        btnAllClear.setOnClickListener(new btnAllCLearClickListener());
        btnDecimalPoint.setOnClickListener(new btnDecimalpointClcikListener());
        btnBack.setOnClickListener(new btnBackClickListener());
        btnPercentage.setOnClickListener(new btnPecClickListener());
    }

    private void initUI() {
        btnEquals = findViewById(R.id.btnEquals);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDecimalPoint = findViewById(R.id.btnDecimalPoint);
        btnZero = findViewById(R.id.btnZero);
        btnPlus = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btndiv = findViewById(R.id.btnDiv);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnBack = findViewById(R.id.btnBack);
        btnPlusOrMinus = findViewById(R.id.btnPlusOrminus);
        btnAllClear = findViewById(R.id.btnAllCLear);
        btnEquals = findViewById(R.id.btnEquals);

        editText1 = findViewById(R.id.edtText1);


    }

    private class btnOneCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "1");
        }
    }

    private class btnTwoCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "2");
        }
    }

    private class btnThreeCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "3");

        }
    }

    private class btnFourCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "4");
        }
    }


    private class btnFiveClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "5");
        }
    }

    private class btnSixCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "6");
        }
    }

    private class btnSevenCLickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "7");
        }
    }

    private class btnEightCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "8");
        }
    }

    private class btnNineCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "9");
        }
    }

    private class btnZeroCLickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + "0");
        }
    }

    private class btnDecimalpointClcikListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText(editText1.getText() + ".");
        }
    }


    private class btnSUbClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (editText1 == null) {
                editText1.setText("");
            } else {
                input1 = Float.parseFloat(editText1.getText() + "");
                sub = true;
                editText1.setText(null);
            }
        }
    }

    private class btnPlusClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (editText1 == null) {
                editText1.setText("");
            } else {
                input1 = Float.parseFloat(editText1.getText() + "");
                add = true;
                editText1.setText(null);
            }
        }
    }

    private class btnMultiClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (editText1 == null) {
                editText1.setText("");
            } else {
                input1 = Float.parseFloat(editText1.getText() + "");
                multi = true;
                editText1.setText(null);
            }
        }
    }

    private class btnDivClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (editText1 == null) {
                editText1.setText("");
            } else {
                input1 = Float.parseFloat(editText1.getText() + "");

                div = true;
                editText1.setText(null);
            }
        }
    }

    //All clear button code
    private class btnAllCLearClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            editText1.setText("");
        }
    }

    //listener for back button
    private class btnBackClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String str = editText1.getText().toString();
            if (str.length() > 1) {
                str = str.substring(0, str.length() - 1);
                editText1.setText(str);
            } else if (str.length() <= 1) {
                editText1.setText("0");
            }
        }
    }

    private class btnEqualsOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            input2 = Float.parseFloat(editText1.getText() + "");
            if (add == true) {
                editText1.setText(input1 + input2 + "");
                add = false;
            }
            if (sub) {
                editText1.setText(input1 - input2 + "");
                sub = false;
            }
            if (div) {
                editText1.setText(input1 / input2 + "");
                div = false;
            }
            if (multi) {
                editText1.setText(input1 * input2 + "");
                multi = false;
            }
            if (percentage) {
                editText1.setText((input1 * input2) / 100 + "");
                percentage = false;
            }


        }
    }

    private class btnPecClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            input1 = Float.parseFloat(editText1.getText() + "");

            percentage = true;
            editText1.setText(null);
        }
    }
}

//implemented simple calculator
//improvization: it is crshing after second tap
//implementing +/-

