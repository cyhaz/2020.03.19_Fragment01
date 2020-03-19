package kr.co.youhyun.a20200319_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import kr.co.youhyun.a20200319_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.firstFragCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                첫 프래그먼트 호출 버튼이 눌리면?
//                firstFrag 보이게 => firstFrag자체는 기능이 별로 없다.
//                => firstFrag를 감싸는 레이아웃을 추가 -> 레이아웃을 visible해서 보이게
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                secondFrag 숨김
                binding.secondFragLayout.setVisibility(View.GONE);
            }
        });

        binding.seondFragCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                첫번째프래그 숨기고, 둘째프래그 나타냄
                binding.firstFragLayout.setVisibility(View.GONE);
                binding.secondFragLayout.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void setValues() {

    }
}
