package kr.co.hanbit.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.hanbit.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
        /* radioGroup 이라는 id를 가진 위젯에 클릭과 같은 변경 사항이 생기면 셍기면
            첫 번째 파라미터에는 변경된 라디오그룹 위젯이, 두 번째 파라미터에는 라디오그룹 안에서 클릭 된 라디오버튼의 id가 전달됨
        */
        when (checkedId) {
            R.id.radioApple -> {
                Log.d("RadioButton", "사과가 선택되었습니다.")
                binding.textView.text = "사과"
            }
            R.id.radioBanana -> {
                Log.d("RadioButton", "바나나가 선택되었습니다.")
                binding.textView.text = "바나나"
            }
            R.id.radioOrange -> {
                Log.d("RadioButton", "오렌지가 선택되었습니다.")
                binding.textView.text = "오렌지"
            }
        }
        }
    }
}