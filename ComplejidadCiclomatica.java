public class ComplejidadCiclomatica{
  public void metodoPrueba(int x , string y){
    if(x>0 && x<10){
      y = y + "Esta entre 0 y 10 ";
    }else if (x<0 || x>11){
      y = y + "x es negativo o quizas mayor a 11";
    }
  }
}
