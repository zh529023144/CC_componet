package com.xinghuo.cc.cityface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.bn_go_face)
    Button bnGoFace;
    @BindView(R.id.bn_go_control)
    Button bnGoControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        Button go = findViewById(R.id.bn_go);
//        go.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
////
//
//
//            }
//        });


    }

    @OnClick({R.id.bn_go_face, R.id.bn_go_control})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bn_go_face:
                CCResult result = CC.obtainBuilder("ComponentFace")
                        .setActionName("showActivity")
                        .build()
                        .call();
                break;
            case R.id.bn_go_control:
                CCResult result2 = CC.obtainBuilder("ComponentControl")
                        .setActionName("showActivity")
                        .build()
                        .call();
                break;
        }
    }
}
