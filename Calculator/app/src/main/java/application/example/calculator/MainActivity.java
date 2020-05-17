package application.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Double num1, num2;
    int flag;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        TextView txtMain = (TextView)findViewById(R.id.txtMain);

        switch (v.getId()) {
            case R.id.btn0 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("0");
                break;

            case R.id.btn1 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("1");
                break;

            case R.id.btn2 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("2");
                break;

            case R.id.btn3 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("3");
                break;

            case R.id.btn4 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("4");
                break;

            case R.id.btn5 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("5");
                break;

            case R.id.btn6 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("6");
                break;

            case R.id.btn7 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("7");
                break;

            case R.id.btn8 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("8");
                break;

            case R.id.btn9 :
                if(flag == 1) {
                    txtMain.setText("");
                }
                txtMain.append("9");
                break;

            case R.id.btnClear :
                txtMain.setText("");
                break;

            case R.id.btnPlus :
                num1 = Double.parseDouble(txtMain.getText()+"");
                Log.i("Num1", num1+"");
                txtMain.setText("");
                op = '+';
                break;
                
            case R.id.btnMinus :
                num1 = Double.parseDouble(txtMain.getText()+"");
                txtMain.setText("");
                op = '-';
                break;
                
            case R.id.btnInto :
                num1 = Double.parseDouble(txtMain.getText()+"");
                txtMain.setText("");
                op = '*';
                break;
                
            case R.id.btnDivide :
                num1 = Double.parseDouble(txtMain.getText()+"");
                txtMain.setText("");
                op = '/';
                break;
            
            case R.id.btnDecimal :
                if(!txtMain.getText().toString().contains(".")) {
                    txtMain.append(".");
                }
                break;

            case R.id.btnEquals :
                num2 = Double.parseDouble(txtMain.getText()+"");
                Double res;
                switch(op) {
                    case '+' :
                        res = num1 + num2;
                        break;
                    case '-' :
                        res = num1 - num2;
                        break;
                    case '*' :
                        res = num1 * num2;
                        break;
                    case '/' :
                        res = num1 / num2;
                        break;
                    default :
                        res = num1 + num2;

                }
                txtMain.setText(res+"");
                num1 = 0.0;
                flag = 1;
                break;

            case R.id.btnBack :
                String text = txtMain.getText().toString();
                txtMain.setText(text.substring(0,text.length()-1));
        }
    }
}
