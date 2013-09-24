package eecs481pj1.flipfun;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import android.R.bool;
import android.opengl.Visibility;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity
{
  private ImageButton button00;
  private ImageButton button01;
  private ImageButton button02;
  private ImageButton button03;
  private ImageButton button04;
  private ImageButton button05;
  private ImageButton button06;
  private ImageButton button07;
  private ImageButton button08;
  private ImageButton button09;
  private ImageButton button10;
  private ImageButton button11;
  private ImageButton button12;
  boolean turn = false;





  boolean[] buttonsBools = new boolean[6];
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    for( int i = 0; i < 6; i++ )
    {
      buttonsBools[i] = false;
    }
    button01 = (ImageButton)findViewById(R.id.Button01);
    button02 = (ImageButton)findViewById(R.id.Button02);
    button03 = (ImageButton)findViewById(R.id.Button03);
    button04 = (ImageButton)findViewById(R.id.Button04);
    button05 = (ImageButton)findViewById(R.id.Button05);
    button06 = (ImageButton)findViewById(R.id.Button06);
    button07 = (ImageButton)findViewById(R.id.Button07);
    button08 = (ImageButton)findViewById(R.id.button1);
    button09 = (ImageButton)findViewById(R.id.button2);
    button10 = (ImageButton)findViewById(R.id.button3);
    button11 = (ImageButton)findViewById(R.id.button4);
    button12 = (ImageButton)findViewById(R.id.button5);

    button01.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
          
          if(turn == false){
            turn = true;
            buttonsBools[0] = true;
          }
          else
            turn = false;
            // Perform action on click
          button01.setImageResource(R.drawable.p2);
          //button01.setVisibility(View.GONE);
          if( buttonsBools[0] == true )
          {
            button01.setImageResource(R.drawable.black);
            button12.setImageResource(R.drawable.black);
          }
          
          else if(turn == true){
            button01.setImageResource(R.drawable.p1);
            button12.setImageResource(R.drawable.p1);
          }
        }
    });
    
    button02.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[1] = true;

        }
        else
          turn = false;
          // Perform action on click
        button02.setImageResource(R.drawable.p3);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[1] == true )
        {
          button02.setImageResource(R.drawable.black);
          button11.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button02.setImageResource(R.drawable.p1);
          button11.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button03.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[2] = true;

        }
        else
          turn = false;
          // Perform action on click
        button03.setImageResource(R.drawable.p4);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[2] == true )
        {
          button03.setImageResource(R.drawable.black);
          button10.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button03.setImageResource(R.drawable.p1);
          button10.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button04.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[3] = true;

        }
        else
          turn = false;
          // Perform action on click
        button04.setImageResource(R.drawable.p5);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[3] == true )
        {
          button04.setImageResource(R.drawable.black);
          button09.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button04.setImageResource(R.drawable.p1);
          button09.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button05.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[4] = true;

        }
        else
          turn = false;
          // Perform action on click
        button05.setImageResource(R.drawable.p6);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[4] == true )
        {
          button05.setImageResource(R.drawable.black);
          button08.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button05.setImageResource(R.drawable.p1);
          button08.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button06.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[5] = true;

        }
        else
          turn = false;
          // Perform action on click
        button06.setImageResource(R.drawable.p7);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[5] == true )
        {
          button06.setImageResource(R.drawable.black);
          button07.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button06.setImageResource(R.drawable.p1);
          button07.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button07.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[5] = true;

        }
        
        else
          turn = false;
          // Perform action on click
        button07.setImageResource(R.drawable.p7);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[5] == true )
        {
          button06.setImageResource(R.drawable.black);
          button07.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button06.setImageResource(R.drawable.p1);
          button07.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button08.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[4] = true;

        }
        else
          turn = false;
          // Perform action on click
        button08.setImageResource(R.drawable.p6);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[4] == true )
        {
          button05.setImageResource(R.drawable.black);
          button08.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button05.setImageResource(R.drawable.p1);
          button08.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button09.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[3] = true;

        }
        else
          turn = false;
          // Perform action on click
        button09.setImageResource(R.drawable.p5);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[3] == true )
        {
          button04.setImageResource(R.drawable.black);
          button09.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button04.setImageResource(R.drawable.p1);
          button09.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button10.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[2] = true;

        }
        else
          turn = false;
          // Perform action on click
        button10.setImageResource(R.drawable.p4);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[2] == true )
        {
          button03.setImageResource(R.drawable.black);
          button10.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button03.setImageResource(R.drawable.p1);
          button10.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button11.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false){
          turn = true;
          buttonsBools[1] = true;

        }
        else
          turn = false;
          // Perform action on click
        button11.setImageResource(R.drawable.p3);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[1] == true )
        {
          button02.setImageResource(R.drawable.black);
          button11.setImageResource(R.drawable.black);

        }
        else if(turn == true){
          button02.setImageResource(R.drawable.p1);
          button11.setImageResource(R.drawable.p1);
        }
      }
  });
    
    button12.setOnClickListener(new OnClickListener() {
      public void onClick(View v) {
        if(turn == false)
          turn = true;
        else
          turn = false;
          // Perform action on click
        button12.setImageResource(R.drawable.p2);
        //button01.setVisibility(View.GONE);
        if( buttonsBools[0] == true )
        {
          button01.setImageResource(R.drawable.black);
          button12.setImageResource(R.drawable.black);

        }
        
        else if(turn == true){
          button01.setImageResource(R.drawable.p1);
          button12.setImageResource(R.drawable.p1);
        }
      }
  });
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
