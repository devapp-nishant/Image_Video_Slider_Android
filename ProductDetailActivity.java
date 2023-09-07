package com.hdddekho.thirty.percent.customer.Activities;

import androidx.viewpager2.widget.ViewPager2;

public class ProductDetailActivity extends AppCompatActivity {
    
    private ViewPager2 viewPager;
    
    private MediaSliderAdapter sliderAdapter;
    private final List<MediaItem> mediaItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        viewPager = findViewById(R.id.viewPager);
        

         mediaItems.add(new MediaItem(MediaItem.TYPE_IMAGE,"your app link here" + productList.get(i).getImage1()));
         mediaItems.add(new MediaItem(MediaItem.TYPE_VIDEO,"your app link here" + productList.get(i).getVideo1()));
         mediaItems.add(new MediaItem(MediaItem.TYPE_IMAGE,"your app link here" + productList.get(i).getImage2()));
         mediaItems.add(new MediaItem(MediaItem.TYPE_VIDEO,"your app link here" + productList.get(i).getVideo2()));
         mediaItems.add(new MediaItem(MediaItem.TYPE_IMAGE,"your app link here" + productList.get(i).getImage3()));
         mediaItems.add(new MediaItem(MediaItem.TYPE_IMAGE,"your app link here" + productList.get(i).getImage4()));

         sliderAdapter = new MediaSliderAdapter(ProductDetailActivity.this, mediaItems, viewPager);
         viewPager.setAdapter(sliderAdapter);


}
