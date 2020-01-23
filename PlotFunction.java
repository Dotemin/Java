import java.awt.Color;
import java.awt.Graphics;

import jpb.DrawableFrame;

public class PlotFunction {
    DrawableFrame frame;
    Graphics graph;
    int width;
    int height;
    
    public PlotFunction(String title, int myWidth, int myHeight) {
        width=myWidth;
        height=myHeight;
        frame=new DrawableFrame(title);
        frame.setVisible(true);
        frame.setSize(width, height);
        graph=frame.getGraphicsContext();
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public DrawableFrame getFrame(){
        return frame;
    }
    
    public Graphics getGraphics(){
        return graph;
    }
    
    public void drawAxis(double maxVal){
        int middleX=(int) (0.5*width);
        int middleY=(int) (0.5*height);
        int delta=5;
        //Draw x axis
        int x=0;
        int y=middleY;
        while(x<=width){
            graph.drawLine(x, y, x+delta, y);
            x=x+delta;
            frame.repaint();
        }
        //Draw ticks in X axis
        int tickX=-middleX;
        int tickLenght=5;
        int deltaTick=(int)(0.5*width/(2*maxVal));
        x=0;
        y=middleY;
        double tickVal=-maxVal;
        while (tickX<=(int)(width/2)){
            graph.drawLine(x,y-tickLenght,x,y+tickLenght);
            if (tickVal!=0) graph.drawString(Double.toString(tickVal), x, y-tickLenght+20);
            x=x+deltaTick;
            tickX=tickX+deltaTick;
            tickVal=tickVal+0.5;
            frame.repaint();
        }
        //Draw Y axis
        x=middleX;
        y=0;
        while(y<=height){
            graph.drawLine(x, y, x, y+delta);
            y=y+delta;
            frame.repaint();
        }
        //Draw ticks in Y axis
        int tickY=middleY;
        x=middleX;
        y=0;
        tickVal=maxVal;
        while (tickY>=(int)(-height/2)){
            graph.drawLine(x-tickLenght,y,x+tickLenght,y);
            if (tickVal!=0) graph.drawString(Double.toString(tickVal), x-tickLenght+15, y);
            y=y+deltaTick;
            tickY=tickY-deltaTick;
            tickVal=tickVal-0.5;
            frame.repaint();
        }
    }
    public void drawFunction (int x, double power, double maxVal){
        int delta=5;
        int dep=(int)(width/2);
        graph.setColor(Color.red);
        while (x<= width){
            double xVal= (x-dep)*((2*maxVal)/width);
            double yVal=Math.pow(xVal,power);
            int y=dep+(int) ((-yVal*height)/(2*maxVal));  
            int xNext=x+delta;
            double xValNext=(xNext-dep)*((2*maxVal)/width);
            double yValNext=Math.pow(xValNext,power);
            int yNext=dep+(int) ((-yValNext*height)/(2*maxVal));  
            graph.drawLine(x, y, xNext, yNext);
            x=xNext;
            frame.repaint();
        }
    }
    public static void main(String[] args){
        PlotFunction pf=new PlotFunction("Plot function", 300, 300);
        pf.drawAxis(2.5);
        pf.drawFunction(0, 3,2.5);   
        }
}
