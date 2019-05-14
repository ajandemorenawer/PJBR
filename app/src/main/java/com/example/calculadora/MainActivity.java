package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView tv_num1;
    private TextView tv_operacion;
    private TextView tv_num2;
    private TextView tv_igual;
    private TextView tv_resul;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button button_suma;
    private Button button_resta;
    private Button button_multi;
    private Button button_divi;
    private Button button_punto;
    private Button button_igual;
    private Boolean puedo_escribir_en_tv1 = Boolean.TRUE;
    private Boolean puedo_elegir_operacion = Boolean.FALSE;
    private Boolean puedo_escribir_en_tv2 = Boolean.FALSE;
    private Boolean puedo_elegir_igual = Boolean.FALSE;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_num1=(TextView)findViewById(R.id.tv_num1);
        tv_num2=(TextView)findViewById(R.id.tv_num2);
        tv_operacion=(TextView)findViewById(R.id.tv_operacion);
        tv_igual=(TextView)findViewById(R.id.tv_igual);
        tv_resul=(TextView)findViewById(R.id.tv_resul);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button0=(Button)findViewById(R.id.button0);
        button_suma=(Button)findViewById(R.id.button_suma);
        button_resta=(Button)findViewById(R.id.button_resta);
        button_multi=(Button)findViewById(R.id.button_multi);
        button_divi=(Button)findViewById(R.id.button_divi);
        button_punto=(Button)findViewById(R.id.button_punto);
        button_igual=(Button)findViewById(R.id.button_igual);

    }

    public void sumar (View view){
        if (puedo_elegir_operacion){
            tv_operacion.setText("+");
            puedo_elegir_operacion = Boolean.FALSE;
            puedo_escribir_en_tv2 = Boolean.TRUE;
        }
    }

    public void restar (View view){
        if (puedo_elegir_operacion){
            tv_operacion.setText("-");
            puedo_elegir_operacion = Boolean.FALSE;
            puedo_escribir_en_tv2 = Boolean.TRUE;
        }
    }

    public void multiplicar (View view){
        if (puedo_elegir_operacion){
            tv_operacion.setText("*");
            puedo_elegir_operacion = Boolean.FALSE;
            puedo_escribir_en_tv2 = Boolean.TRUE;
        }
    }

    public void dividir (View view){
        if (puedo_elegir_operacion){
            tv_operacion.setText("/");
            puedo_elegir_operacion = Boolean.FALSE;
            puedo_escribir_en_tv2 = Boolean.TRUE;
        }
    }

///////////   N U M E R O S   //////////////

    public void num1 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("1");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            if (puedo_escribir_en_tv2){
                tv_num2.setText("1");
                puedo_elegir_igual = Boolean.TRUE;
            }
        }
    }

    public void num2 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("2");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            tv_num2.setText("2");
            puedo_elegir_igual = Boolean.TRUE;
        }
    }

    public void num3 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("3");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            if (puedo_escribir_en_tv2){
                tv_num2.setText("3");
                puedo_elegir_igual = Boolean.TRUE;
            }
        }
    }

    public void num4 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("4");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            tv_num2.setText("4");
            puedo_elegir_igual = Boolean.TRUE;
        }
    }

    public void num5 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("5");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            if (puedo_escribir_en_tv2){
                tv_num2.setText("5");
                puedo_elegir_igual = Boolean.TRUE;
            }
        }
    }

    public void num6 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("6");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            tv_num2.setText("6");
            puedo_elegir_igual = Boolean.TRUE;
        }
    }

    public void num7 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("7");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            if (puedo_escribir_en_tv2){
                tv_num2.setText("7");
                puedo_elegir_igual = Boolean.TRUE;
            }
        }
    }

    public void num8 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("8");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            tv_num2.setText("8");
            puedo_elegir_igual = Boolean.TRUE;
        }
    }

    public void num9 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("9");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            if (puedo_escribir_en_tv2){
                tv_num2.setText("9");
                puedo_elegir_igual = Boolean.TRUE;
            }
        }
    }

    public void num0 (View view){
        if (puedo_escribir_en_tv1){
            tv_num1.setText("0");
            puedo_escribir_en_tv1=Boolean.FALSE;
            puedo_elegir_operacion=Boolean.TRUE;
        } else {
            tv_num2.setText("0");
            puedo_elegir_igual = Boolean.TRUE;
        }
    }

    public void igual (View view){
        if (puedo_elegir_igual){
            String num1_str = tv_num1.getText().toString();
            String num2_str = tv_num2.getText().toString();
            int    num1_int = Integer.parseInt(num1_str);
            int    num2_int = Integer.parseInt(num1_str);
            String operacion = tv_operacion.getText().toString();
            int    resultado_int=0;
            String resultado_str="";
            switch(operacion){
                case "+" : {
                    resultado_int = num1_int + num2_int;
                    break;
                }
                case "-" : {
                    resultado_int = num1_int - num2_int;
                    break;
                }
                case "*" : {
                    resultado_int = num1_int * num2_int;
                    break;
                }
                case "/" : {
                    resultado_int = num1_int / num2_int;
                    break;
                }
            }
            resultado_str = String.valueOf(resultado_int);
            tv_resul.setText(resultado_str);
        }
    }

}
