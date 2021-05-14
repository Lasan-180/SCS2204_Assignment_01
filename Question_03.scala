object Question_03 extends App{
  
  def wholesalecost(num:Int)={
    if(num<=50){

      val x = num*24.95;
      val y = x*60/100;
      val wsc = y+3;
      println(wsc);
    
    }else{

      val x = num-50;
      val y = num*24.95;
      val t = y*60/100;
      val z = x*0.75;
      val wsc = t+3+z;
      println(wsc);

    }

  

};
  wholesalecost(60);


}
