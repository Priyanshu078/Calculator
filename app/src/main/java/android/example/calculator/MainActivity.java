package android.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Boolean add = false;
    Boolean sub = false;
    Boolean mul = false;
    Boolean div = false;
    float num1;
    float num2;
    Boolean number1click = false;
    Boolean number2click = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number1 = (TextView) findViewById(R.id.num1);
        TextView number2 = (TextView) findViewById(R.id.num2);
        TextView answer = (TextView) findViewById(R.id.answer);
        Button buttonclear = (Button) findViewById(R.id.Clear);
        Button buttonAnswer = (Button) findViewById(R.id.Answer);
        Button button0 = (Button) findViewById(R.id.Number0);
        Button button1 = (Button) findViewById(R.id.Number1);
        Button button2 = (Button) findViewById(R.id.Number2);
        Button button3 = (Button) findViewById(R.id.Number3);
        Button button4 = (Button) findViewById(R.id.Number4);
        Button button5 = (Button) findViewById(R.id.Number5);
        Button button6 = (Button) findViewById(R.id.Number6);
        Button button7 = (Button) findViewById(R.id.Number7);
        Button button8 = (Button) findViewById(R.id.Number8);
        Button button9 = (Button) findViewById(R.id.Number9);
        Button buttondecimal = (Button) findViewById(R.id.dot);
        Button buttonadd = (Button) findViewById(R.id.add);
        Button buttondelete = (Button) findViewById(R.id.delete);
        Button buttondivide = (Button) findViewById(R.id.div);
        Button buttonmultiply = (Button) findViewById(R.id.mul);
        Button buttonsubtract = (Button) findViewById(R.id.sub);


        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                number1.setText("");
                number2.setText("");
                answer.setText("Answer: "+"");
            }
        });

        buttonAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                if (add){
                    num2 = Float.parseFloat(number2.getText().toString());
                    float sum = num1 + num2;
                    answer.setText(answer.getText() + String.valueOf(sum));
                    add = false;
                }
                if (sub){
                    num2 = Float.parseFloat(number2.getText().toString());
                    float subtract = num1 - num2;
                    answer.setText(answer.getText() + String.valueOf(subtract));
                    sub = false;
                }
                if (mul){
                    num2 = Float.parseFloat(number2.getText().toString());
                    float multiply = num1 * num2;
                    answer.setText(answer.getText() + String.valueOf(multiply));
                    mul = false;
                }
                if (div){
                    num2 = Float.parseFloat(number2.getText().toString());
                    float divide = num1 / num2;
                    answer.setText(answer.getText() + String.valueOf(divide));
                    div = false;
                }
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                add = true;
            }
        });

        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                sub = true;
            }
        });

        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                mul = true;
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                div = true;
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1click = true;
                if (number1click){
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "0");
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "1");
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "2");
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "3");
                        }
                    });
                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "4");
                        }
                    });
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "5");
                        }
                    });
                    button6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "6");
                        }
                    });
                    button7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "7");
                        }
                    });
                    button8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "8");
                        }
                    });
                    button9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number1.setText(number1.getText() + "9");
                        }
                    });
                    buttondecimal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(number1.getText().length() >= 1){
                                number1.setText(number1.getText() + ".");
                            }
                        }
                    });
                    buttondelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                String text1 = number1.getText().toString();
                                number1.setText(text1.substring(0, text1.length() - 1));
                            }catch(Exception e){
                                Toast toast = Toast.makeText(MainActivity.this, "Text area is empty", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                    });

                }
                number2click = false;
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2click = true;
                if (number2click){
                    button0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            number2.setText(number2.getText() + "0");
                        }
                    });
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "1");
                        }
                    });
                    button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "2");
                        }
                    });
                    button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "3");
                        }
                    });
                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "4");
                        }
                    });
                    button5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "5");
                        }
                    });
                    button6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "6");
                        }
                    });
                    button7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "7");
                        }
                    });
                    button8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "8");
                        }
                    });
                    button9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            number2.setText(number2.getText() + "9");
                        }
                    });
                    buttondelete.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                String text2 = number2.getText().toString();
                                number2.setText(text2.substring(0, text2.length() - 1));
                            }catch(Exception e){
                                Toast toast = Toast.makeText(MainActivity.this,"Text area is empty",Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                    });
                    buttondecimal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (number2.getText().length() >= 1) {
                                number2.setText(number2.getText() + ".");
                            }
                        }
                    });
                }
                number1click = false;
            }
        });
    }
}
