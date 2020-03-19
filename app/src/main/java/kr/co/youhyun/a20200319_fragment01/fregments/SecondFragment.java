package kr.co.youhyun.a20200319_fragment01.fregments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import kr.co.youhyun.a20200319_fragment01.R;
import kr.co.youhyun.a20200319_fragment01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding = null;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginId = binding.loginIdEdt.getText().toString();
                String loginPw = binding.loginPwEdt.getText().toString();
                String rightId = "admin";
                String rightPw = "asdf1234";
                boolean idOk = false;
                boolean pwOk = false;
                if (loginId == rightId){
                    idOk = true;
                    if (loginPw == rightPw){
                        pwOk = true;
                    } else {
                        pwOk = false;
                    }
                } else {
                    if (loginPw == rightPw){
                        pwOk = true;
                    } else {

                    }
                }

                if (idOk && pwOk) {
                    Toast.makeText(getActivity(), "관리자 로그인!", Toast.LENGTH_SHORT).show();
                } else if (idOk && !pwOk){
                    Toast.makeText(getActivity(), "비밀번호가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                } else if (!idOk && pwOk) {
                    Toast.makeText(getActivity(), "아이디가 틀렸습니다.", Toast.LENGTH_SHORT).show();
                } else  {
                    Toast.makeText(getActivity(), "잘못된 사용자 정보입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}



