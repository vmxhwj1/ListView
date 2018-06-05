package pk.co.kr.a0515listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pk.co.kr.a0515listview.R;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml 파일에 디자인 한 뷰 찾아오기
        listView = (ListView) findViewById(R.id.listView);

        //출력할 데이터 만들기
        String [] dataStructure =
                {"Array","ArrayList","LinkedList","List","Set","Map","Stack","Queue","Deque","Tree"};

        //ListView에 데이터를 출력할 수 있는 Adapter 객체 만들기
        //첫번째 매개변수는 Context(화면 출력을 위한 정보를 갖는 객체 - Activity의 주소)
        //두번째 매개변수는 ListView에 데이터를 출력할 때의 모양
        //세번째 매개변수는 실제 출력될 데이터 배열이나 List
        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dataStructure);
        */
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
          this, R.array.algorithm, android.R.layout.simple_list_item_1);
        //데이터 출력 - 데이터를 연결하면 화면에 출력됩니다.
        listView.setAdapter(adapter);


    }
}