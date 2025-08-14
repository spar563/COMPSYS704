import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int S1972 = 1;
  private int S656 = 1;
  private int S654 = 1;
  private int S4 = 1;
  private int S118 = 1;
  private int S106 = 1;
  private int S135 = 1;
  private int S123 = 1;
  private int S152 = 1;
  private int S140 = 1;
  private int S169 = 1;
  private int S157 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread2002(int [] tdone, int [] ends){
        S169=1;
    S157=0;
    if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
      S157=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
      currsigs.addElement(armDest);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2001(int [] tdone, int [] ends){
        S152=1;
    S140=0;
    if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread2000(int [] tdone, int [] ends){
        S135=1;
    S123=0;
    if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
      S123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
      currsigs.addElement(armSource);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1999(int [] tdone, int [] ends){
        S118=1;
    S106=0;
    if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
      S106=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
      currsigs.addElement(pusherExtend);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread1997(int [] tdone, int [] ends){
        S169=1;
    S157=0;
    if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
      S157=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
      currsigs.addElement(armDest);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1996(int [] tdone, int [] ends){
        S152=1;
    S140=0;
    if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1995(int [] tdone, int [] ends){
        S135=1;
    S123=0;
    if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
      S123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
      currsigs.addElement(armSource);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1994(int [] tdone, int [] ends){
        S118=1;
    S106=0;
    if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
      S106=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
      currsigs.addElement(pusherExtend);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread1992(int [] tdone, int [] ends){
        switch(S169){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S157){
          case 0 : 
            if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
              S157=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
              currsigs.addElement(armDest);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S157=1;
            S157=0;
            if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
              S157=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
              currsigs.addElement(armDest);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1991(int [] tdone, int [] ends){
        switch(S152){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S140){
          case 0 : 
            if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
              S140=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
              currsigs.addElement(vacOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S140=1;
            S140=0;
            if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
              S140=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
              currsigs.addElement(vacOn);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1990(int [] tdone, int [] ends){
        switch(S135){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S123){
          case 0 : 
            if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
              S123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
              currsigs.addElement(armSource);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S123=1;
            S123=0;
            if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
              S123=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
              currsigs.addElement(armSource);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1989(int [] tdone, int [] ends){
        switch(S118){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S106){
          case 0 : 
            if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
              S106=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
              currsigs.addElement(pusherExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S106=1;
            S106=0;
            if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
              S106=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
              currsigs.addElement(pusherExtend);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1987(int [] tdone, int [] ends){
        S169=1;
    S157=0;
    if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
      S157=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
      currsigs.addElement(armDest);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1986(int [] tdone, int [] ends){
        S152=1;
    S140=0;
    if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1985(int [] tdone, int [] ends){
        S135=1;
    S123=0;
    if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
      S123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
      currsigs.addElement(armSource);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1984(int [] tdone, int [] ends){
        S118=1;
    S106=0;
    if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
      S106=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
      currsigs.addElement(pusherExtend);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread1982(int [] tdone, int [] ends){
        S169=1;
    S157=0;
    if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
      S157=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
      currsigs.addElement(armDest);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1981(int [] tdone, int [] ends){
        S152=1;
    S140=0;
    if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1980(int [] tdone, int [] ends){
        S135=1;
    S123=0;
    if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
      S123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
      currsigs.addElement(armSource);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1979(int [] tdone, int [] ends){
        S118=1;
    S106=0;
    if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
      S106=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
      currsigs.addElement(pusherExtend);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread1977(int [] tdone, int [] ends){
        S169=1;
    S157=0;
    if(!armDestM.getprestatus()){//sysj\controller.sysj line: 95, column: 28
      S157=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      armDest.setPresent();//sysj\controller.sysj line: 96, column: 13
      currsigs.addElement(armDest);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1976(int [] tdone, int [] ends){
        S152=1;
    S140=0;
    if(!vacOnM.getprestatus()){//sysj\controller.sysj line: 88, column: 28
      S140=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
    else {
      vacOn.setPresent();//sysj\controller.sysj line: 89, column: 13
      currsigs.addElement(vacOn);
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread1975(int [] tdone, int [] ends){
        S135=1;
    S123=0;
    if(!armSourceM.getprestatus()){//sysj\controller.sysj line: 81, column: 28
      S123=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      armSource.setPresent();//sysj\controller.sysj line: 82, column: 13
      currsigs.addElement(armSource);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread1974(int [] tdone, int [] ends){
        S118=1;
    S106=0;
    if(!pusherExtendM.getprestatus()){//sysj\controller.sysj line: 74, column: 28
      S106=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
    else {
      pusherExtend.setPresent();//sysj\controller.sysj line: 75, column: 13
      currsigs.addElement(pusherExtend);
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S1972){
        case 0 : 
          S1972=0;
          break RUN;
        
        case 1 : 
          S1972=2;
          S1972=2;
          S656=0;
          if(mode.getprestatus()){//sysj\controller.sysj line: 19, column: 14
            S654=0;
            if(!empty.getprestatus()){//sysj\controller.sysj line: 20, column: 15
              System.out.println("Auto mode");//sysj\controller.sysj line: 21, column: 11
              if(request.getprestatus()){//sysj\controller.sysj line: 22, column: 22
                S4=0;
                armDest.setPresent();//sysj\controller.sysj line: 25, column: 22
                currsigs.addElement(armDest);
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S654=1;
                System.out.println("Manual mode");//sysj\controller.sysj line: 72, column: 11
                thread1974(tdone,ends);
                thread1975(tdone,ends);
                thread1976(tdone,ends);
                thread1977(tdone,ends);
                int biggest1978 = 0;
                if(ends[2]>=biggest1978){
                  biggest1978=ends[2];
                }
                if(ends[3]>=biggest1978){
                  biggest1978=ends[3];
                }
                if(ends[4]>=biggest1978){
                  biggest1978=ends[4];
                }
                if(ends[5]>=biggest1978){
                  biggest1978=ends[5];
                }
                if(biggest1978 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            }
            else {
              S654=1;
              System.out.println("Manual mode");//sysj\controller.sysj line: 72, column: 11
              thread1979(tdone,ends);
              thread1980(tdone,ends);
              thread1981(tdone,ends);
              thread1982(tdone,ends);
              int biggest1983 = 0;
              if(ends[2]>=biggest1983){
                biggest1983=ends[2];
              }
              if(ends[3]>=biggest1983){
                biggest1983=ends[3];
              }
              if(ends[4]>=biggest1983){
                biggest1983=ends[4];
              }
              if(ends[5]>=biggest1983){
                biggest1983=ends[5];
              }
              if(biggest1983 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
          }
          else {
            S656=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          switch(S656){
            case 0 : 
              switch(S654){
                case 0 : 
                  switch(S4){
                    case 0 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 24, column: 24
                        S4=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armDest.setPresent();//sysj\controller.sysj line: 25, column: 22
                        currsigs.addElement(armDest);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S4=1;
                      S4=2;
                      pusherExtend.setPresent();//sysj\controller.sysj line: 31, column: 22
                      currsigs.addElement(pusherExtend);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 2 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 30, column: 24
                        S4=3;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 31, column: 22
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      S4=3;
                      S4=4;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 4 : 
                      S4=4;
                      S4=5;
                      armSource.setPresent();//sysj\controller.sysj line: 43, column: 22
                      currsigs.addElement(armSource);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 5 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 42, column: 24
                        S4=6;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 43, column: 22
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      S4=6;
                      S4=7;
                      vacOn.setPresent();//sysj\controller.sysj line: 49, column: 22
                      currsigs.addElement(vacOn);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 7 : 
                      if(WPgripped.getprestatus()){//sysj\controller.sysj line: 48, column: 24
                        S4=8;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        vacOn.setPresent();//sysj\controller.sysj line: 49, column: 22
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 8 : 
                      S4=8;
                      S4=9;
                      armDest.setPresent();//sysj\controller.sysj line: 55, column: 22
                      currsigs.addElement(armDest);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 9 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 54, column: 24
                        S4=10;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armDest.setPresent();//sysj\controller.sysj line: 55, column: 22
                        currsigs.addElement(armDest);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 10 : 
                      S4=10;
                      S4=11;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 11 : 
                      S4=11;
                      S4=12;
                      armSource.setPresent();//sysj\controller.sysj line: 67, column: 22
                      currsigs.addElement(armSource);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                    case 12 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 66, column: 24
                        S654=1;
                        System.out.println("Manual mode");//sysj\controller.sysj line: 72, column: 11
                        thread1984(tdone,ends);
                        thread1985(tdone,ends);
                        thread1986(tdone,ends);
                        thread1987(tdone,ends);
                        int biggest1988 = 0;
                        if(ends[2]>=biggest1988){
                          biggest1988=ends[2];
                        }
                        if(ends[3]>=biggest1988){
                          biggest1988=ends[3];
                        }
                        if(ends[4]>=biggest1988){
                          biggest1988=ends[4];
                        }
                        if(ends[5]>=biggest1988){
                          biggest1988=ends[5];
                        }
                        if(biggest1988 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 67, column: 22
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                  }
                  break;
                
                case 1 : 
                  if(!mode.getprestatus()){//sysj\controller.sysj line: 71, column: 16
                    S656=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread1989(tdone,ends);
                    thread1990(tdone,ends);
                    thread1991(tdone,ends);
                    thread1992(tdone,ends);
                    int biggest1993 = 0;
                    if(ends[2]>=biggest1993){
                      biggest1993=ends[2];
                    }
                    if(ends[3]>=biggest1993){
                      biggest1993=ends[3];
                    }
                    if(ends[4]>=biggest1993){
                      biggest1993=ends[4];
                    }
                    if(ends[5]>=biggest1993){
                      biggest1993=ends[5];
                    }
                    if(biggest1993 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest1993 == 0){
                      S656=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              S656=1;
              S656=0;
              if(mode.getprestatus()){//sysj\controller.sysj line: 19, column: 14
                S654=0;
                if(!empty.getprestatus()){//sysj\controller.sysj line: 20, column: 15
                  System.out.println("Auto mode");//sysj\controller.sysj line: 21, column: 11
                  if(request.getprestatus()){//sysj\controller.sysj line: 22, column: 22
                    S4=0;
                    armDest.setPresent();//sysj\controller.sysj line: 25, column: 22
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S654=1;
                    System.out.println("Manual mode");//sysj\controller.sysj line: 72, column: 11
                    thread1994(tdone,ends);
                    thread1995(tdone,ends);
                    thread1996(tdone,ends);
                    thread1997(tdone,ends);
                    int biggest1998 = 0;
                    if(ends[2]>=biggest1998){
                      biggest1998=ends[2];
                    }
                    if(ends[3]>=biggest1998){
                      biggest1998=ends[3];
                    }
                    if(ends[4]>=biggest1998){
                      biggest1998=ends[4];
                    }
                    if(ends[5]>=biggest1998){
                      biggest1998=ends[5];
                    }
                    if(biggest1998 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                }
                else {
                  S654=1;
                  System.out.println("Manual mode");//sysj\controller.sysj line: 72, column: 11
                  thread1999(tdone,ends);
                  thread2000(tdone,ends);
                  thread2001(tdone,ends);
                  thread2002(tdone,ends);
                  int biggest2003 = 0;
                  if(ends[2]>=biggest2003){
                    biggest2003=ends[2];
                  }
                  if(ends[3]>=biggest2003){
                    biggest2003=ends[3];
                  }
                  if(ends[4]>=biggest2003){
                    biggest2003=ends[4];
                  }
                  if(ends[5]>=biggest2003){
                    biggest2003=ends[5];
                  }
                  if(biggest2003 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                S656=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
