package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity {
// @Override
// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
//setContentView(R.layout.activity_main);//布局路径
//System.out.println("onCreate");
//  }
//@Override
//protected void onStart() {
// super.onStart();
//System.out.println("onStart");
//}
// @Override
// protected void onResume() {
// super.onResume();
// System.out.println("onResume");
// }
// @Override
// protected void onPause() {
//super.onPause();
// System.out.println("onPause");
//  }
// @Override
// protected void onStop() {
// super.onStop();
// System.out.println("onStop");
// }
// @Override
// protected void onRestart() { //重启
// super.onRestart();
//  System.out.println("onRestart");
// }
// @Override
// protected void onDestroy() { //结束
//super.onDestroy();
//     System.out.println("onDestroy");
//  }
// }


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.second);//颜色手机
               setContentView(R.layout.activity_main);//设置界面布局setContentView，指明路径在哪设置布局(R.layout.activity_main布局文件)
    }
    int size=30;
    public void bigger(View v){     // 按钮对应的 onclick 响应
        TextView txv;
        txv= (TextView) findViewById(R.id.nihao);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);       // 修改对象的字符大小-size
    }

    public void display(View v){     // 另外一个按钮对应的 onclick 响应
        EditText name= (EditText) findViewById(R.id.hello);  //还是根据ID找到对象，并进行接下来的操作
        TextView text2= (TextView) findViewById(R.id.nihao);

        text2.setText(name.getText().toString());   // 设置字符
  }
}
