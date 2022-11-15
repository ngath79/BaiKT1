package com.example.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class ListItem extends AppCompatActivity {

    ArrayList<Item> arrayListSubjects = new ArrayList<>();
    AdapterSubjects adapter;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        ListView listview;


        listview = findViewById(R.id.listview);
        arrayListSubjects.add(new Item("1. Kim Seok-jin", "1.Jin", "Hàn Quốc", R.drawable.jin));
        arrayListSubjects.add(new Item("2. Min Yoon-gi", "2.Suga", "Hàn Quốc", R.drawable.sugaaa));
        arrayListSubjects.add(new Item("3. Jung Ho-seok", "3.J-Hope", "Hàn Quốc", R.drawable.jhope));
        arrayListSubjects.add(new Item("4. Kim Nam-joon", "4.RM","Hàn Quốc", R.drawable.rm));
        arrayListSubjects.add(new Item("5. Park Ji-min", "5.Jimin","Hàn Quốc", R.drawable.jmin));
        arrayListSubjects.add(new Item("6. Kim Tae-hyung", "6.V","Hàn Quốc", R.drawable.v));
        arrayListSubjects.add(new Item("7. Jeon Jung-kook", "7.Jungkook","Hàn Quốc", R.drawable.jk));
        arrayListSubjects.add(new Item("8. Nguyễn Hoàng Sơn", "8.Soobin Hoàng Sơn","Việt Nam", R.drawable.soobin));
        arrayListSubjects.add(new Item("9. Vũ Cát Tường", "9.Không có","Việt Nam", R.drawable.vct));
        arrayListSubjects.add(new Item("10. Nguyễn Thanh Tùng", "10.Sơn Tùng MTP","Việt Nam", R.drawable.mtp));
        arrayListSubjects.add(new Item("11. Thiều Bảo Trâm", "11.Không có","Việt Nam", R.drawable.tbt));
        arrayListSubjects.add(new Item("12. Nguyễn Khoa Tóc Tiên", "12.Tóc Tiên","Việt Nam", R.drawable.tt));
        arrayListSubjects.add(new Item("13. Phan Thị Mỹ Tâm", "13.Mỹ Tâm","Việt Nam", R.drawable.mt));
        arrayListSubjects.add(new Item("14. Nguyễn Phước Thịnh", "14.Noo Phước Thịnh","Việt Nam", R.drawable.noo));

        adapter = new AdapterSubjects(ListItem.this, arrayListSubjects);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent();
                    intent.setClass(ListItem.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}